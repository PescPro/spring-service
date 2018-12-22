package com.pesc.study.spring.service.rmi;

import org.springframework.stereotype.Service;

@Service("rmiService")
public class RmiService implements IRmiService {

	@Override
	public String getServiceName() {
		return "RmiService";
	}

}
