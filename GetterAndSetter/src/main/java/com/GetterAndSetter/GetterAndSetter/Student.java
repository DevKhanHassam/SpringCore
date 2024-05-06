package com.GetterAndSetter.GetterAndSetter;

public class Student {

	private String StudentName;
	private int StudentId;
	
	private String Studenthobby;
	
	
	public Student(String Studenthobby) {
		super();
		this.Studenthobby = Studenthobby;
	}

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
		System.out.println("Studert Id is: "+StudentId);
		System.out.println("Student hobby is: "+Studenthobby);
	}
}
