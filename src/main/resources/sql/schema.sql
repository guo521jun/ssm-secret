//�������ݿ�
mysql -uroot -p123456
//չʾ�������ݿ�
SHOW DATABASES;
//�������ݿ�secret
CREATE DATABASE secret CHARSET = UTF8;
//ʹ�����ݿ�
USE secret;
//�������ݱ�
CREATE TABLE secret(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`user` VARCHAR(36) NOT NULL COMMENT '�û���',
	`msg` VARCHAR(100) NOT NULL COMMENT '�û��ύ������',
	`pk` VARCHAR(200) NOT NULL COMMENT '�û���Կ',
	`sk` VARCHAR(200) NOT NULL COMMENT '�û�˽Կ',
	`encode_msg` VARCHAR(260) NOT NULL COMMENT '���ܺ������',
	`decode_msg` VARCHAR(200) NOT NULL COMMENT '���ܺ������',
	`is_handled` INT(2) NOT NULL COMMENT '�Ƿ��Ѵ���',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8 COMMENT '�ӽ��ܴ����';