CREATE DATABASE  IF NOT EXISTS `dragon_cave`;
USE `dragon_cave`;

DROP TABLE IF EXISTS `player_achievement`;
CREATE TABLE `player_achievement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `player_id` int(11) NOT NULL,
  `achievement_id`, int(11) NOT NULL,
  `date_achieved` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);