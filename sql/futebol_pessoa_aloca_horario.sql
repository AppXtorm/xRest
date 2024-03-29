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
-- Table structure for table `pessoa_aloca_horario`
--

DROP TABLE IF EXISTS `pessoa_aloca_horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa_aloca_horario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pessoa_cpf` varchar(11) NOT NULL,
  `empresa_possui_horario_id` int(11) NOT NULL,
  `dia` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `pessoa_cpf` (`pessoa_cpf`),
  KEY `empresa_possui_horario_id` (`empresa_possui_horario_id`),
  CONSTRAINT `pessoa_aloca_horario_ibfk_1` FOREIGN KEY (`pessoa_cpf`) REFERENCES `pessoa` (`cpf`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `pessoa_aloca_horario_ibfk_2` FOREIGN KEY (`empresa_possui_horario_id`) REFERENCES `empresa_possui_horario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa_aloca_horario`
--

LOCK TABLES `pessoa_aloca_horario` WRITE;
/*!40000 ALTER TABLE `pessoa_aloca_horario` DISABLE KEYS */;
/*!40000 ALTER TABLE `pessoa_aloca_horario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-01 16:54:48
