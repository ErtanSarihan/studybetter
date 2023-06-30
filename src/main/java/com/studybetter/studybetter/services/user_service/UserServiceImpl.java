package com.studybetter.studybetter.services.user_service;

import com.studybetter.studybetter.exceptions.UserDoesntExistsException;
import com.studybetter.studybetter.exceptions.UsernameAlreadyInUseException;
import com.studybetter.studybetter.models.LeaderboardData;
import com.studybetter.studybetter.models.User;
import com.studybetter.studybetter.repositories.UserRepository;
import com.studybetter.studybetter.security.models.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean registerUser(User user) {
        if (userRepository.getUserByUsername(user.getUsername()) != null) {
            throw new UsernameAlreadyInUseException();
        } else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return true;
        }
    }

    @Override
    public User getUser(String username) {
        if (userRepository.getUserByUsername(username) == null) {
            throw new UserDoesntExistsException();
        } else {
            return userRepository.getUserByUsername(username);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<LeaderboardData> getLeaderboard() {
        List<User> users = userRepository.findAll();
        Comparator<User> sessionDurationComparator = Comparator.comparing(
                User::getTotalSuccessfulSessionDuration
        ).reversed();
        users.sort(sessionDurationComparator);
        List<LeaderboardData> leaderboardDataList = users.stream()
                .map(user -> new LeaderboardData(user.getUsername(), user.getTotalSuccessfulSessionDuration())).toList();
        return leaderboardDataList.subList(0, Math.min(users.size(), 5));
    }

    @Override
    public int getOwnedCoins() {
        String username = ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
        return userRepository.getUserByUsername(username).getCoins();
    }

    @Override
    public boolean debitCoins(int amount) {
        String username = ((UserPrinciple) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
        User user = userRepository.getUserByUsername(username);
        int coinsOwned = user.getCoins();
        if (coinsOwned >= amount) {
            coinsOwned -= amount;
            user.setCoins(coinsOwned);
            userRepository.save(user);
            return true;
        }
        return false;
    }
}
