package com.mode.bridge;

public class HKCar extends AbstractCar{
	
	public void drive(){
		System.out.println("HongKong car .靠左行驶");
		getRoad().drive();
	}

	
	
}
