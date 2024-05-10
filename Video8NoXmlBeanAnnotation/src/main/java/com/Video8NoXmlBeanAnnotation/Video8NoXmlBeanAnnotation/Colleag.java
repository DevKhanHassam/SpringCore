package com.Video8NoXmlBeanAnnotation.Video8NoXmlBeanAnnotation;


public class Colleag {

	private Teacher teacher;
	private ColleagPrincipal principal;
	
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void setPrincipal(ColleagPrincipal principal) {
		this.principal = principal;
	} 
	
	
	
	public void info()
	{
		System.out.println("teacher "+ teacher.teach());
		System.out.println("Principle name="+principal.principalName);
	}
}
