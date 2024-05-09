package com.InjectValueFromPropertiesFileAndUsingAutowired.InjectValueFromPropertiesFileAndUsingAutowired;

import org.springframework.beans.factory.annotation.Value;

public class Student {

@Value("${student.name}")
	private String name;

@Value("${student.age}")
	private int age;

@Value("${student.rollno}")
	private int rollno;
	

public void details()
	{
		System.out.println("Name is="+name+" age is= "+age+" Rollno:"+rollno);
	}
}
