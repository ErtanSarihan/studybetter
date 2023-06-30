package com.studybetter.studybetter.repositories;

import com.studybetter.studybetter.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User getUserByUsername(String username);


}
