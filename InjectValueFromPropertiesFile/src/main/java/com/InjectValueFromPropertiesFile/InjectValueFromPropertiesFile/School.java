package com.InjectValueFromPropertiesFile.InjectValueFromPropertiesFile;

import org.springframework.beans.factory.annotation.Autowired;

public class School {

	@Autowired
	Student student;
	
	public void studentReport()
	{
		student.studentData();
	}
}
