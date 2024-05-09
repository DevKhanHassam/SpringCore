package com.InjectValueFromPropertiesFile.InjectValueFromPropertiesFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        School school= context.getBean("school",School.class);
        
        school.studentReport();
    }
}
