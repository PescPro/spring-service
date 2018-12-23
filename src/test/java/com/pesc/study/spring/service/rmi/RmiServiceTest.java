package com.pesc.study.spring.service.rmi;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:/spring-servlet.xml"})    
public class RmiServiceTest{
	
	@Autowired
	IRmiService remoteRmiService;
	
	/**
	 * 测试通过客户端调用rmi服务
	 */
	@Test
	public void testRmiService() {
		assertEquals("RmiService", remoteRmiService.getServiceName());
	}
	
	@Ignore
	@Test
	public void testRmiServiceFail() {
		assertEquals("RmiService1", remoteRmiService.getServiceName());
	}
}
