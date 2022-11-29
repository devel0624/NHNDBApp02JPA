package com.nhnacademy.dbapp.jpa.entity;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * CREATE TABLE `Posts` (
 * 	`post_id`	INTEGER	NOT NULL,
 * 	`title`	VARCHAR(30)	NOT NULL,
 * 	`content`	VARCHAR(2000)	NOT NULL,
 * 	`user_id`	INTEGER	NOT NULL,
 * 	`created_at`	DATETIME	NOT NULL,
 * 	`available`	Boolean	NOT NULL	DEFAULT 1
 * );
 */
@Getter
@Entity
@Table(name = "Posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String title;

    private String content;

    //join user
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "created_at")
    private Timestamp createdAt;

    //join user
    @Column(name = "modify_user_id")
    private Long modifyUserId;

    @Column(name = "modify_at")
    private Timestamp modifyAt;

    private Boolean available;

}
