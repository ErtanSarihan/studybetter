package com.studybetter.studybetter.controllers;

import com.studybetter.studybetter.models.Session;
import com.studybetter.studybetter.services.session_service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studybetter-api/v0/sessions")
public class SessionController {

    private final SessionService sessionService;

    @Autowired
    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping()
    public boolean addSession(@RequestBody Session session) {
        return sessionService.addSession(session);
    }


    @PostMapping(value = "/reward/{reward}")
    public boolean giveSessionReward(@PathVariable int reward) {
        return sessionService.giveSessionReward(reward);
    }

}
