package com.nhnacademy.dbapp.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
@Setter
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
    private LocalDateTime createdAt;

    //join user
    @Column(name = "modify_user_id")
    private Long modifyUserId;

    @Column(name = "modify_at")
    private LocalDateTime modifyAt;

    private Boolean available;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User modifyUser;

    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "post_post_id")
    private List<Reply> replies;

}
