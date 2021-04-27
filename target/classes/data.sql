DROP TABLE IF EXISTS cart;

CREATE TABLE cart (
  id BIGINT AUTO_INCREMENT NOT NULL,
  product_id BIGINT NOT NULL,
  quantity INT NOT NULL,
  price DOUBLE NOT NULL,
   PRIMARY KEY (`id`)
);

INSERT INTO cart (product_id, quantity, price) VALUES
  (33, 12, 212.65),
  (24, 1, 549.8),
  (65, 3, 645.2),
  (45, 2, 6453);