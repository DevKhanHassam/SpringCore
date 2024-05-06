package com.Telecom.Telecom;

public class Vodafone implements Sim {
	
	
	
	public Vodafone()
	{
		System.out.println("Vodafone Contructor");
	}

	@Override
	public void Calling() {
		System.out.println("Calling by Vodafone");

	}

	@Override
	public void Data() {
		System.out.println("Use data by Vodafone");

	}

}
