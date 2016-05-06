/*
Navicat MySQL Data Transfer

Source Server         : 210.14.158.50(T)
Source Server Version : 50710
Source Host           : 210.14.158.50:3306
Source Database       : ostar_security

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-05-06 15:49:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for system_authority_info
-- ----------------------------
DROP TABLE IF EXISTS `system_authority_info`;
CREATE TABLE `system_authority_info` (
  `auth_id` int(11) NOT NULL AUTO_INCREMENT,
  `auth_name` varchar(32) DEFAULT NULL,
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `display_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`auth_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_authority_info
-- ----------------------------
INSERT INTO `system_authority_info` VALUES ('1', '访问首页', '2016-03-29 15:18:04', '2016-03-29 15:18:07', '10');
INSERT INTO `system_authority_info` VALUES ('2', '管理国家信息', '2016-03-29 16:58:58', '2016-03-29 16:59:01', '20');

-- ----------------------------
-- Table structure for system_authority_resource
-- ----------------------------
DROP TABLE IF EXISTS `system_authority_resource`;
CREATE TABLE `system_authority_resource` (
  `res_id` int(11) DEFAULT NULL,
  `auth_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_authority_resource
-- ----------------------------
INSERT INTO `system_authority_resource` VALUES ('1', '1');
INSERT INTO `system_authority_resource` VALUES ('2', '2');

-- ----------------------------
-- Table structure for system_module_info
-- ----------------------------
DROP TABLE IF EXISTS `system_module_info`;
CREATE TABLE `system_module_info` (
  `module_code` varchar(32) NOT NULL,
  `module_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`module_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_module_info
-- ----------------------------
INSERT INTO `system_module_info` VALUES ('AnalysisWeb', '分析平台');

-- ----------------------------
-- Table structure for system_resource_info
-- ----------------------------
DROP TABLE IF EXISTS `system_resource_info`;
CREATE TABLE `system_resource_info` (
  `res_id` int(11) NOT NULL AUTO_INCREMENT,
  `module_code` varchar(32) DEFAULT NULL,
  `res_name` varchar(32) DEFAULT NULL,
  `res_type` int(11) DEFAULT NULL COMMENT '1:MENU\r\n            2:PAGE_ELEMENT',
  `res_url` varchar(128) DEFAULT NULL,
  `parent_res_id` int(11) DEFAULT '0',
  `insert_date` datetime DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  `display_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`res_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_resource_info
-- ----------------------------
INSERT INTO `system_resource_info` VALUES ('1', 'AnalysisWeb', '首页', '1', '/index.do', '0', '2016-03-29 15:17:25', '2016-03-29', '10');
INSERT INTO `system_resource_info` VALUES ('2', 'AnalysisWeb', '增加国家信息', '2', '/view.do', '1', '2016-03-29 16:58:23', '2016-03-29', '10');

-- ----------------------------
-- Table structure for system_role_authority
-- ----------------------------
DROP TABLE IF EXISTS `system_role_authority`;
CREATE TABLE `system_role_authority` (
  `role_id` int(11) DEFAULT NULL,
  `auth_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_role_authority
-- ----------------------------
INSERT INTO `system_role_authority` VALUES ('1', '1');
INSERT INTO `system_role_authority` VALUES ('2', '1');
INSERT INTO `system_role_authority` VALUES ('2', '2');

-- ----------------------------
-- Table structure for system_role_info
-- ----------------------------
DROP TABLE IF EXISTS `system_role_info`;
CREATE TABLE `system_role_info` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT,
  `role_code` varchar(16) DEFAULT NULL,
  `role_name` varchar(32) DEFAULT NULL,
  `role_status` int(11) DEFAULT NULL COMMENT '0:停用\r\n            1:启用',
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `display_order` int(11) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_role_info
-- ----------------------------
INSERT INTO `system_role_info` VALUES ('1', 'ROLE_USER', '普通用户', '1', '2016-03-29 15:14:54', '2016-03-29 04:00:00', '10');
INSERT INTO `system_role_info` VALUES ('2', 'ROLE_ADMIN', '管理员', '1', '2016-03-29 16:56:24', '2016-03-29 00:00:00', '0');

-- ----------------------------
-- Table structure for system_user_info
-- ----------------------------
DROP TABLE IF EXISTS `system_user_info`;
CREATE TABLE `system_user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(32) DEFAULT NULL,
  `user_password` varchar(128) DEFAULT NULL,
  `user_status` int(11) DEFAULT NULL COMMENT '0:停用\r\n            1:使用',
  `user_name` varchar(32) DEFAULT NULL,
  `user_email` varchar(64) DEFAULT NULL,
  `user_phone_no` varchar(32) DEFAULT NULL,
  `parent_user_id` int(11) DEFAULT '0',
  `allow_create_sub` int(11) DEFAULT NULL COMMENT '0:不允许\r\n            1:允许',
  `insert_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `expire_date` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_user_info
-- ----------------------------
INSERT INTO `system_user_info` VALUES ('1', 'wxp', '$2a$10$iNuEM8TXbitmuQlzW/o4AOCKAZYjxqO4XCLPr8f4BwF4A8YdYom2a', '1', '哈哈', 'hh@email.com', '13988990988', '0', '1', '2016-03-24 16:14:31', '2016-03-24 16:14:34', '2099-04-30 16:14:36');
INSERT INTO `system_user_info` VALUES ('2', 'admin', '$2a$10$NRFTnOvY96.4QR.xjgk/kOoVP4fcFgaaGVjGSXpWQMx6pCMlAjpeu', '1', '管理员', 'admin.email.com', '13422334432', '0', '1', '2016-03-30 10:19:10', '2016-03-30 10:19:12', '2099-04-12 10:19:15');

-- ----------------------------
-- Table structure for system_user_role
-- ----------------------------
DROP TABLE IF EXISTS `system_user_role`;
CREATE TABLE `system_user_role` (
  `role_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of system_user_role
-- ----------------------------
INSERT INTO `system_user_role` VALUES ('1', '1');
INSERT INTO `system_user_role` VALUES ('1', '2');
INSERT INTO `system_user_role` VALUES ('2', '2');
