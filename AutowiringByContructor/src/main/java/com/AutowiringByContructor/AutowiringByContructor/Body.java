package com.AutowiringByContructor.AutowiringByContructor;


public class Body {
	
private Heart heartObject;


	public Body(Heart heartObject) {
	super();
	this.heartObject = heartObject;
}



	public void alive()
	{
		heartObject.Pump();
	}

}
