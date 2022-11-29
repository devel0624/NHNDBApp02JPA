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
 * CREATE TABLE `Users` (
 * 	`user_id`	INTEGER	NOT NULL,
 * 	`username`	VARCHAR(20)	NOT NULL,
 * 	`password`	VARCHAR(30)	NOT NULL,
 * 	`created_at`	DATETIME	NOT NULL,
 * 	`admin`	Boolean	 NOT NULL	DEFAULT 0
 * );
 */

@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String password;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    private Boolean admin;

    //Mapped
    @OneToMany(mappedBy = "writeUser")
    private List<Post> writePosts;

    @OneToMany(mappedBy = "modifyUser")
    private List<Post> modifyPosts;

    @OneToMany(mappedBy = "user")
    private List<Reply> replies;



}
