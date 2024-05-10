package com.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation.Video8NoXmlPrimaryAutowiredComponentConfigurationAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Laptop objLaptop = context.getBean("laptop",Laptop.class);
        objLaptop.showSpec();
    }
}
