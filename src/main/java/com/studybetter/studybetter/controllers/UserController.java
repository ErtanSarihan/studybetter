package com.studybetter.studybetter.controllers;

import com.studybetter.studybetter.models.LeaderboardData;
import com.studybetter.studybetter.models.Session;
import com.studybetter.studybetter.models.User;
import com.studybetter.studybetter.services.session_service.SessionService;
import com.studybetter.studybetter.services.user_service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studybetter-api/v0/user")
public class UserController {

    private final UserService userService;
    private final SessionService sessionService;

    @Autowired
    public UserController(UserService userService, SessionService sessionService) {
        this.userService = userService;
        this.sessionService = sessionService;
    }

    @PostMapping("/register")
    public boolean registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }


    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/sessions")
    public List<Session> getAllSessions(){
        return sessionService.getAllSessions();
    }

    @GetMapping("/leaderboard")
    public List<LeaderboardData> getLeaderboard(){
        return userService.getLeaderboard();
    }


    @GetMapping("/coins")
    public int getOwnedCoins(){
        return userService.getOwnedCoins();
    }

    @PostMapping(value = "/coins/{amount}")
    public boolean debitCoins(@PathVariable int amount){
        return userService.debitCoins(amount);
    }

}
