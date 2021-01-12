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
  `news_link` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '轮播新闻链接',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carousel_news`
--

LOCK TABLES `carousel_news` WRITE;
/*!40000 ALTER TABLE `carousel_news` DISABLE KEYS */;
INSERT INTO `carousel_news` VALUES (1,NULL),(2,NULL);
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
  `pic_link` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '轮播图链接',
  PRIMARY KEY (`pic_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carousel_pic`
--

LOCK TABLES `carousel_pic` WRITE;
/*!40000 ALTER TABLE `carousel_pic` DISABLE KEYS */;
INSERT INTO `carousel_pic` VALUES (1,'https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u23.jpg'),(2,'https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u24.jpg'),(3,'https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u25.jpg'),(4,'https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u26.jpg');
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
  `content` varchar(1000) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `owned_directory` int(11) NOT NULL COMMENT '所属目录ID',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`content_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_overview_content`
--

LOCK TABLES `company_overview_content` WRITE;
/*!40000 ALTER TABLE `company_overview_content` DISABLE KEYS */;
INSERT INTO `company_overview_content` VALUES (1,'<div id=\"u48_text\" class=\"text \">\n                <p><span>宁沪商业保理（广州）有限公司成立于 2018 年 12 月 25 日，注册资本 9000 万元，实缴资本 9000 万元，是国有控股上市公司--江苏宁沪高速公路股份有限公司的全资子公司，注册地位于广东省广州市南沙自贸区。 </span></p><p><span><br></span></p><p><span>宁沪商业保理是宁沪高速旗下从事商业保理业务的专业化公司, 依托江苏交通控股优质商业信用资源，秉承不断开拓进取的创新理念，实现传统产业与互联网、与金融的相互融合，在健全的风控体系 基础上为成员企业与上下游企业提供可信赖、最便捷、最专业的供应 链金融服务。 </span></p><p><span><br></span></p><p><span>公司通过积极探索产业金融领域创新模式，为江苏高速公路产业链链属企业，科学、规范、高效地解决经营资金周转问题。借助旗下“苏高速产业金融平台”，为江苏交通控股产业链链属企业提供量身定制的全在线保理业务，携手上下游供应商伙伴，以金融科技创新共迎供应链金融结算全新时代，实现核心企业、供应商和保理公司成长共赢的愿景。</span></p>\n              </div>',1,1,0,'2021-01-12 06:16:44','2021-01-12 06:16:44'),(2,'<div id=\"u57\" class=\"ax_default label\">\n              <div id=\"u57_div\" class=\"\"></div>\n              <div id=\"u57_text\" class=\"text \">\n                <p><span>江苏宁沪高速公路股份有限公司成立于1992年8月，注册资本人民币50.38亿元，是江苏省唯一的交通基建类上市公司。</span></p><p><span><br></span></p><p><span>集团主要从事投资、建设、经营和管理沪宁高速公路及本集团拥有或参股的江苏省境内的收费公路，并发展该等公路沿线的客运及其他辅助服务业（包括加油、餐饮、购物、汽车维修、广告及住宿等）。</span></p><p><span><br></span></p><p><span>集团核心业务是收费路桥的投资、建设、营运和管理。除沪宁高速公路外，还拥有宁连公路南京段、锡澄高速公路、广靖高速公路、江阴长江公路大桥以及苏嘉杭高速公路等位于江苏省内的收费路桥全部或部分权益。截至2019年12月31日，集团直接参与经营和投资的路桥项目达到17个，直接或间接拥有的已开通公路里程已超过840公里</span></p>\n              </div>\n            </div>',2,1,0,'2021-01-12 06:17:16','2021-01-12 06:17:16'),(3,'<div id=\"u75\" class=\"ax_default _图像\">\n              <img id=\"u75_img\" class=\"img \" src=\"https://axhub.im/ax9/71d086cb448a7a75/images/公司概况/u75.jpg\">\n              <div id=\"u75_text\" class=\"text \" style=\"display:none; visibility: hidden\">\n                <p></p>\n              </div>\n            </div>',3,1,0,'2021-01-12 06:17:56','2021-01-12 06:17:56');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_overview_directory`
--

