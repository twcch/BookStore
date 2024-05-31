create table order_item
(
    order_item_id int auto_increment primary key,
    order_id      int not null,
    product_id    int not null,
    quantity      int not null,
    amount        int not null
);

INSERT INTO order_item (order_id, product_id, quantity, amount) VALUES (1, 4, 2, 60);
INSERT INTO order_item (order_id, product_id, quantity, amount) VALUES (1, 6, 5, 50);
INSERT INTO order_item (order_id, product_id, quantity, amount) VALUES (1, 7, 1, 100000);
INSERT INTO order_item (order_id, product_id, quantity, amount) VALUES (4, 1, 3, 2997);
