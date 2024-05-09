package com.AnnoutationQualifier.AnnoutationQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Body {

	 
	private Heart  heartobj;
	
	
	@Autowired
	@Qualifier("dil")
	public void setHeartobj(Heart heartobj)
	{
		this.heartobj= heartobj;
	}
	
	
//	@Autowired
//
//	public Body(@Qualifier("dil") Heart heartobj) {
//		this.heartobj = heartobj;
//	}



	public void isAlive()
	{
		heartobj.pump();
	}

}
