-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: content_sales_system
-- ------------------------------------------------------
-- Server version	5.7.17-log
use content_sales_system;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_shopping_record`
--

DROP TABLE IF EXISTS `user_shopping_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_shopping_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `contentId` int(11) NOT NULL COMMENT '内容ID',
  `userId` int(11) DEFAULT NULL COMMENT '购买用户ID',
  `buyPrice` double DEFAULT NULL COMMENT '购买时价格',
  `buyNum` int(11) DEFAULT NULL COMMENT '购买数量',
  `buyTime` varchar(30) DEFAULT NULL COMMENT '购买时间',
  PRIMARY KEY (`id`,`contentId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_shopping_record`
--

LOCK TABLES `user_shopping_record` WRITE;
/*!40000 ALTER TABLE `user_shopping_record` DISABLE KEYS */;
INSERT INTO `user_shopping_record` VALUES (1,2,1,234,2,'2018-03-03 13:22'),(2,2,1,234,1,'2018-03-03 13:24'),(3,3,1,66666,1,'2018-03-03 13:24'),(4,1,4,3543,3,'2018-03-03 13:24');
/*!40000 ALTER TABLE `user_shopping_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-03 19:22:07
