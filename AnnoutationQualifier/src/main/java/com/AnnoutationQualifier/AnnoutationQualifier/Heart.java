package com.AnnoutationQualifier.AnnoutationQualifier;

import org.springframework.beans.factory.annotation.Qualifier;

public class Heart { 
	
	private String heartType;
	
	
	
	
	public void setHeartType(String heartType) {
		this.heartType = heartType;
	}



	


	public void pump() 
	{
		System.out.println("heart type= "+heartType);
		System.out.println("Heart is Pumping");
	}

}
