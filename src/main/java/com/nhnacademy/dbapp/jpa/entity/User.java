package com.nhnacademy.dbapp.jpa.entity;

import lombok.Getter;

import javax.persistence.*;
import java.sql.Timestamp;

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
    private Timestamp createdAt;

    private Boolean admin;

}
