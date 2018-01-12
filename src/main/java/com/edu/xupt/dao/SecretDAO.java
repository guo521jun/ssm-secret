package com.edu.xupt.dao;

import org.apache.ibatis.annotations.Param;

import com.edu.xupt.entities.Secret;

public interface SecretDAO {
	
	//根据用户名获取Secret
	Secret get(String user);
	
	//根据传入的用户名来删除修改添加用户
	int insert(@Param("user")String user, @Param("password")String password, @Param("pk")String pk, @Param("rk")String rk);
	
	//将用户为user的明文加密
	int update(@Param("user") String user, @Param("msg") String msg, @Param("encodeMsg") String encodeMsg, @Param("isHandled") int isHandled); 
}
