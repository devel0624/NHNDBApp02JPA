package com.nhnacademy.dbapp.jpa.repository;

import com.nhnacademy.dbapp.jpa.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

    //게시물 번호로 댓글 카운트
    int countByPost_PostId(Long postId);
    List<Reply> getRepliesByPost_PostId(Long postId);

    void deleteReplyByReplyId(Long replyId);
}