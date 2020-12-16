-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: miningtomillions
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `damageupgrade`
--

DROP TABLE IF EXISTS `damageupgrade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `damageupgrade` (
  `priceId` int NOT NULL AUTO_INCREMENT,
  `price` int NOT NULL DEFAULT '10',
  `damage` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`priceId`),
  UNIQUE KEY `costId` (`priceId`),
  UNIQUE KEY `costId_UNIQUE` (`priceId`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `damageupgrade`
--

LOCK TABLES `damageupgrade` WRITE;
/*!40000 ALTER TABLE `damageupgrade` DISABLE KEYS */;
INSERT INTO `damageupgrade` VALUES (1,0,1),(2,10,2),(3,50,3),(4,150,4),(5,500,5),(6,2000,6),(7,8000,7),(8,15000,8),(9,40000,9),(10,100000,15);
/*!40000 ALTER TABLE `damageupgrade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pickaxeupgrade`
--

DROP TABLE IF EXISTS `pickaxeupgrade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pickaxeupgrade` (
  `priceId` int NOT NULL AUTO_INCREMENT,
  `price` int NOT NULL DEFAULT '10',
  `damage` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`priceId`),
  UNIQUE KEY `priceId_UNIQUE` (`priceId`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pickaxeupgrade`
--

LOCK TABLES `pickaxeupgrade` WRITE;
/*!40000 ALTER TABLE `pickaxeupgrade` DISABLE KEYS */;
INSERT INTO `pickaxeupgrade` VALUES (1,0,1),(2,10,2),(3,50,3),(4,100,4),(5,200,5),(6,400,6),(7,800,7),(8,1600,8),(9,3200,9),(10,6400,10),(11,8000,11),(12,12000,12),(13,16000,13),(14,20000,14),(15,24000,15),(16,28000,20);
/*!40000 ALTER TABLE `pickaxeupgrade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playerinfo`
--

DROP TABLE IF EXISTS `playerinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `playerinfo` (
  `playerId` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT 'autofilled',
  `currency` int NOT NULL DEFAULT '0',
  `stone` int NOT NULL DEFAULT '0',
  `copper` int NOT NULL DEFAULT '0',
  `iron` int NOT NULL DEFAULT '0',
  `silver` int NOT NULL DEFAULT '0',
  `gold` int NOT NULL DEFAULT '0',
  `sapphire` int NOT NULL DEFAULT '0',
  `diamond` int NOT NULL DEFAULT '0',
  `rocksUnlockedId` int NOT NULL DEFAULT '0',
  `damageModId` int NOT NULL DEFAULT '0',
  `pickaxeId` int NOT NULL DEFAULT '0',
  `rollsId` int NOT NULL DEFAULT '0',
  `dirt` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`playerId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playerinfo`
--

LOCK TABLES `playerinfo` WRITE;
/*!40000 ALTER TABLE `playerinfo` DISABLE KEYS */;
INSERT INTO `playerinfo` VALUES (1,'King Harold',231,55,7,0,23,20,0,5,17,5,9,2,0);
/*!40000 ALTER TABLE `playerinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resources`
--

DROP TABLE IF EXISTS `resources`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resources` (
  `resourceId` int unsigned NOT NULL AUTO_INCREMENT,
  `name` char(255) NOT NULL,
  `price` int NOT NULL,
  PRIMARY KEY (`resourceId`),
  KEY `resToProb` (`resourceId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resources`
--

LOCK TABLES `resources` WRITE;
/*!40000 ALTER TABLE `resources` DISABLE KEYS */;
INSERT INTO `resources` VALUES (0,'Dirt',1),(1,'Stone',2),(2,'Copper',5),(3,'Iron',10),(4,'Sapphire',25),(5,'Silver',50),(6,'Gold',100),(7,'Diamond',200);
/*!40000 ALTER TABLE `resources` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rockprobabilities`
--

DROP TABLE IF EXISTS `rockprobabilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rockprobabilities` (
  `levelId` int NOT NULL,
  `resourceId` int NOT NULL,
  `probability` int NOT NULL,
  PRIMARY KEY (`levelId`,`resourceId`),
  KEY `ProbToResources` (`resourceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rockprobabilities`
--

LOCK TABLES `rockprobabilities` WRITE;
/*!40000 ALTER TABLE `rockprobabilities` DISABLE KEYS */;
INSERT INTO `rockprobabilities` VALUES (0,0,100),(1,0,85),(1,1,100),(2,0,50),(2,1,85),(2,2,100),(3,1,100),(4,1,85),(4,2,100),(5,1,50),(5,2,85),(5,3,100),(6,2,100),(7,2,85),(7,3,100),(8,2,50),(8,3,85),(8,4,100),(9,3,100),(10,3,85),(10,4,100),(11,3,50),(11,4,85),(11,5,100),(12,4,100),(13,4,85),(13,5,100),(14,4,50),(14,5,85),(14,6,100),(15,5,100),(16,5,85),(16,6,100),(17,5,50),(17,6,85),(17,7,100),(18,6,100),(19,6,85),(19,7,100),(20,6,50),(20,7,100),(21,7,100);
/*!40000 ALTER TABLE `rockprobabilities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rocks`
--

DROP TABLE IF EXISTS `rocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rocks` (
  `rockid` int NOT NULL,
  `health` int NOT NULL DEFAULT '10',
  `price` int NOT NULL DEFAULT '10',
  PRIMARY KEY (`rockid`),
  CONSTRAINT `rockIdToLevelId` FOREIGN KEY (`rockid`) REFERENCES `rockprobabilities` (`levelId`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rocks`
--

LOCK TABLES `rocks` WRITE;
/*!40000 ALTER TABLE `rocks` DISABLE KEYS */;
INSERT INTO `rocks` VALUES (0,10,0),(1,20,10),(2,30,20),(3,40,30),(4,50,50),(5,60,150),(6,70,200),(7,80,250),(8,90,500),(9,100,750),(10,110,1000),(11,120,1500),(12,130,2000),(13,140,2500),(14,150,5000),(15,160,7500),(16,170,10000),(17,180,15000),(18,190,20000),(19,200,25000),(20,210,50000),(21,220,75000);
/*!40000 ALTER TABLE `rocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rollupgrade`
--

DROP TABLE IF EXISTS `rollupgrade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rollupgrade` (
  `priceId` int NOT NULL AUTO_INCREMENT,
  `price` int NOT NULL DEFAULT '10',
  `rolls` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`priceId`),
  UNIQUE KEY `costId` (`priceId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rollupgrade`
--

LOCK TABLES `rollupgrade` WRITE;
/*!40000 ALTER TABLE `rollupgrade` DISABLE KEYS */;
INSERT INTO `rollupgrade` VALUES (1,0,3),(2,1000,4),(3,15000,5),(4,50000,6),(5,200000,7),(6,1000000,20);
/*!40000 ALTER TABLE `rollupgrade` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-15 23:48:18
