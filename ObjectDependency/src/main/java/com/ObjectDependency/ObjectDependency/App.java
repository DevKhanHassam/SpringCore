package com.ObjectDependency.ObjectDependency;

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
       
       Student1 stu1= context.getBean("Student1",Student1.class);
       Student2 stu2= context.getBean("Student2",Student2.class);
       
       
       stu1.student1cheat();
       stu2.student2cheat();
    }
}