LOCK TABLES `company_overview_directory` WRITE;
/*!40000 ALTER TABLE `company_overview_directory` DISABLE KEYS */;
INSERT INTO `company_overview_directory` VALUES (1,'公司简介',1,0,'2021-01-11 06:20:08','2021-01-12 02:48:07'),(2,'集团简介',1,0,'2021-01-11 06:20:08','2021-01-12 02:48:07'),(3,'组织架构',1,0,'2021-01-11 06:20:08','2021-01-12 02:48:07');
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
INSERT INTO `conntact_us` VALUES (0,'南京市建邺区江东中路399号紫金金融中心A2楼江苏交控大厦19F','13512542299','025-86892053','210019','025-86892039','16894940@qq.com','https://www.wechat.com/','https://weibo.com/',1,0,'2021-01-11 02:16:21','2021-01-11 02:16:21');
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
  `news_source` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '新闻来源',
  `content` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '新闻内容',
  `news_type` int(11) NOT NULL COMMENT '新闻类型 0.公司新闻 1.集团新闻',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (1,'江苏:停业整顿692家,清查380万家\"小作坊\"','2021中国春节在即：面对疫情和回家过年，要怎么选？','中国新闻网','<article class=\"syl-page-article syl-device-pc tt-article-content font_m\"><p>中新网呼和浩特1月10日电 题：2021中国春节在即：面对疫情和回家过年，要怎么选？</p><p>作者 奥蓝 乌娅娜</p><p>“哎，这几天一直在忐忑呢，今天终于被下了定论：不让回。我们之前准备自驾回家，他们不放心。”10日一大早，生活在内蒙古自治区呼和浩特市的闫才接到了远在山东老家爸爸的电话。</p><img src=\"https://p3-tt.byteimg.com/origin/pgc-image/SLg0ULVHMkZV5v?from=pc\" img_width=\"404\" img_height=\"540\" alt=\"2021中国春节在即：面对疫情和回家过年，要怎么选？\" inline=\"0\" class=\"syl-page-img\"><p>图为疫情期间“奋战”在一线的包莎日娜。 包莎日娜供图</p><p>“如果过年回不去，最快也得‘五一’假期才能见到父母了。”闫才是山东人，向来重视把拜年、祭祀先祖等仪式。2021又是奶奶去世3周年，原本计划全家团聚祭拜，现在看来是不行了。“今年内蒙古又这么冷，还得自己动手准备年夜饭，哎！这可能是我这些年最‘冷’的一个春节了。”</p><p>距离2021年春节仅月余。因为新冠肺炎疫情，不少中国人的归乡脚步被乱了节奏。有些民众改变了既定计划，有些人仍在观望。</p><p>“不管怎样，春节总是我们华人很期待的。今年因为疫情，我可能又没法回家了，家人都很体谅我。”临近年关，在内蒙古生活工作的台胞林雨杰想到数千公里之外的家人有些感慨。“我怀念小时候家乡跨年时的烟火。如今我希望生活能早日恢复正常。”</p><p>日前，中国国务院联防联控机制召开新闻发布会。国铁集团客运部副主任朱文忠表示，2021年春运铁路运输期限自1月28日至3月8日，为期40天。预计全国铁路发送旅客4.07亿人次，日均1018万人次，同比增长93.4%，与2019年春运持平。</p><p>“虽然2月份才过春节，但女儿女婿怕夜长梦多，疫情防控政策又有变化。所以计划把2020年的年假都用上，这样1月底就能返程。”年近60岁的尹柏华一人在老家内蒙古呼和浩特，他想念在北京工作的女儿和女婿，更想5岁的外孙女和照顾外孙女的老伴。</p><p>他的老伴于凤菊这几天正跟着女儿在网上采购年货。“我怕快递今年停得早，得抓紧。万一回不去，最起码心意能到家。”</p><p>连日来，河南、安徽、贵州等多地发布通知，积极倡导“当地过年”，用工大省广东也发出“非必要不返乡”的倡议。加之春运临近，这无疑给各地疫情防控带来压力。</p><p>然而，春节对于每个中国人而言都是一年辛苦打拼后最为期盼的时刻，疫情即使会阻隔他们回家的进程，却阻隔不了对家和家人的思念。</p><p>“去年因为疫情，我们没能回家，而是留在了上海过春节。今年我们打算走一步看一步。”杨静离乡已多年。怕春节不能回家，她与爱人特意元旦回老家内蒙古呼和浩特多住了几天。“每天吃吃喝喝，陪着妈妈聊天追剧，跟过年也差不多。”</p><p>2020年底，中国教育部印发了《关于认真做好寒假前后高校疫情防控工作的通知》，指出要科学安排寒假放假时间，安排学生分批次有序放假离校。此外，要错峰安排春季学期开学返校，开学时间要避开春运高峰，安排学生分批次有序返校。</p><p>“学校已经放假啦，我也早早到家了，等着跟妈妈一起过年呢。”在内蒙古包头市上大一的王淼早早返乡回到父母身边，这几天忙着同学聚会、买过年新衣服。</p><p>“其实对我来说，只要有机会能陪在父母身边，就当是过年了。”包莎日娜是内蒙古国际蒙医医院的一名护士，也是此前内蒙古援鄂医疗队的队员之一。工作10年来，她回老家内蒙古兴安盟过春节的机会屈指可数。“虽然很希望能回家陪着父母，像小时候那样，看着春晚、盼着吃到包在饺子中的硬币。但如果疫情形势严峻，我还是会选择坚守在岗位上。”</p><p>“工作至今，我也已经好多年没回家过年了。今年如果必要，我应该还会在海南，过好自己的春节。”生于内蒙古的崔川东如今在海南工作，回家早已不是他春节的唯一选择。“尤其现在这样的时候，留在当地不瞎跑，才是予人方便、与己方便。”</p><p>多地疾控专家认为，“当地过年”利多弊少，有利于减少聚集、降低感染风险、减轻防控压力；也有专家称，应错峰返乡，不应停止春运，但慢性病、孕妇等人群尽量“原地不动”。(完)</p><p>来源：中国新闻网</p></article>',0,1,0,'2021-01-12 05:16:58','2021-01-12 05:39:13'),(2,'清查380万家','突发事故，在京开会的省委书记、省长请假回山东，赴现场指挥抢险','新京报','<article class=\"syl-page-article syl-device-pc tt-article-content font_m\"><p>据《大众日报》微信公众号消息，1月12日上午，正在北京参加省部级主要领导干部学习贯彻党的十九届五中全会精神专题研讨班的山东省委书记刘家义，山东省委副书记、省长李干杰请假返回山东，正在赶往栖霞市西城镇五彩龙投资有限公司笏山金矿事故现场指挥抢险救援工作。</p><p>据“烟台发布”消息，1月11日晚8时48分，烟台市委接栖霞市委报告：1月10日下午2时，位于栖霞市西城镇正在建设的五彩龙金矿发生爆炸事故，冲击波将井通梯子间损坏，罐笼无法正常运行。事故发生时，井下有22名工人被困，因通讯信号系统损坏，目前尚未取得联系。</p><p>据大众网消息，1月11日21时45分，接到栖霞市西城镇五彩龙投资有限公司笏山金矿发生险情的报告后，省委、省政府高度重视，山东省委书记刘家义第一时间作出安排，要求迅即成立省市县一体化的现场救援指挥部，全力以赴救人，严防发生次生灾害，救援中务必做好疫情防控，同时做好新闻发布工作。</p><p>山东省委副书记、省长李干杰提出明确要求。省委省政府领导已连夜赶赴现场指挥救援。</p><p>据闪电新闻消息，山东五彩龙投资有限公司栖霞市笏山金矿爆炸事故发生后，山东省委省政府迅速成立省市县一体化指挥部，应急管理部领导同志通过视频连线指挥救援。指挥部下设的现场救援、技术专家、后勤保障、媒体联络、事故调查、矿工家属接待、医疗及疫情防控7个工作组，正紧张有序地开展救援工作。</p><p>截至1月12日凌晨5时，现场专业救援力量已有300余人，各类机械、设备40余台套，正在采取强制通风方法往井下输送氧气；专业人员正在乘稳盘下井对井筒进行清障作业，对井下被困人员实施救援。同时，指挥部正调集更多大口径钻机参与救援。</p><p>由于井筒内爆炸产生的有毒气体短时间内无法排除，井筒堵塞又导致钻杆下放受阻，加上作业面狭小，井筒人工清障工作进展比较缓慢，目前救援人员正克服困难千方百计解救被困人员。</p><p>来源：新京报</p></article>',1,1,0,'2021-01-12 05:20:26','2021-01-12 05:39:13'),(3,'111','111','111','111',1,1,1,'2021-01-12 05:53:38','2021-01-12 05:56:44');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news_directory`
--

DROP TABLE IF EXISTS `news_directory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news_directory` (
  `directory_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻目录ID',
  `directory_name` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '目录名称',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`directory_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news_directory`
