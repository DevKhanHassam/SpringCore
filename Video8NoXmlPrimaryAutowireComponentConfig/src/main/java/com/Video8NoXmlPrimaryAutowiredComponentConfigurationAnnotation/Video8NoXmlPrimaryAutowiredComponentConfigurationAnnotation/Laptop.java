package com.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Autowired
	@Qualifier("windows")
	OperatingSystem objOperatingSystem;
	
	
	public void showSpec()
	{
		System.out.println(objOperatingSystem.operatinSystemName());
	}
	

}
