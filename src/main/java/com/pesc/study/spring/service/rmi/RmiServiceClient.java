package com.pesc.study.spring.service.rmi;

import org.springframework.context.annotation.Bean;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class RmiServiceClient {
	
	@Bean(name="remoteRmiService") 
	public RmiProxyFactoryBean getRmiService() {
		RmiProxyFactoryBean rmi = new RmiProxyFactoryBean();
		rmi.setServiceUrl("rmi://127.0.0.1:1199/rmiService");
		rmi.setServiceInterface(IRmiService.class);
		return rmi;
	}
}
