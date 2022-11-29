package com.nhnacademy.dbapp.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * CREATE TABLE `LikeAtPost` (
 * 	`post_id`	INTEGER	NOT NULL,
 * 	`user_id`	INTEGER	NOT NULL
 * );
 */

@Getter
@Entity
@Table(name = "LikeAtPost")
@IdClass(LikeAtPost.Pk.class)
public class LikeAtPost {

    //join post
    @Id
    @Column(name = "post_id")
    private Long postId;

    //join user
    @Id
    @Column(name = "user_id")
    private Long userId;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class Pk implements Serializable {
        private Long postId;

        private Long userId;

    }
}
