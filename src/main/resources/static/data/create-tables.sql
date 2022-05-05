CREATE DATABASE IF NOT EXISTS kijani;

USE kijani;

CREATE TABLE IF NOT EXISTS `categories`
(
    `category_id`   int NOT NULL AUTO_INCREMENT,
    `category_name` text,
    PRIMARY KEY (`category_id`),
    UNIQUE KEY `categories_category_id_uindex` (`category_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `ecolabels`
(
    `ecolabel_id` int NOT NULL AUTO_INCREMENT,
    `certificate` text,
    PRIMARY KEY (`ecolabel_id`),
    UNIQUE KEY `ecolabels_ecolabel_id_uindex` (`ecolabel_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `product`
(
    `product_id`       int NOT NULL AUTO_INCREMENT,
    `co2_mesurability` varchar(255) DEFAULT NULL,
    `created`          datetime(6)  DEFAULT NULL,
    `description`      varchar(255) DEFAULT NULL,
    `ecolabels`        varchar(255) DEFAULT NULL,
    `item_number`      text,
    `link`             varchar(255) DEFAULT NULL,
    `name`             varchar(255) DEFAULT NULL,
    `picture`          varchar(255) DEFAULT NULL,
    `sub_category_id`  varchar(255) DEFAULT NULL,
    `supplier_id`      int          DEFAULT NULL,
    `tests`            varchar(255) DEFAULT NULL,
    PRIMARY KEY (`product_id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `product_categories`
(
    `product_categories_id` int NOT NULL AUTO_INCREMENT,
    `product_id`            int DEFAULT NULL,
    `sub_category_id`       int DEFAULT NULL,
    PRIMARY KEY (`product_categories_id`),
    UNIQUE KEY `product_categories_product_categories_id_uindex` (`product_categories_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `roles`
(
    `role_id`  int NOT NULL AUTO_INCREMENT,
    `admin`    int DEFAULT NULL,
    `customer` int DEFAULT NULL,
    `supplier` int DEFAULT NULL,
    PRIMARY KEY (`role_id`),
    UNIQUE KEY `roles_role_id_uindex` (`role_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `sub_categories`
(
    `sub_category_id`   int NOT NULL AUTO_INCREMENT,
    `category_id`       int DEFAULT NULL,
    `sub_category_name` text,
    PRIMARY KEY (`sub_category_id`),
    UNIQUE KEY `sub_categories_sub_category_id_uindex` (`sub_category_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `supplier_ecolabel`
(
    `supplier_ecolabel_id` int NOT NULL AUTO_INCREMENT,
    `supplier_id`          int DEFAULT NULL,
    `ecolabel_id`          int DEFAULT NULL,
    PRIMARY KEY (`supplier_ecolabel_id`),
    UNIQUE KEY `supplier_ecolabel_supplier_ecolabel_id_uindex` (`supplier_ecolabel_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `suppliers`
(
    `supplier_id`           int NOT NULL AUTO_INCREMENT,
    `ecolabels`             varchar(255) DEFAULT NULL,
    `environmental_profile` varchar(255) DEFAULT NULL,
    `freight`               varchar(255) DEFAULT NULL,
    `name`                  varchar(255) DEFAULT NULL,
    `packaging`             varchar(255) DEFAULT NULL,
    `role_id`               int          DEFAULT NULL,
    PRIMARY KEY (`supplier_id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `user_roles`
(
    `user_role_id` int NOT NULL AUTO_INCREMENT,
    `user_id`      int DEFAULT NULL,
    `role_id`      int DEFAULT NULL,
    PRIMARY KEY (`user_role_id`),
    UNIQUE KEY `user_roles_user_role_id_uindex` (`user_role_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `users`
(
    `user_id`  int NOT NULL AUTO_INCREMENT,
    `name`     text,
    `email`    int DEFAULT NULL,
    `password` int NOT NULL,
    PRIMARY KEY (`user_id`),
    UNIQUE KEY `Users_user_id_uindex` (`user_id`),
    UNIQUE KEY `Users_email_uindex` (`email`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
