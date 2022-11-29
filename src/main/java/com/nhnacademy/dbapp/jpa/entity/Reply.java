package com.nhnacademy.dbapp.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

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
@Setter
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
    private LocalDateTime createdAt;

    private Boolean available;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}