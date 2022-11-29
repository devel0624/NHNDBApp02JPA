CREATE TABLE `Users` (
     `user_id`	INTEGER	NOT NULL,
     `username`	VARCHAR(20)	NOT NULL,
     `password`	VARCHAR(30)	NOT NULL,
     `created_at`	DATETIME	NOT NULL,
     `admin`	Boolean	NOT NULL	DEFAULT 0
);

CREATE TABLE `Posts` (
     `post_id`	INTEGER	NOT NULL,
     `title`	VARCHAR(30)	NOT NULL,
     `content`	VARCHAR(2000)	NOT NULL,
     `write_user_id`	INTEGER	NOT NULL,
     `created_at`	DATETIME	NOT NULL,
     `isDeleted`	Boolean	NOT NULL	DEFAULT 0,
     `modify_user_id`	INTEGER	NULL,
     `modify_at`	DATETIME	NULL
);

CREATE TABLE `Replies` (
       `reply_id`	INTEGER	NOT NULL,
       `post_id`	INTEGER	NOT NULL,
       `user_id`	INTEGER	NOT NULL,
       `content`	VARCHAR(500)	NOT NULL,
       `created_at`	DATETIME	NOT NULL,
       `isDeleted`	Boolean	NOT NULL	DEFAULT 0
);

CREATE TABLE `LikeAtPost` (
      `post_id`	INTEGER	NOT NULL,
      `user_id`	INTEGER	NOT NULL
);




