package com.AutowiringByContructor.AutowiringByContructor;

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
    	System.out.println("all clear");
    	Body bodyObjBody = context.getBean("bodyObject",Body.class);
    	bodyObjBody.alive();
       
    }
}
