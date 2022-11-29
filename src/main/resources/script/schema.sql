create table LikeAtPost
(
    post_id int not null,
    user_id int not null,
    primary key (post_id, user_id)
);

create table Posts
(
    post_id        int                  not null
        primary key,
    title          varchar(30)          not null,
    content        varchar(2000)        not null,
    write_user_id  int                  not null,
    created_at     datetime             not null,
    isDeleted      tinyint(1) default 0 not null,
    modify_user_id int                  null,
    modify_at      datetime             null
);

create table Replies
(
    reply_id   int                  not null,
    post_id    int                  not null,
    user_id    int                  not null,
    content    varchar(500)         not null,
    created_at datetime             not null,
    isDeleted  tinyint(1) default 0 not null,
    primary key (reply_id, post_id)
);

create table Users
(
    user_id    int                  not null
        primary key,
    username   varchar(20)          not null,
    password   varchar(30)          not null,
    created_at datetime             not null,
    admin      tinyint(1) default 0 not null
);

