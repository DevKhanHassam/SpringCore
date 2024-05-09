package com.InjectValueFromPropertiesFile.InjectValueFromPropertiesFile;



public class Student {

	private String name;
	private int age;
	private int rollno;
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
	
	public void studentData()
	{
		System.out.println("Name:"+name+" age:"+age+" RollNO:"+rollno);
	}
	
	
}
