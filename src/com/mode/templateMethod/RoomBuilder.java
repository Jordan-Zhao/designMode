package com.mode.templateMethod;

public abstract class RoomBuilder {
	public void build(){
		chooseAddr();
		buildWall();
		buildWindow();
		complete();
	}
	
	private void chooseAddr(){
		System.out.println("选址");
	}
	
	abstract void buildWall();
	abstract void buildWindow();
	
	private void complete(){
		System.out.println("建造完成");
	}
}
