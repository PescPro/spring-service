package com.pesc.study.spring.service.rmi;

import static org.junit.Assert.assertEquals;

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
	
	@Test
	public void testRmiService() {
		assertEquals("RmiService", remoteRmiService.getServiceName());
	}
}
