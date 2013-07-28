/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.6.11-log : Database - price_count
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`price_count` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `price_count`;

/*Table structure for table `_bill` */

DROP TABLE IF EXISTS `_bill`;

CREATE TABLE `_bill` (
  `_id` varchar(32) NOT NULL,
  `_personId` varchar(32) NOT NULL,
  `_price` decimal(5,2) NOT NULL,
  `_active` tinyint(4) NOT NULL DEFAULT '1',
  `_share_type` tinyint(4) NOT NULL DEFAULT '1',
  `_home_id` varchar(32) NOT NULL,
  `_create_date` bigint(20) NOT NULL,
  PRIMARY KEY (`_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
