-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: projectdb
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `studenttab`
--

DROP TABLE IF EXISTS `studenttab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `studenttab` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) DEFAULT NULL,
  `scourse` varchar(30) DEFAULT NULL,
  `sfee` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studenttab`
--

LOCK TABLES `studenttab` WRITE;
/*!40000 ALTER TABLE `studenttab` DISABLE KEYS */;
INSERT INTO `studenttab` VALUES (1,'John','Java Web Services',30),(3,'JohnyMan','Java Web New',30),(4,'JohnyMan','Java Web New',30),(5,'JohnyMan','Java Web New',32),(6,'JohnyMan','Java Web New',32),(7,'JohnyMan','Java Web New',32),(8,'JohnyMan','Java Web New',32),(9,'Anagnwstakis','Codehub',2000),(10,'Anagnwstakis','Codehub',2000),(11,'Anagnwstakis','Codehub',2000),(12,'Anagnwstakis','Codehub',2000),(13,'Anagnwstakis','Codehub',2000),(14,'Anagnwstakis','Codehub',2000),(15,'Anagnwstakis','Codehub',2000),(16,'Anagnwstakis','Codehub',2000),(17,'ΚςΣΤΑS','bEROUKAS',400),(18,'ΚςΣΤΑS','bEROUKAS',400),(19,'ΚςΣΤΑS','bEROUKAS',400);
/*!40000 ALTER TABLE `studenttab` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-05  0:39:47
