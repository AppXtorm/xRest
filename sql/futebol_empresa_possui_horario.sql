-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: futebol
-- ------------------------------------------------------
-- Server version	5.6.24-enterprise-commercial-advanced-log

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
-- Table structure for table `empresa_possui_horario`
--

DROP TABLE IF EXISTS `empresa_possui_horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa_possui_horario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `empresa_cnpj` varchar(14) NOT NULL,
  `horario_id` int(11) NOT NULL,
  `dia` date NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `empresa_cnpj` (`empresa_cnpj`),
  KEY `horario_id` (`horario_id`),
  KEY `status` (`status`),
  CONSTRAINT `empresa_possui_horario_ibfk_1` FOREIGN KEY (`empresa_cnpj`) REFERENCES `empresa` (`cnpj`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `empresa_possui_horario_ibfk_2` FOREIGN KEY (`horario_id`) REFERENCES `horario` (`id`),
  CONSTRAINT `empresa_possui_horario_ibfk_3` FOREIGN KEY (`status`) REFERENCES `status_quadra` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa_possui_horario`
--

LOCK TABLES `empresa_possui_horario` WRITE;
/*!40000 ALTER TABLE `empresa_possui_horario` DISABLE KEYS */;
INSERT INTO `empresa_possui_horario` VALUES (6,'58022771000123',1,'2015-07-01',3),(9,'58022771000123',3,'2015-07-01',2);
/*!40000 ALTER TABLE `empresa_possui_horario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-01 16:54:47
