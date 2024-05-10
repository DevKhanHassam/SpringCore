package com.Video8NoXmlBeanAnnotation.Video8NoXmlBeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ColleageProperties.class);
        Colleag objColleag = context.getBean("beanOfColleag",Colleag.class);
        objColleag.info();
       
    }
}
