CREATE DATABASE  IF NOT EXISTS `dragon_cave`;
USE `dragon_cave`;

DROP TABLE IF EXISTS `dragon`;
CREATE TABLE `dragon` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);