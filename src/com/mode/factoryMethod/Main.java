package com.mode.factoryMethod;

public class Main {
	public static void main(String[] arg){
		PageFactory factory = new BlackPageFactory();	//用户根据自己的需要配置Factory
		Page p = factory.producePage();
		
		factory = new RedPageFactory();
		p = factory.producePage();
	}
}
