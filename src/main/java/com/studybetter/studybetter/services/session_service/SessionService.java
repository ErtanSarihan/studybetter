package com.studybetter.studybetter.services.session_service;


import com.studybetter.studybetter.models.Session;

import java.util.List;

public interface SessionService {

    boolean addSession(Session session);

    boolean giveSessionReward(int reward);

    List<Session> getAllSessions();

}
