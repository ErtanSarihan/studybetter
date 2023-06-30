package com.studybetter.studybetter.utils;

import com.studybetter.studybetter.models.Session;
import com.studybetter.studybetter.models.User;
import com.studybetter.studybetter.repositories.SessionRepository;
import com.studybetter.studybetter.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;

@Component
public class Initializer implements CommandLineRunner {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final SessionRepository sessionRepository;

    @Autowired
    public Initializer(PasswordEncoder passwordEncoder, UserRepository userRepository, SessionRepository sessionRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.sessionRepository = sessionRepository;
    }


    @Override
    public void run(String... args) throws Exception {
//        User user = new User("ertan", passwordEncoder.encode("ertan123"),0, Collections.emptyList());
//        userRepository.save(user);
        User tempUser1 = new User("user1", passwordEncoder.encode("password1"),200, Collections.emptyList());
        userRepository.save(tempUser1);
        User tempUser2  = new User("user2", passwordEncoder.encode("password2"),200, Collections.emptyList());
        userRepository.save(tempUser2);
        User tempUser3 = new User("user3", passwordEncoder.encode("password3"),200, Collections.emptyList());
        userRepository.save(tempUser3);
        User tempUser4 = new User("user4", passwordEncoder.encode("password4"),200, Collections.emptyList());
        userRepository.save(tempUser4);
        User tempUser5 = new User("user5", passwordEncoder.encode("password5"),200, Collections.emptyList());
        userRepository.save(tempUser5);
        User tempUser6 = new User("user6", passwordEncoder.encode("password6"),200, Collections.emptyList());
        userRepository.save(tempUser6);
        User tempUser7 = new User("user7", passwordEncoder.encode("password7"),0, Collections.emptyList());
        userRepository.save(tempUser7);
        User tempUser8 = new User("user8", passwordEncoder.encode("password8"),0, Collections.emptyList());
        userRepository.save(tempUser8);
        User tempUser9 = new User("user9", passwordEncoder.encode("password9"),0, Collections.emptyList());
        userRepository.save(tempUser9);
        User tempUser10 = new User("user10", passwordEncoder.encode("password10"),0, Collections.emptyList());
        userRepository.save(tempUser10);



//        Session tempSession = Session.builder().user(user).duration(Duration.ofMinutes(45)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 25, 2, 17)).build();
//        Session tempSession1 = Session.builder().user(user).duration(Duration.ofMinutes(34)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 22, 1, 33)).build();
//        Session tempSession2 = Session.builder().user(user).duration(Duration.ofMinutes(53)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 3, 12)).build();
//        Session tempSession3 = Session.builder().user(user).duration(Duration.ofMinutes(18)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 12, 27)).build();
//        Session tempSession4 = Session.builder().user(user).duration(Duration.ofMinutes(26)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 24, 15, 37)).build();
//        Session tempSession5 = Session.builder().user(user).duration(Duration.ofMinutes(45)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 25, 5, 32)).build();
//        Session tempSession6 = Session.builder().user(user).duration(Duration.ofMinutes(23)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 26, 7, 45)).build();
//        Session tempSession7 = Session.builder().user(user).duration(Duration.ofMinutes(54)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 12)).build();
//        Session tempSession8 = Session.builder().user(user).duration(Duration.ofMinutes(24)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
//        sessionRepository.save(tempSession);
//        sessionRepository.save(tempSession1);
//        sessionRepository.save(tempSession2);
//        sessionRepository.save(tempSession3);
//        sessionRepository.save(tempSession4);
//        sessionRepository.save(tempSession5);
//        sessionRepository.save(tempSession6);
//        sessionRepository.save(tempSession7);
//        sessionRepository.save(tempSession8);

        Session temp1Session = Session.builder().user(tempUser1).duration(Duration.ofMinutes(30)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 25, 2, 42)).build();
        Session temp1Session1 = Session.builder().user(tempUser1).duration(Duration.ofMinutes(30)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 22, 1, 55)).build();
        Session temp1Session2 = Session.builder().user(tempUser1).duration(Duration.ofMinutes(45)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 3, 35)).build();
        Session temp1Session3 = Session.builder().user(tempUser1).duration(Duration.ofMinutes(45)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 12, 45)).build();
        sessionRepository.save(temp1Session);
        sessionRepository.save(temp1Session1);
        sessionRepository.save(temp1Session2);
        sessionRepository.save(temp1Session3);



        Session temp2Session = Session.builder().user(tempUser2).duration(Duration.ofMinutes(45)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 25, 2, 30)).build();
        Session temp2Session1 = Session.builder().user(tempUser2).duration(Duration.ofMinutes(45)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 22, 1, 30)).build();
        Session temp2Session2 = Session.builder().user(tempUser2).duration(Duration.ofMinutes(60)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 26, 7, 30)).build();
        Session temp2Session3 = Session.builder().user(tempUser2).duration(Duration.ofMinutes(60)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 55)).build();
        Session temp2Session4 = Session.builder().user(tempUser2).duration(Duration.ofMinutes(50)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 55)).build();
        sessionRepository.save(temp2Session);
        sessionRepository.save(temp2Session1);
        sessionRepository.save(temp2Session2);
        sessionRepository.save(temp2Session3);
        sessionRepository.save(temp2Session4);



        Session temp3Session = Session.builder().user(tempUser3).duration(Duration.ofMinutes(20)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 25, 2, 17)).build();
        Session temp3Session1 = Session.builder().user(tempUser3).duration(Duration.ofMinutes(30)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 22, 1, 33)).build();
        Session temp3Session2 = Session.builder().user(tempUser3).duration(Duration.ofMinutes(20)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 3, 12)).build();
        Session temp3Session3 = Session.builder().user(tempUser3).duration(Duration.ofMinutes(50)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 12, 27)).build();
        Session temp3Session4 = Session.builder().user(tempUser3).duration(Duration.ofMinutes(30)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 12)).build();
        Session temp3Session5 = Session.builder().user(tempUser3).duration(Duration.ofMinutes(45)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
        sessionRepository.save(temp3Session);
        sessionRepository.save(temp3Session1);
        sessionRepository.save(temp3Session2);
        sessionRepository.save(temp3Session3);
        sessionRepository.save(temp3Session4);
        sessionRepository.save(temp3Session5);


        Session temp4Session = Session.builder().user(tempUser4).duration(Duration.ofMinutes(40)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 25, 2, 17)).build();
        Session temp4Session1 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(45)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 22, 1, 33)).build();
        Session temp4Session2 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(35)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 3, 12)).build();
        Session temp4Session3 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(35)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 12, 27)).build();
        Session temp4Session4 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(35)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 24, 15, 37)).build();
        Session temp4Session5 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(30)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 25, 5, 32)).build();
        Session temp4Session6 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(35)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 26, 7, 45)).build();
        Session temp4Session7 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(35)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 12)).build();
        Session temp4Session8 = Session.builder().user(tempUser4).duration(Duration.ofMinutes(50)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
        sessionRepository.save(temp4Session);
        sessionRepository.save(temp4Session1);
        sessionRepository.save(temp4Session2);
        sessionRepository.save(temp4Session3);
        sessionRepository.save(temp4Session4);
        sessionRepository.save(temp4Session5);
        sessionRepository.save(temp4Session6);
        sessionRepository.save(temp4Session7);
        sessionRepository.save(temp4Session8);


        Session temp5Session = Session.builder().user(tempUser5).duration(Duration.ofMinutes(80)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 25, 2, 17)).build();
        Session temp5Session1 = Session.builder().user(tempUser5).duration(Duration.ofMinutes(80)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 22, 1, 33)).build();
        Session temp5Session2 = Session.builder().user(tempUser5).duration(Duration.ofMinutes(80)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 3, 12)).build();
        Session temp5Session3 = Session.builder().user(tempUser5).duration(Duration.ofMinutes(40)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 25, 5, 32)).build();
        Session temp5Session4 = Session.builder().user(tempUser5).duration(Duration.ofMinutes(80)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 26, 7, 45)).build();
        Session temp5Session5 = Session.builder().user(tempUser5).duration(Duration.ofMinutes(50)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 12)).build();
        Session temp5Session6 = Session.builder().user(tempUser5).duration(Duration.ofMinutes(50)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
        sessionRepository.save(temp5Session);
        sessionRepository.save(temp5Session1);
        sessionRepository.save(temp5Session2);
        sessionRepository.save(temp5Session3);
        sessionRepository.save(temp5Session4);
        sessionRepository.save(temp5Session5);
        sessionRepository.save(temp5Session6);


        Session temp6Session = Session.builder().user(tempUser6).duration(Duration.ofMinutes(40)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 25, 2, 17)).build();
        Session temp6Session1 = Session.builder().user(tempUser6).duration(Duration.ofMinutes(40)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 22, 1, 33)).build();
        Session temp6Session2 = Session.builder().user(tempUser6).duration(Duration.ofMinutes(20)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 3, 12)).build();
        sessionRepository.save(temp6Session);
        sessionRepository.save(temp6Session1);
        sessionRepository.save(temp6Session2);


        Session temp7Session = Session.builder().user(tempUser7).duration(Duration.ofMinutes(50)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 26, 7, 45)).build();
        Session temp7Session1 = Session.builder().user(tempUser7).duration(Duration.ofMinutes(120)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 12)).build();
        Session temp7Session2 = Session.builder().user(tempUser7).duration(Duration.ofMinutes(30)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
        sessionRepository.save(temp7Session);
        sessionRepository.save(temp7Session1);
        sessionRepository.save(temp7Session2);


        Session temp8Session = Session.builder().user(tempUser8).duration(Duration.ofMinutes(50)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 23, 12, 27)).build();
        Session temp8Session1 = Session.builder().user(tempUser8).duration(Duration.ofMinutes(45)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 24, 15, 37)).build();
        Session temp8Session2 = Session.builder().user(tempUser8).duration(Duration.ofMinutes(40)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 25, 5, 32)).build();
        Session temp8Session3 = Session.builder().user(tempUser8).duration(Duration.ofMinutes(35)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 26, 7, 45)).build();
        Session temp8Session4 = Session.builder().user(tempUser8).duration(Duration.ofMinutes(35)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 12)).build();
        Session temp8Session5 = Session.builder().user(tempUser8).duration(Duration.ofMinutes(50)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
        sessionRepository.save(temp8Session);
        sessionRepository.save(temp8Session1);
        sessionRepository.save(temp8Session2);
        sessionRepository.save(temp8Session3);
        sessionRepository.save(temp8Session4);
        sessionRepository.save(temp8Session5);


        Session temp9Session = Session.builder().user(tempUser9).duration(Duration.ofMinutes(60)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 5, 12)).build();
        Session temp9Session1 = Session.builder().user(tempUser9).duration(Duration.ofMinutes(80)).successStatus(false).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
        sessionRepository.save(temp9Session);
        sessionRepository.save(temp9Session1);

        Session temp10Session = Session.builder().user(tempUser10).duration(Duration.ofMinutes(100)).successStatus(true).startedAt(LocalDateTime.of(2023, 05, 27, 7, 12)).build();
        sessionRepository.save(temp10Session);

    }
}
