/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50644
 Source Host           : localhost:3306
 Source Schema         : myproject

 Target Server Type    : MySQL
 Target Server Version : 50644
 File Encoding         : 65001

 Date: 27/07/2019 18:54:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` char(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_PASSWORD` char(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_EMAIL` char(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE,
  UNIQUE INDEX `IDX_NAME`(`USER_NAME`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, '林炳文', '1234567@', 'ling20081005@126.com');
INSERT INTO `t_user` VALUES (2, 'evan', '123', 'fff@126.com');
INSERT INTO `t_user` VALUES (3, 'kaka', 'cadg', 'fwsfg@126.com');
INSERT INTO `t_user` VALUES (4, 'simle', 'cscs', 'fsaf@126.com');
INSERT INTO `t_user` VALUES (5, 'arthur', 'csas', 'fsaff@126.com');
INSERT INTO `t_user` VALUES (6, '小德', 'yuh78', 'fdfas@126.com');
INSERT INTO `t_user` VALUES (7, '小小', 'cvff', 'fsaf@126.com');
INSERT INTO `t_user` VALUES (8, '林林之家', 'gvv', 'lin@126.com');
INSERT INTO `t_user` VALUES (9, '林炳文Evankaka', 'dfsc', 'ling2008@126.com');
INSERT INTO `t_user` VALUES (10, 'apple', 'uih6', 'ff@qq.com');
INSERT INTO `t_user` VALUES (11, 'nong', 'nongnong', '1067050494@qq.com');
INSERT INTO `t_user` VALUES (12, 'admin', '038bdaf98f2037b31f1e75b5b4c9b26e', 'ff@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
