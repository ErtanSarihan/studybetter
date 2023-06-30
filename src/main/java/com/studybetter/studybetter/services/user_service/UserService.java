package com.studybetter.studybetter.services.user_service;

import com.studybetter.studybetter.models.LeaderboardData;
import com.studybetter.studybetter.models.User;

import java.util.List;

public interface UserService {

    boolean registerUser(User user);

    User getUser(String username);

    int getOwnedCoins();

    List<User> getAllUsers();

    boolean debitCoins(int amount);

    List<LeaderboardData> getLeaderboard();
}
