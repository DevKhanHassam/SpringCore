package com.AnnoutationAutowire.AnnoutationAutowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Body {
	
	
	@Autowired
	private Heart heartObj;
	
	


	public void isAlive() {
		heartObj.pump();
	}

}
