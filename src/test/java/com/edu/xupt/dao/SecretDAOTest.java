package com.edu.xupt.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.edu.xupt.entities.Secret;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SecretDAOTest {

	@Autowired
	private SecretDAO secretDAO;
	
	@Test
	public void testGet() {
		Secret secret = secretDAO.get("gj");
		System.out.println("Secret: " + secret);
	}

	@Test
	public void testUpdate() {
		int InsertCount = secretDAO.insert("gj", "123456", "csvrbdvv", "csdrehtrjtjndfb");
		System.out.println(InsertCount);
	}

}
