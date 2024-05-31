create table `order`
(
    order_id           int auto_increment primary key,
    user_id            int       not null,
    total_amount       int       not null,
    created_date       timestamp not null,
    last_modified_date timestamp not null
);

INSERT INTO `order` (user_id, total_amount, created_date, last_modified_date)
VALUES (6, 100110, '2022-06-02 16:51:49', '2022-06-02 16:51:49');
INSERT INTO `order` (user_id, total_amount, created_date, last_modified_date)
VALUES (1, 2997, '2024-05-29 20:23:09', '2024-05-29 20:23:09');
