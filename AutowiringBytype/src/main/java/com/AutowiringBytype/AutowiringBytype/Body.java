package com.AutowiringBytype.AutowiringBytype;

public class Body {

	private Heart heartObject;
	
	
	
	public void setHeartObject(Heart heartObject) {
		this.heartObject = heartObject;
	}



	public void alive()
	{
		heartObject.Pump();
	}
}
