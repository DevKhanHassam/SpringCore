package com.AnnoutationAutowire.AnnoutationAutowire;

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
    	Body bodyObj= context.getBean("bodyObj",Body.class);
    	bodyObj.isAlive();
    }
}
