create table user
(
    user_id            int auto_increment primary key,
    email              varchar(256) not null,
    password           varchar(256) not null,
    created_date       timestamp    not null,
    last_modified_date timestamp    not null,
    constraint email
        unique (email)
);

INSERT INTO user (email, password, created_date, last_modified_date)
VALUES ('twcch1218@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-26 20:20:22', '2024-05-26 20:20:22');
INSERT INTO user (email, password, created_date, last_modified_date)
VALUES ('test@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-26 21:51:44', '2024-05-26 21:51:44');
INSERT INTO user (email, password, created_date, last_modified_date)
VALUES ('test1@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:17', '2024-05-29 20:15:17');
INSERT INTO user (email, password, created_date, last_modified_date)
VALUES ('test2@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:24', '2024-05-29 20:15:24');
INSERT INTO user (email, password, created_date, last_modified_date)
VALUES ('test3@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:40', '2024-05-29 20:15:40');
INSERT INTO user (email, password, created_date, last_modified_date)
VALUES ('test4@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', '2024-05-29 20:15:54', '2024-05-29 20:15:54');
