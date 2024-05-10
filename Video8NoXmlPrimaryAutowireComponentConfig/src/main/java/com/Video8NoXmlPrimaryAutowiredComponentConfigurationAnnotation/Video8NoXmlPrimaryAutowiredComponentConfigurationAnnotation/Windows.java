package com.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Windows implements OperatingSystem {

	@Value("${Windows.osName}")
	String osName;

	public String operatinSystemName() {
		
		return osName;
	}

}
