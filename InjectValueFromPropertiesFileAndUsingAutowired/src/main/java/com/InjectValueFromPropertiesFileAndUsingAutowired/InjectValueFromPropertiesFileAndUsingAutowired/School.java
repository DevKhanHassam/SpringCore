package com.InjectValueFromPropertiesFileAndUsingAutowired.InjectValueFromPropertiesFileAndUsingAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class School {

	@Autowired
	Student student;
	
	public void showData()
	{
		student.details();
	}
	
}
