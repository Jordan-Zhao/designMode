package com.mode.bridge;

/**
 * 抽象类，这样才能持有Road对象实例。此类相当于Bridge。
 * @author jindong.zjd
 *
 */
public abstract class AbstractCar {
	private Road road;
	
	abstract void drive();

	public Road getRoad() {
		return road;
	}

	public void setRoad(Road road) {
		this.road = road;
	}
	
	
}
