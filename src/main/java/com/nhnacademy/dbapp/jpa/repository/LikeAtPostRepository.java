package com.nhnacademy.dbapp.jpa.repository;

import com.nhnacademy.dbapp.jpa.entity.LikeAtPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeAtPostRepository extends JpaRepository<LikeAtPost, LikeAtPost.Pk> {
    int countLikeAtPostByPost_PostId(Long postId);
}