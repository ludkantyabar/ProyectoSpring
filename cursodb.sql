-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: cursodb
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `dni` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `modalidad` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  `horario_id` bigint DEFAULT NULL,
  `profesor_id` bigint DEFAULT NULL,
  `sede_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjgs9apnc93adot4nvc9jecdi0` (`horario_id`),
  KEY `FK2w3lfylwy3y81e5kubeyu4t3k` (`profesor_id`),
  KEY `FK9aawp2gxpu36q0owki7q7bj9s` (`sede_id`),
  CONSTRAINT `FK2w3lfylwy3y81e5kubeyu4t3k` FOREIGN KEY (`profesor_id`) REFERENCES `profesor` (`id`),
  CONSTRAINT `FK9aawp2gxpu36q0owki7q7bj9s` FOREIGN KEY (`sede_id`) REFERENCES `sede` (`id`),
  CONSTRAINT `FKjgs9apnc93adot4nvc9jecdi0` FOREIGN KEY (`horario_id`) REFERENCES `horario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'Aprende los conceptos básicos de programación con Python.','Presencial','Inicial','Introducción a la Programación',150,1,1,1),(2,'Diseño y creación de sitios web con HTML, CSS y JavaScript.','Virtual','Intermedio','Desarrollo Web Frontend',180,2,2,2),(3,'Modelado, diseño y consultas SQL en sistemas de bases de datos.','Presencial','Intermedio','Bases de Datos',200,3,3,3),(4,'Fundamentos de seguridad informática y protección de datos.','Virtual','Inicial','Ciberseguridad Básica',170,4,4,4),(5,'Introducción al aprendizaje automático y redes neuronales.','Presencial','Avanzado','Inteligencia Artificial',250,5,5,5);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `horario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `dia` varchar(255) DEFAULT NULL,
  `hora_fin` varchar(255) DEFAULT NULL,
  `hora_inicio` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario`
--

LOCK TABLES `horario` WRITE;
/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
INSERT INTO `horario` VALUES (1,'Lunes','10:00','08:00'),(2,'Martes','12:00','10:00'),(3,'Miércoles','16:00','14:00'),(4,'Jueves','18:00','16:00'),(5,'Viernes','20:00','18:00');
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inscripcion`
--

DROP TABLE IF EXISTS `inscripcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inscripcion` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `alumno_id` bigint DEFAULT NULL,
  `curso_id` bigint DEFAULT NULL,
  `horario_id` bigint DEFAULT NULL,
  `profesor_id` bigint DEFAULT NULL,
  `sede_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKndj1y0din8ba2lkfntabm6476` (`alumno_id`),
  KEY `FK53oy51geundskbmafp223e705` (`curso_id`),
  KEY `FKi4mqbm9vc4vux5nbutiqbpk7r` (`horario_id`),
  KEY `FK3awm0d7j8ta03wwafpxxk20ms` (`profesor_id`),
  KEY `FK3afycfjod1hng89qygqxqmt7c` (`sede_id`),
  CONSTRAINT `FK3afycfjod1hng89qygqxqmt7c` FOREIGN KEY (`sede_id`) REFERENCES `sede` (`id`),
  CONSTRAINT `FK3awm0d7j8ta03wwafpxxk20ms` FOREIGN KEY (`profesor_id`) REFERENCES `profesor` (`id`),
  CONSTRAINT `FK53oy51geundskbmafp223e705` FOREIGN KEY (`curso_id`) REFERENCES `curso` (`id`),
  CONSTRAINT `FKi4mqbm9vc4vux5nbutiqbpk7r` FOREIGN KEY (`horario_id`) REFERENCES `horario` (`id`),
  CONSTRAINT `FKndj1y0din8ba2lkfntabm6476` FOREIGN KEY (`alumno_id`) REFERENCES `alumno` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inscripcion`
--

LOCK TABLES `inscripcion` WRITE;
/*!40000 ALTER TABLE `inscripcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `inscripcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesor` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) DEFAULT NULL,
  `especialidad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES (1,'Ramírez','Programacion Web','Carlos'),(2,'Martínez','Desarrollo Web','Ana'),(3,'Gómez','Base de Datos','Luis'),(4,'López','Ciberseguridad','María'),(5,'Fernández','Inteligencia Artificial','Jorge');
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sede`
--

DROP TABLE IF EXISTS `sede`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sede` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `direccion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sede`
--

LOCK TABLES `sede` WRITE;
/*!40000 ALTER TABLE `sede` DISABLE KEYS */;
INSERT INTO `sede` VALUES (1,'Av. Siempre Viva 123','Sede Central'),(2,'Calle Falsa 456','Sede Norte'),(3,'Av. del Sol 789','Sede Sur'),(4,'Camino Real 321','Sede Este'),(5,'Ruta 66 Km 10','Sede Oeste');
/*!40000 ALTER TABLE `sede` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-27 12:20:50
