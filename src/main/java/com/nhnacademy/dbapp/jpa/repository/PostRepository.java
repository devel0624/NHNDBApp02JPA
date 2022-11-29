package com.nhnacademy.dbapp.jpa.repository;

import com.nhnacademy.dbapp.jpa.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}