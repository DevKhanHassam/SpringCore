package com.Telecom.Telecom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
       
       Sim sim=context.getBean("sim", Sim.class);
//      sim humara interface tha hum usko datatype k liye use kia or jo Sim.class kia q k jis bean ka naam sim rkha hai uski class kuch or hai tu  phir humko Sim.class kr prah hai
//       https://youtu.be/r2Q0Jzl2qMQ?list=PL3NrzZBjk6m-nYX072dSaGfyCJ59Q5TEi&t=1952
       
       sim.Calling();
       sim.Data();
       
   
    }
}
