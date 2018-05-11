package com.sugar.springbootlearning;

import com.sugar.springbootlearning.util.UserProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLearningApplicationTests {

	@Autowired
	private UserProperties userProperties;

	@Test
	public void test() throws Exception{
		Assert.assertEquals(userProperties.getName(),"sugarYang");
	}

	@Test
	public void contextLoads() {
	}
}