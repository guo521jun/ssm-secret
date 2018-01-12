//连接数据库
mysql -uroot -p123456
//展示所有数据库
SHOW DATABASES;
//创建数据库secret
CREATE DATABASE secret CHARSET = UTF8;
//使用数据库
USE secret;
//创建数据表
CREATE TABLE secret(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`user` VARCHAR(36) NOT NULL COMMENT '用户名',
	`msg` VARCHAR(100) NOT NULL COMMENT '用户提交的明文',
	`pk` VARCHAR(200) NOT NULL COMMENT '用户公钥',
	`sk` VARCHAR(200) NOT NULL COMMENT '用户私钥',
	`encode_msg` VARCHAR(260) NOT NULL COMMENT '加密后的密文',
	`decode_msg` VARCHAR(200) NOT NULL COMMENT '解密后的明文',
	`is_handled` INT(2) NOT NULL COMMENT '是否已处理',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT '加解密处理表';