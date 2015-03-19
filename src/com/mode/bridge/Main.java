package com.mode.bridge;

public class Main {
	public static void main(String[] arg){
		/**
		 * 通过组装接口来组装功能
		 */
		Road road = new G10Road();
		AbstractCar car = new USCar();
		car.setRoad(road);
		car.drive();
	}
}
