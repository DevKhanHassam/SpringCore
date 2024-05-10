package com.InjectValueFromPropertiesFileAndUsingAutowired.Video8NoXmlComponentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigurationClass.class);
        
        Feature01 objFeature01 = context.getBean("objFeature01", Feature01.class);
        
        objFeature01.myFunction();
    }
}
