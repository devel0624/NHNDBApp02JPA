package com.nhnacademy.dbapp.jpa.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * CREATE TABLE `LikeAtPost` (
 * 	`post_id`	INTEGER	NOT NULL,
 * 	`user_id`	INTEGER	NOT NULL
 * );
 */

@Getter
@Setter
//@Entity
@Table(name = "LikeAtPost")
public class LikeAtPost {

    @EmbeddedId
    private Pk pk;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class Pk implements Serializable {
        @Column(name = "post_id")
        private Long postId;

        @Column(name = "user_id")
        private Long userId;
    }
}
