package com.nhnacademy.dbapp.jpa.repository;

import com.nhnacademy.dbapp.jpa.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}