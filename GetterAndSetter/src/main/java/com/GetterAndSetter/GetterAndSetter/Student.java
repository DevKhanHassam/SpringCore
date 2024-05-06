package com.GetterAndSetter.GetterAndSetter;

public class Student {

	private String StudentName;
	private int StudentId;
	
	
	public void setStudentId(int StudentId)
	{
		this.StudentId=StudentId;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}



	public void showDetails()
	{
		System.out.println("Student Name is: " +StudentName);
		System.out.println("Studern Id is: "+StudentId);
	}
}
