package com.myLearnings.security.repository;

import com.myLearnings.security.model.Role;
import com.myLearnings.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByName(String name);
}
