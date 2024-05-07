package com.LooseCoupling.LooseCoupling;

public class Sim {

	private Service service;
	
	
	public void setservice(Service service)
	{
		this.service=service;
	}
	
	
	public void provideService()
	{
		
		service.whichService();
	}
}
