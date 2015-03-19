package com.mode.bridge;

public class USCar extends AbstractCar{
	
	public void drive(){
		System.out.println("US car .靠右行驶");
		getRoad().drive();
	}

	
	
}
