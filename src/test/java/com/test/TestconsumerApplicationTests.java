package com.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.api.dto.UserDTO;
import com.test.api.service.UserDubboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestconsumerApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Reference(version = "1.0.0")
	private UserDubboService userDubboService;

	@Test
	public void getUserByUserId() {
		Long id = 2L;
		UserDTO userDTO = userDubboService.getUserByUserId(id);
		System.out.println(""+userDTO);
	}
}
