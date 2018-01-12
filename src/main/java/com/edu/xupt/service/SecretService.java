package com.edu.xupt.service;

import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.xupt.dao.SecretDAO;
import com.edu.xupt.entities.RSACoder;
import com.edu.xupt.entities.Secret;

@Service
public class SecretService {

	@Autowired
	private SecretDAO secretDAO;
	
	public int register(String user, String password) {
		byte[] pk = null;
		byte[] rk = null;
		try {
			Map<String, Object> map = RSACoder.initKey();
			pk = RSACoder.getPublicKey(map);
			rk = RSACoder.getPrivateKey(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String pkData = Base64.encodeBase64String(pk);
		String rkData = Base64.encodeBase64String(rk);
		int insertCount = secretDAO.insert(user, password, pkData, rkData);
		return insertCount;
	}
	
	public Secret get(String user) {
		Secret secret = secretDAO.get(user);
		return secret;
	}
	
	public String encode(Secret secret) {
		String msg = secret.getMsg();
		String pk = secret.getPk();
		byte[] m = msg.getBytes();
		byte[] p = pk.getBytes();
		byte[] en = null;
		String encodeMsg = null;
		try {
			en = RSACoder.encryptByPublicKey(m, p);
			encodeMsg = Base64.encodeBase64String(en);
			secretDAO.update(secret.getUser(), msg, encodeMsg, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encodeMsg;
	}
	
	public void update(String user, int isHandled) {
		secretDAO.update(user, null, null, isHandled);
	}
	
	public String decode(Secret secret) {
		return null;
	}
}
