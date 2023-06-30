package com.studybetter.studybetter.repositories;

import com.studybetter.studybetter.models.Session;
import com.studybetter.studybetter.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<Session, String> {

    List<Session> getSessionsByUser(User user);



}
