package com.ObjectDependency.ObjectDependency;

public class Student2 {

	private CheatingMaterial cheat;

	public void setCheat(CheatingMaterial cheat) {
		this.cheat = cheat;
	}
	
	
	public void student2cheat()
	{
		cheat.cheatingStart();
	}
}
