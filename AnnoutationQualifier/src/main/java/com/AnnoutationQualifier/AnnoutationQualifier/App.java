package com.AnnoutationQualifier.AnnoutationQualifier;

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
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Body body= context.getBean("body", Body.class);
        body.isAlive();
    }
}
