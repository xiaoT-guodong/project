CREATE DATABASE project DEFAULT charset utf8mb4;

USE project;

CREATE TABLE `sys_user` (
	`id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`username` VARCHAR ( 30 ) NOT NULL COMMENT '用户名',
	`password` VARCHAR ( 30 ) NOT NULL COMMENT '密码',
	`nickname` VARCHAR ( 10 ) DEFAULT '' COMMENT '昵称',
	`sex` TINYINT ( 1 ) UNSIGNED DEFAULT 2 COMMENT '性别，0-女，1-男，2-保密',
	`birthday` datetime DEFAULT '1949-10-01 00:00:00' COMMENT '出生日期',
	`phone` CHAR ( 11 ) DEFAULT '' COMMENT '手机号',
	`id_cart` CHAR ( 18 ) DEFAULT '' COMMENT '身份证号',
	`status` INT NOT NULL DEFAULT 0 COMMENT '状态，0-注销，1-正常，2-黑名单',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY ( `id` ) 
) ENGINE = INNODB COMMENT '用户';
INSERT INTO `sys_user` ( `username`, `password`, `nickname` ) VALUES ( 'admin', 'admin', '管理员' );

CREATE TABLE `sys_role` (
	`id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` varchar(20) not null comment '角色名',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY ( `id` ) 
) ENGINE = INNODB COMMENT '角色';
INSERT INTO `sys_role` ( `name` ) VALUES ( '管理员' );

CREATE TABLE `rf_user_role` (
	`id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`user_id` bigint unsigned not null comment '用户id',
	`role_id` bigint unsigned not null comment '角色id',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY ( `id` ) 
) ENGINE = INNODB COMMENT '用户角色关联';
INSERT INTO `rf_user_role` ( `user_id`, `role_id` ) VALUES ( 1, 1 );

CREATE TABLE `sys_permission` (
	`id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` varchar(20) not null comment '权限名',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
	PRIMARY KEY ( `id` ) 
) ENGINE = INNODB COMMENT '权限';

CREATE TABLE `rf_role_permission` (
	`id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
	`role_id` bigint unsigned not null comment '用户id',
	`permission_id` bigint unsigned not null comment '角色id',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY ( `id` ) 
) ENGINE = INNODB COMMENT '角色权限关联';

CREATE TABLE `blog_article` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
	`user_id` INT NOT NULL COMMENT '用户id',
	`title` VARCHAR ( 255 ) NOT NULL COMMENT '标题',
	`content` LONGTEXT NOT NULL COMMENT '文章内容',
	`is_delete` TINYINT DEFAULT '0' COMMENT '是否删除 0-未删除、1-已删除',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY ( `id` ) 
) ENGINE = INNODB COMMENT = '文章';

CREATE TABLE `blog_comment` (
	`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
	`article_id` INT NOT NULL COMMENT '文章id',
	`user_id` INT NOT NULL COMMENT '用户id',
	`comment` VARCHAR ( 255 ) NOT NULL COMMENT '评论内容',
	`is_ack` TINYINT NOT NULL DEFAULT '0' COMMENT '是否是回复 0-否、1-是',
	`pid` INT NOT NULL DEFAULT '0' COMMENT '回复的评论id',
	`is_delete` TINYINT ( 1 ) NOT NULL DEFAULT '0' COMMENT '是否删除 0-未删除、1-已删除',
	`create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
PRIMARY KEY ( `id` ) 
) ENGINE = INNODB COMMENT = '评论内容';