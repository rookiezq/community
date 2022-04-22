package com.rookied.community;

import com.rookied.community.dao.UserMapper;
import com.rookied.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void contextLoads() {
		User user = userMapper.selectById(1);
		System.out.println(user);
	}

}
