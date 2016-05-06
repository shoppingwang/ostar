/*
Navicat MySQL Data Transfer

Source Server         : 210.14.158.50(T)
Source Server Version : 50710
Source Host           : 210.14.158.50:3306
Source Database       : ostar_analysis

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-05-06 15:50:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for country
-- ----------------------------
DROP TABLE IF EXISTS `country`;
CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `countryname` varchar(128) DEFAULT NULL,
  `countrycode` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of country
-- ----------------------------
INSERT INTO `country` VALUES ('10', '中国', 'zh_CN');
INSERT INTO `country` VALUES ('14', '五林', 'ww');
INSERT INTO `country` VALUES ('15', '梦人', 'vv');
INSERT INTO `country` VALUES ('16', '有木有', 'you');

-- ----------------------------
-- Table structure for edgecast_log
-- ----------------------------
DROP TABLE IF EXISTS `edgecast_log`;
CREATE TABLE `edgecast_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `timestamp` varchar(50) NOT NULL DEFAULT '0',
  `time_taken` varchar(50) NOT NULL DEFAULT '0',
  `c_ip` varchar(50) NOT NULL DEFAULT '0',
  `filesize` varchar(50) NOT NULL DEFAULT '0',
  `s_ip` varchar(50) NOT NULL DEFAULT '0',
  `s_port` varchar(50) NOT NULL DEFAULT '0',
  `sc_status` varchar(50) NOT NULL DEFAULT '0',
  `sc_bytes` varchar(50) NOT NULL DEFAULT '0',
  `cs_method` varchar(50) NOT NULL DEFAULT '0',
  `cs_uri_stem` varchar(50) NOT NULL DEFAULT '0',
  `custom_empty` varchar(50) NOT NULL DEFAULT '0',
  `rs_duration` varchar(50) NOT NULL DEFAULT '0',
  `rs_bytes` varchar(50) NOT NULL DEFAULT '0',
  `c_referrer` varchar(50) NOT NULL DEFAULT '0',
  `c_user_agent` varchar(50) NOT NULL DEFAULT '0',
  `customer_id` varchar(50) NOT NULL DEFAULT '0',
  `ec_custom_1` varchar(50) DEFAULT '0',
  `ec_custom_2` varchar(50) DEFAULT '0',
  `ec_custom_3` varchar(50) DEFAULT '0',
  `ec_custom_4` varchar(50) DEFAULT '0',
  `ec_custom_5` varchar(50) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of edgecast_log
-- ----------------------------
INSERT INTO `edgecast_log` VALUES ('1', '1453848680', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('2', '1453848680', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('3', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('4', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('5', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('6', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('7', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('8', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('9', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('10', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('11', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('12', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('13', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('14', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('15', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('16', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('17', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('18', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('19', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('20', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('21', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('22', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('23', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('24', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('25', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('26', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('27', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('28', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('29', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('30', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('31', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('32', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('33', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
INSERT INTO `edgecast_log` VALUES ('34', '1453848680', '61166', '41.77.139.115', '68572925', '192.229.159.190', '80', 'TCP_HIT/200', '21200028', 'GET', 'http://monitor.vegocdn.com/8026A5B/475-uninetech-g', '-', '0', '429', '-', 'Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 5.2;', '158299', '0', '0', '0', '0', '0');
