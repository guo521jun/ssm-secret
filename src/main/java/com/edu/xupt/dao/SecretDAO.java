package com.edu.xupt.dao;

import org.apache.ibatis.annotations.Param;

import com.edu.xupt.entities.Secret;

public interface SecretDAO {
	
	//�����û�����ȡSecret
	Secret get(String user);
	
	//���ݴ�����û�����ɾ���޸�����û�
	int insert(@Param("user")String user, @Param("password")String password, @Param("pk")String pk, @Param("rk")String rk);
	
	//���û�Ϊuser�����ļ���
	int update(@Param("user") String user, @Param("msg") String msg, @Param("encodeMsg") String encodeMsg, @Param("isHandled") int isHandled); 
}
