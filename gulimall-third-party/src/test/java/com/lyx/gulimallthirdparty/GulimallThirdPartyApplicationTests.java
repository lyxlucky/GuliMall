package com.lyx.gulimallthirdparty;

import com.lyx.gulimallthirdparty.common.AliCloudConstant;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@RunWith(JUnit4ClassRunner.class)
public class GulimallThirdPartyApplicationTests {

	@Autowired
	private AliCloudConstant cloudConstant;

	@Test
	public void contextLoads(){
		System.out.println("cloudConstant = " + cloudConstant);
	}


}
