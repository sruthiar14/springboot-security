package com.myLearnings.security.repository;

import com.myLearnings.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsernameOrEmail(String name,String email);

    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