--

LOCK TABLES `news_directory` WRITE;
/*!40000 ALTER TABLE `news_directory` DISABLE KEYS */;
INSERT INTO `news_directory` VALUES (0,'公司新闻',1,0,'2021-01-12 02:49:02','2021-01-12 05:03:44'),(1,'集团新闻',1,0,'2021-01-12 02:49:02','2021-01-12 05:03:44');
/*!40000 ALTER TABLE `news_directory` ENABLE KEYS */;
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
INSERT INTO `news_leaderboard` VALUES (1),(2);
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
INSERT INTO `novice_guide` VALUES (0,'http://localhost:8080/images/guide/guide.png','<div class=\"cwidth\">\n        <div class=\"ptitle\">\n            <p>商业保理概述</p>\n            <span>Commercial factoring overview</span>\n        </div>\n        <div class=\"content mt50\">\n            <p>商业保理是一整套基于保理商和供应商之间所签订的保理合同的金融方案；</p>\n            <p>保理合同是指不论是否出于融资目的，供应商为实现应收账款分户管理、账款催收、防范坏账中的一项或多项功能，将已经或即将形成的应收账款（以下简称“应收账款”，根据上下文也可能指部分应收账款）转让给保理商的合同。</p>\n            <p>中小企业在增加就业、促进经济增长、科技创新与社会和谐稳定等方面具有不可替代的作用，对国民经济和社会发展具有重要的战略意义。然而当前中小企业面临的市场环境仍然不容乐观，融资难、融资贵问题突出。如何破解中小企业融资难问题成为社会关注的焦点之一。</p>\n            <p>商业银行等传统金融机构也在努力改善中小企业融资服务，但由于信贷偏好、审批流程等因素，尚不能完全有效解决此问题。以商业保理、典当、融资租赁、担保等为代表的类金融机构，在向中小企业提供融资服务方面具有灵活、创新、专业等特点，可担当解决中小企业融资难、支持实体经济发展的重任。</p>\n            <p>相对于银行保理，商业保理更具灵活性和创新性，能够开发适合中小企业的业务品种，满足融资要求；可专注于某个行业或区域，在深入了解行业和区域特点的基础上，提供有针对性的服务；有助于盘活中小企业流动资产，有效缓解周转资金问题。商业保理是中小企业快速发展阶段最佳的融资和风险转移渠道之一。</p>\n        </div>\n        \n        <div class=\"ptitle mt80\">\n            <p>政策背景和市场发展前景</p>\n            <span>Background and foreground</span>\n        </div>\n        <div class=\"content mt50\">\n            <p>2009年3月，商务部、财政部、人民银行、银监会、保监会五部门联合出台《关于推动信用销售健康发展的意见》，首次提出“开展商业保理业务试点，促进应收账款流转”；</p>\n            <p>2011年11月，商务部《关于“十二五”期间加强商务领域信用建设的指导意见》，提出要充分利用商业保理等信用服务工具促进销售发展；</p>\n            <p>2012年4月，国务院《关于进一步支持小型微型企业健康发展的意见》明确指出“支持小型微型企业采取商业保理、典当等多种方式融资”；</p>\n            <p>2012年6月，商务部出台《关于商业保理试点有关工作的通知》，同意在天津滨海新区、上海浦东新区开展商业保理试点。试点工作开展以来，相关商务主管部门出台管理办法，建立工作机制，规范和推进行业发展，做了大量工作。试点成熟后，商业保理将在全国范围内稳步推进和发展；</p>\n            <p>2013年8月，国务院《关于金融支持小微企业发展的实施意见》再次指出“加快丰富和创新小微企业金融服务方式，推动开办商业保理、金融租赁和定向信托等融资服务”；</p>\n            <p>2013年3月，经民政部批准，“中国服务贸易协会商业保理专业委员会”正式成立，2013年8月，“浦东新区商业保理专业委员会”正式成立。行业协会的成立标志着商业保理行业得到社会认可，行业自律机制进一步完善；据不完全统计，,2017年全年,我国商业保理业务量已达1万亿元人民币,连续五年实现高速增长;截至2017年末,全国商业保理企业注册资金折合人民币累计超过5700亿元。</p>\n            <p>未来三年(2019-2021)年均复合增长率约为5.09%,2021年保理业务量将达到2.39万亿元。</p>\n        </div>\n    </div>');
/*!40000 ALTER TABLE `novice_guide` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partner`
--

DROP TABLE IF EXISTS `partner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `partner` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '合作伙伴ID',
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '合作伙伴名称',
  `img` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '合作伙伴图片链接',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partner`
--

LOCK TABLES `partner` WRITE;
/*!40000 ALTER TABLE `partner` DISABLE KEYS */;
INSERT INTO `partner` VALUES (1,'招商银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u206.png',1,0,'2021-01-12 02:56:05','2021-01-12 03:30:58'),(2,'浦发银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u205.png',1,0,'2021-01-12 02:56:47','2021-01-12 02:56:52'),(3,'中国银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u210.png',1,0,'2021-01-12 02:58:50','2021-01-12 02:58:50'),(4,'中国农业银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u209.png',1,0,'2021-01-12 02:59:20','2021-01-12 03:03:28'),(5,'交通银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u208.png',1,0,'2021-01-12 02:59:46','2021-01-12 02:59:46'),(6,'中信银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u211.png',1,0,'2021-01-12 03:00:16','2021-01-12 03:00:16'),(7,'北京银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u212.png',1,0,'2021-01-12 03:00:38','2021-01-12 03:00:38'),(8,'兴业银行','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u207.png',1,0,'2021-01-12 03:00:59','2021-01-12 03:00:59'),(9,'国浩律师事务所','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u213.png',1,0,'2021-01-12 03:01:26','2021-01-12 03:01:26'),(10,'泽金金服','https://axhub.im/ax9/71d086cb448a7a75/images/%E9%A6%96%E9%A1%B5/u214.png',1,0,'2021-01-12 03:01:53','2021-01-12 03:01:53'),(11,'招商银行','http://127.0.1.1:8080/images/partner/partner_pic_招商银行.jpg',1,0,'2021-01-12 03:22:57','2021-01-12 03:22:57'),(14,'11','http://127.0.1.1:8080/images/partner/partner_pic_11.jpg',1,0,'2021-01-12 04:52:09','2021-01-12 04:52:09');
/*!40000 ALTER TABLE `partner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_introduction_content`
--

DROP TABLE IF EXISTS `product_introduction_content`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_introduction_content` (
  `content_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品介绍内容ID',
  `content` varchar(2000) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `owned_directory` int(11) NOT NULL COMMENT '所属目录ID',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`content_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_introduction_content`
--

LOCK TABLES `product_introduction_content` WRITE;
/*!40000 ALTER TABLE `product_introduction_content` DISABLE KEYS */;
INSERT INTO `product_introduction_content` VALUES (3,'<div id=\"u63_text\" class=\"text \">\n                <p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">1、产品介绍</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">适用对象：应收账款债权人。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#000000;\">场景描述：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">因提供商品、服务或者出租、出借、许可使用资产等而获得的对基础合同买方形成的应收账款，向宁沪保理申请融资业务。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">2、产品功能：解决应收账款债权人临时资金需求，盘活应收账款。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">保理期限：6-24个月。</span></p>\n              </div>',1,1,0,'2021-01-12 06:27:07','2021-01-12 06:27:07'),(4,'<div id=\"u88_text\" class=\"text \">\n                <p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">1、产品介绍</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">适用对象：应收账款债务人。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#000000;\">场景描述：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">因接受商品、服务或者承租、借用、被许可使用资产等而应当向基础合同卖方支付应付账款，通过宁沪保理为其供应链上的中小企业提供保理融资业务。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\"><br></span></p><p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">2、产品功能：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">有效管理应付账款，提高买方信用度；扶持供应商解决短期资金需求，使项目正常运转，降低项目风险。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">保理期限：6-24个月。</span></p>\n              </div>',2,1,0,'2021-01-12 06:27:07','2021-01-12 06:27:07'),(5,'<div id=\"u119_text\" class=\"text \">\n                <p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">1、产品介绍</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">融单是由江苏交控体系内成员公司基于真实贸易背景，在苏高速产融平台上开具给供应商或分包商的，可随时变现免费拆转的电子债权凭证。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#000000;\">场景描述：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">①资金紧——买方回款条件差，项目对供应商或分包商支付比例低，</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">通过融单付款，缓解资金压力；</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">②融资急——春节中秋节等节日，供应商或分包商频繁催款，通过融单付款，效率高，可实现当天放款；</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">③快速提款——通过性综合授信解决金额小，期限短，频率高的融资需求，仅需在注册时签署协议，通过电脑即可操作提款。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">④随借随还——补充流动性资金压力，融单期限为不固定期限，可线上提前申请还款，按日计息。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\"><br></span></p><p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">2、产品功能：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">①纯信用——不占用银行授信资源；</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">②快——点点鼠标完成所有操作、T+0放款</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">③省——省融资成本，随用随贴，无交易金额限制</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">保理期限：不固定期限。 </span></p>\n              </div>',3,1,0,'2021-01-12 06:27:07','2021-01-12 06:27:07'),(6,'<div id=\"u150_text\" class=\"text \">\n                <p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">1、产品介绍</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">适用对象：商业保理公司</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#000000;\">场景描述：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">在保理交易中，前手保理公司将其受让的应收账款转让给再保理公司，由再保理公司为其提供资金融通、应收账款管理、应收账款催收、应收账款债务人付款担保等服务。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\"><br></span></p><p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">2、产品功能：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">拓宽保理公司融资渠道，资产和资金资源优势互补，加强合作关系。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">保理期限：6-12个月</span></p>\n              </div>',4,1,0,'2021-01-12 06:27:07','2021-01-12 06:27:07'),(7,'<div id=\"u181_text\" class=\"text \">\n                <p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">1、产品介绍</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">适用对象：商业保理公司</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#000000;\">场景描述：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">由两家保理商分别为应收账款债权人、应收账款债务人提供保理服务的业务模式。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\"><br></span></p><p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">2、产品功能：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">跨地域尽职调查控制风险，降低人力成本，加强保理商合作，更好地服务中国中小微企业的融资和发展需求。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">保理期限：6-24个月</span></p>\n              </div>',5,1,0,'2021-01-12 06:27:07','2021-01-12 06:27:07'),(8,'<div id=\"u212_text\" class=\"text \">\n                <p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">1、产品介绍</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">适用对象：商业保理公司</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#000000;\">场景描述：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">是指两家或者两家以上的保理商与同一应收账款债权人订立保理合同，共同受让或者按照约定份额受让应收账款并提供保理服务的业务模式。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\"><br></span></p><p><span style=\"font-family:\'Arial Black\', \'Arial Normal\', \'Arial\', sans-serif;font-weight:900;color:#000000;\">2、产品功能：</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">联合保理商共同提供大额、长期的资金融资，完善信用体系网络搭建资源共享平台，拓宽保理公司的融资渠道。</span></p><p><span style=\"font-family:\'Arial Normal\', \'Arial\', sans-serif;font-weight:400;color:#7F7F7F;\">保理期限：6-24个月</span></p>\n              </div>',6,1,0,'2021-01-12 06:27:07','2021-01-12 06:27:07');
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_introduction_directory`
--

LOCK TABLES `product_introduction_directory` WRITE;
/*!40000 ALTER TABLE `product_introduction_directory` DISABLE KEYS */;
INSERT INTO `product_introduction_directory` VALUES (1,'正向保理',1,0,'2021-01-12 06:24:40','2021-01-12 06:24:40'),(2,'反向保理',1,0,'2021-01-12 06:24:40','2021-01-12 06:24:40'),(3,'融单业务',1,0,'2021-01-12 06:24:40','2021-01-12 06:24:40'),(4,'再保理',1,0,'2021-01-12 06:24:40','2021-01-12 06:24:40'),(5,'双保理',1,0,'2021-01-12 06:24:40','2021-01-12 06:24:40'),(6,'联合保理',1,0,'2021-01-12 06:24:40','2021-01-12 06:24:40');
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
  `title` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '招聘公告标题',
  `content` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '招聘公告内容',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`recruitment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recruitment`
--

LOCK TABLES `recruitment` WRITE;
/*!40000 ALTER TABLE `recruitment` DISABLE KEYS */;
INSERT INTO `recruitment` VALUES (1,'1sdf','1df',1,0,'2021-01-11 06:07:20','2021-01-11 06:07:20'),(2,'1sdf','【环球时报记者　李　雪】新冠疫情之下，太想旅游怎么办？可以乘飞机“假装在旅游”。据美国有线电视新闻网（CNN）19日报道，澳大利亚航空公司（下文简称“澳航”）近日推出一个“无目的地”观光航班，航班从悉尼出发，中途在多个澳大利亚著名景点上空低空飞行，最后返回悉尼机场降落，让乘客不需要下飞机就能观赏各地美景。该航班开售后便遭抢购，134张机票在10分钟内被抢购一空。  报道称，该航班定于10月10日起飞，全程7小时，途经大堡礁、悉尼港、邦迪海滩等地。票价根据座位等级而定，从787澳元至3787澳元（约合人民币3883元至18687元）不等。  对于“无目的地航班”的火爆，澳航首席执行官艾伦·乔伊斯在一份声明中表示，这可能是该航空公司“有史以来卖得最快的航班”。她还说：“人们显然很怀念旅游和飞行的体验。如果有需求，我们肯定会考虑在等待边界开放的同时，推出更多这样的观光航班。”CNN称，“无目的地航班”并非澳航首创。新冠疫情暴发以来，这种独特的飞行方式在亚洲地区已经成为了一种流行趋势。8月上旬，中国台湾地区的长荣航空推出特别观光航班，该航班从台北桃园机场出发，在空中盘旋2小时45分钟后返回桃园机场；8月底，日本全日空航空公司使用“巨无霸”空客A380客机，推出“在日本上空盘旋90分钟”的旅游项目，颇受欢迎；新加坡航空也在考虑从10月开始推出观光航班，从樟宜机场起飞，飞行大约3小时后返回樟宜机场。  有分析认为，疫情导致航空业遭受重创，“无目的地航班”可以帮助航空公司走出经营困境。也有人认为，这增加了不必要的碳排放。',1,0,'2021-01-11 06:07:39','2021-01-11 06:07:39'),(3,'疫情之下想旅游怎么办？澳大利亚现“无目的地航班”','【环球时报记者　李　雪】新冠疫情之下，太想旅游怎么办？可以乘飞机“假装在旅游”。据美国有线电视新闻网（CNN）19日报道，澳大利亚航空公司（下文简称“澳航”）近日推出一个“无目的地”观光航班，航班从悉尼出发，中途在多个澳大利亚著名景点上空低空飞行，最后返回悉尼机场降落，让乘客不需要下飞机就能观赏各地美景。该航班开售后便遭抢购，134张机票在10分钟内被抢购一空。\n\n报道称，该航班定于10月10日起飞，全程7小时，途经大堡礁、悉尼港、邦迪海滩等地。票价根据座位等级而定，从787澳元至3787澳元（约合人民币3883元至18687元）不等。\n\n对于“无目的地航班”的火爆，澳航首席执行官艾伦·乔伊斯在一份声明中表示，这可能是该航空公司“有史以来卖得最快的航班”。她还说：“人们显然很怀念旅游和飞行的体验。如果有需求，我们肯定会考虑在等待边界开放的同时，推出更多这样的观光航班。”CNN称，“无目的地航班”并非澳航首创。新冠疫情暴发以来，这种独特的飞行方式在亚洲地区已经成为了一种流行趋势。8月上旬，中国台湾地区的长荣航空推出特别观光航班，该航班从台北桃园机场出发，在空中盘旋2小时45分钟后返回桃园机场；8月底，日本全日空航空公司使用“巨无霸”空客A380客机，推出“在日本上空盘旋90分钟”的旅游项目，颇受欢迎；新加坡航空也在考虑从10月开始推出观光航班，从樟宜机场起飞，飞行大约3小时后返回樟宜机场。\n\n有分析认为，疫情导致航空业遭受重创，“无目的地航班”可以帮助航空公司走出经营困境。也有人认为，这增加了不必要的碳排放。',1,0,'2021-01-11 06:23:03','2021-01-11 06:23:03');
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
  `official_accounts` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '公众号二维码',
  `wechar_customer_service` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '客服微信二维码',
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
INSERT INTO `site_settings` VALUES (0,'宁沪保理','https://axhub.im/ax9/71d086cb448a7a75/images/新闻中心/u28.png','https://axhub.im/ax9/71d086cb448a7a75/images/新闻中心/u27.png','400-188-0018','Copyright ©2018 宁沪商业 All Rights Reserved. 粤ICP备XXXXXXXXXXXXX号','工作时间 (9:00 - 18:00)','https://axhub.im/ax9/71d086cb448a7a75/images/新闻中心/u3.png','https://axhub.im/ax9/71d086cb448a7a75/images/新闻中心/u3.png',1,0,'2021-01-12 06:32:40','2021-01-12 06:32:40');
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
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,'b2216affc2584adca424ea5e7e0e10c0','2021-01-12 18:25:18','2021-01-12 06:25:18'),(1001,'fca495cfd9a0455680764d2dda371d91','2021-01-12 17:51:58','2021-01-12 05:51:58'),(1002,'94ef9aaf60794ece84e431451041b599','2021-01-12 17:32:38','2021-01-12 05:32:38'),(1017,'c41bebcb69b743d5b5db9f9ce16a216d','2021-01-11 21:36:33','2021-01-11 09:36:33');
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
  `password` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户密码',
  `user_type` int(11) NOT NULL COMMENT '用户类型 0.管理员 1.企业用户, 2.供应商',
  `user_status` int(11) NOT NULL DEFAULT 0 COMMENT '用户状态 0.正常 1.被封禁',
  `version` int(11) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_delete` int(11) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `gmt_create` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `gmt_update` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1120 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','0e167509d1be26a3e5b9785558b224cc',0,0,1,0,'2021-01-09 09:48:25','2021-01-11 10:04:27'),(1001,'admin','0192023a7bbd73250516f069df18b500',0,0,1,0,'2021-01-12 04:33:08','2021-01-12 04:33:23'),(1002,'admin','0192023a7bbd73250516f069df18b500',0,0,1,0,'2021-01-12 04:33:32','2021-01-12 04:33:43'),(1015,'admin','21232f297a57a5a743894a0e4a801fc3',2,0,1,1,'2021-01-09 07:05:27','2021-01-10 08:41:00'),(1017,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1018,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1019,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1020,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1021,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1022,'1','0e167509d1be26a3e5b9785558b224cc',1,1,1,0,'2021-01-10 06:34:40','2021-01-10 07:45:36'),(1023,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1024,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1025,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1026,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1027,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1028,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1029,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1030,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1031,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1032,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1033,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1034,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1035,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1036,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1037,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1038,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1039,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1040,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1041,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1042,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1043,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1044,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1045,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1046,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1047,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1048,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1049,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1050,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1051,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1052,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1053,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1054,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1055,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1056,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1057,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1058,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1059,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1060,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1061,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1062,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1063,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1064,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1065,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1066,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1067,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1068,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1069,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1070,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1071,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1072,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1073,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1074,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1075,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1076,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1077,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1078,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1079,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1080,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1081,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1082,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1083,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1084,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1085,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1086,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1087,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1088,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1089,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1090,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1091,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1092,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1093,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1094,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1095,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1096,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1097,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1098,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1099,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1100,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1101,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1102,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1103,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1104,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1105,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1106,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1107,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1108,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1109,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1110,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1111,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1112,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1113,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1114,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1115,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40'),(1116,'1','0e167509d1be26a3e5b9785558b224cc',1,0,1,0,'2021-01-10 06:34:40','2021-01-10 06:34:40');
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

-- Dump completed on 2021-01-12 15:22:24
