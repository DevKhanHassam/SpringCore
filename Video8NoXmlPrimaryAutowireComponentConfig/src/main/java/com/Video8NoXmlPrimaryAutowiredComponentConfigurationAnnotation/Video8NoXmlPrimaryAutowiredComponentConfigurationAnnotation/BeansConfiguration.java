package com.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "com.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation")
@PropertySource("classpath:data.properties")
public class BeansConfiguration {

}
