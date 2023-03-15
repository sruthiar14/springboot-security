package com.myLearnings.security.repository;

import com.myLearnings.security.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
