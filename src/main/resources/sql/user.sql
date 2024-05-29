create table user
(
    user_id            int auto_increment
        primary key,
    email              varchar(256) not null,
    password           varchar(256) not null,
    created_date       timestamp    not null,
    last_modified_date timestamp    not null,
    constraint email
        unique (email)
);

INSERT INTO mysql_bookshop.user (user_id, email, password, created_date, last_modified_date) VALUES (1, 'twcch1218@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-26 20:20:22', '2024-05-26 20:20:22');
INSERT INTO mysql_bookshop.user (user_id, email, password, created_date, last_modified_date) VALUES (2, 'test@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-26 21:51:44', '2024-05-26 21:51:44');
INSERT INTO mysql_bookshop.user (user_id, email, password, created_date, last_modified_date) VALUES (3, 'test1@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:17', '2024-05-29 20:15:17');
INSERT INTO mysql_bookshop.user (user_id, email, password, created_date, last_modified_date) VALUES (4, 'test2@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:24', '2024-05-29 20:15:24');
INSERT INTO mysql_bookshop.user (user_id, email, password, created_date, last_modified_date) VALUES (5, 'test3@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:40', '2024-05-29 20:15:40');
INSERT INTO mysql_bookshop.user (user_id, email, password, created_date, last_modified_date) VALUES (6, 'test4@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:54', '2024-05-29 20:15:54');
