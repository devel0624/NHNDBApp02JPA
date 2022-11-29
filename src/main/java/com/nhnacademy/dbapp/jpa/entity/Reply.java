package com.nhnacademy.dbapp.jpa.entity;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * CREATE TABLE `Replies` (
 * 	`reply_id`	INTEGER	NOT NULL,
 * 	`post_id`	INTEGER	NOT NULL,
 * 	`user_id`	INTEGER	NOT NULL,
 * 	`content`	VARCHAR(500)	NOT NULL,
 * 	`created_at`	DATETIME	NOT NULL,
 * 	`available`	Boolean	NOT NULL	DEFAULT 1
 * );
 */

@Getter
@Entity
@Table(name = "Replies")
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long replyId;

    //join post
    @Column(name = "post_id")
    private Long postId;

    //join user
    @Column(name = "user_id")
    private Long userId;

    private String content;

    @Column(name = "created_at")
    private Timestamp createdAt;

    private Boolean available;

}