CREATE TABLE `t_book` (
                          `id` bigint(20) NOT NULL AUTO_INCREMENT,
                          `author` varchar(255) DEFAULT NULL,
                          `create_time` datetime(6) DEFAULT NULL,
                          `update_time` datetime(6) DEFAULT NULL,
                          `name` varchar(255) DEFAULT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;