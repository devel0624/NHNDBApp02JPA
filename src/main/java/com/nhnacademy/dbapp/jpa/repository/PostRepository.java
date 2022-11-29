package com.nhnacademy.dbapp.jpa.repository;

import com.nhnacademy.dbapp.jpa.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    
    //작성자로 게시물 검색
    List<Post> findByWriteUser_Username(String username);
    void deletePostByPostId(Long postId);

}