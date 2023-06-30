package com.studybetter.studybetter.services.session_service;

import com.studybetter.studybetter.models.Session;
import com.studybetter.studybetter.models.User;
import com.studybetter.studybetter.repositories.SessionRepository;
import com.studybetter.studybetter.repositories.UserRepository;
import com.studybetter.studybetter.security.models.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {

    private final SessionRepository sessionRepository;
    private final UserRepository userRepository;

    @Autowired
    public SessionServiceImpl(SessionRepository sessionRepository, UserRepository userRepository) {
        this.sessionRepository = sessionRepository;
        this.userRepository = userRepository;
    }


    @Override
    public boolean addSession(Session session) {
        if ( ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername() != null){
            String username = ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
            Session tempSession = new Session(session.getId(), userRepository.getUserByUsername(username), session.getStartedAt(), session.getDuration(), session.isSuccessStatus());
            sessionRepository.save(tempSession);
//            sessionRepository.save(tempSession);
            return true;
        }else {
            return false;
        }
    }


    @Override
    public boolean giveSessionReward(int reward) {
        if ( ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername() != null){
            String username = ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
            User user = userRepository.getUserByUsername(username);
            user.setCoins(user.getCoins() + reward);
            userRepository.save(user);
//            sessionRepository.save(tempSession);  getAllSessions endpointini yazıp database de neler var kontrol etmem lazım
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Session> getAllSessions() {
        if ( ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername() != null){
            String username = ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
            return userRepository.getUserByUsername(username).getSessions();
        }else {
            return new ArrayList<>();
        }
    }
}
