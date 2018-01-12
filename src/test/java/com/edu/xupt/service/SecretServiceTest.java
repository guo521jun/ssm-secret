package com.edu.xupt.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class SecretServiceTest {

	@Autowired
	private SecretService secretService;
	
	@Test
	public void testRegister() {
		int count = secretService.register("kd", "123");
		System.out.println(count);
	}

}
