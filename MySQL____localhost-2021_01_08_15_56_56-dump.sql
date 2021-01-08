-- MariaDB dump 10.18  Distrib 10.5.8-MariaDB, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: ning_bao
-- ------------------------------------------------------
-- Server version	10.5.8-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carousel_news`
--

DROP TABLE IF EXISTS `carousel_news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carousel_news` (
  `news_id` int(11) NOT NULL COMMENT '轮播新闻ID',
  `news_link` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '轮播新闻链接',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carousel_news`
--

LOCK TABLES `carousel_news` WRITE;
/*!40000 ALTER TABLE `carousel_news` DISABLE KEYS */;
/*!40000 ALTER TABLE `carousel_news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carousel_pic`
--

DROP TABLE IF EXISTS `carousel_pic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `carousel_pic` (
  `pic_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '图片ID',
  `pic_link` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '轮播图链接',
  PRIMARY KEY (`pic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carousel_pic`
--

LOCK TABLES `carousel_pic` WRITE;
/*!40000 ALTER TABLE `carousel_pic` DISABLE KEYS */;
/*!40000 ALTER TABLE `carousel_pic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_overview_content`
--

DROP TABLE IF EXISTS `company_overview_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_overview_content` (
  `content_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司概况内容ID',
  `content` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `owned_directory` int(11) NOT NULL COMMENT '所属目录ID',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_overview_content`
--

LOCK TABLES `company_overview_content` WRITE;
/*!40000 ALTER TABLE `company_overview_content` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_overview_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_overview_directory`
--

DROP TABLE IF EXISTS `company_overview_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_overview_directory` (
  `directory_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公司概况目录ID',
  `directory_name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '目录名称',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`directory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_overview_directory`
--

LOCK TABLES `company_overview_directory` WRITE;
/*!40000 ALTER TABLE `company_overview_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_overview_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conntact_us`
--

DROP TABLE IF EXISTS `conntact_us`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conntact_us` (
  `id` int(11) NOT NULL DEFAULT 0 COMMENT 'ID',
  `addr` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地址',
  `cell_phone` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '手机号码',
  `phone` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '电话号码',
  `postcode` char(6) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '邮编',
  `fax` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '传真',
  `mailbox` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '邮箱',
  `wechat` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '微信',
  `weibo` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '微博',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conntact_us`
--

LOCK TABLES `conntact_us` WRITE;
/*!40000 ALTER TABLE `conntact_us` DISABLE KEYS */;
/*!40000 ALTER TABLE `conntact_us` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻ID',
  `title` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '新闻标题',
  `original_title` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '新闻原标题',
  `content` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '新闻内容',
  `news_type` int(11) NOT NULL COMMENT '新闻类型 0.公司新闻 1.集团新闻',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news_leaderboard`
--

DROP TABLE IF EXISTS `news_leaderboard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news_leaderboard` (
  `news_id` int(11) NOT NULL COMMENT '新闻ID',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_leaderboard`
--

LOCK TABLES `news_leaderboard` WRITE;
/*!40000 ALTER TABLE `news_leaderboard` DISABLE KEYS */;
/*!40000 ALTER TABLE `news_leaderboard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `novice_guide`
--

DROP TABLE IF EXISTS `novice_guide`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `novice_guide` (
  `novice_guide_id` int(11) NOT NULL DEFAULT 0 COMMENT '新手指引ID',
  `img` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '新手指引流程图',
  `content` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '新手指引内容',
  PRIMARY KEY (`novice_guide_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `novice_guide`
--

LOCK TABLES `novice_guide` WRITE;
/*!40000 ALTER TABLE `novice_guide` DISABLE KEYS */;
/*!40000 ALTER TABLE `novice_guide` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_introduction_content`
--

DROP TABLE IF EXISTS `product_introduction_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_introduction_content` (
  `content_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品介绍内容ID',
  `content` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `owned_directory` int(11) NOT NULL COMMENT '所属目录ID',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`content_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_introduction_content`
--

LOCK TABLES `product_introduction_content` WRITE;
/*!40000 ALTER TABLE `product_introduction_content` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_introduction_content` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_introduction_directory`
--

DROP TABLE IF EXISTS `product_introduction_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_introduction_directory` (
  `directory_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品介绍目录ID',
  `directory_name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '目录名称',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`directory_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_introduction_directory`
--

LOCK TABLES `product_introduction_directory` WRITE;
/*!40000 ALTER TABLE `product_introduction_directory` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_introduction_directory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recruitment`
--

DROP TABLE IF EXISTS `recruitment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recruitment` (
  `recruitment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '招聘公告ID',
  `content` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '招聘公告标题',
  `title` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '招聘公告内容',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`recruitment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recruitment`
--

LOCK TABLES `recruitment` WRITE;
/*!40000 ALTER TABLE `recruitment` DISABLE KEYS */;
/*!40000 ALTER TABLE `recruitment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `site_settings`
--

DROP TABLE IF EXISTS `site_settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `site_settings` (
  `id` int(11) NOT NULL DEFAULT 0 COMMENT 'ID',
  `site_name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '网站名称',
  `site_logo` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '网站logo',
  `site_slogan` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '网站slogan',
  `customer_service` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '400客服号码',
  `record_information` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '网站备案信息',
  `operating_hours` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '工作时间',
  `official_accounts` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '公众号二维码',
  `wechar_customer_service` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '客服微信二维码',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `site_settings`
--

LOCK TABLES `site_settings` WRITE;
/*!40000 ALTER TABLE `site_settings` DISABLE KEYS */;
/*!40000 ALTER TABLE `site_settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `token` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户token',
  `expire_time` datetime NOT NULL COMMENT '过期时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`,`token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名称',
  `password` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户密码',
  `user_type` int(11) NOT NULL COMMENT '用户类型 0.管理员 1.企业用户, 2.供应商',
  `user_status` int(11) NOT NULL DEFAULT 0 COMMENT '用户状态 0.正常 1.被封禁',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1001,'admin','99070102141403153',0,0,1,0,'2021-01-08 06:26:38','2021-01-08 06:26:48');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-08 15:56:56
