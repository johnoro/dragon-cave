CREATE DATABASE  IF NOT EXISTS `dragon_cave`;
USE `dragon_cave`;

DROP TABLE IF EXISTS `dragon`;
CREATE TABLE `dragon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type_id` int(11) NOT NULL,
  `cave_id` int(11) DEFAULT 0,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);