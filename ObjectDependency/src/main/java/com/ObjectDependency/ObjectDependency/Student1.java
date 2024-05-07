package com.ObjectDependency.ObjectDependency;

public class Student1 {

	private CheatingMaterial cheat;

	public void setCheat(CheatingMaterial cheat) {
		this.cheat = cheat;
	}
	
	
	public void student1cheat()
	{
		cheat.cheatingStart();
	}
	
	
}
