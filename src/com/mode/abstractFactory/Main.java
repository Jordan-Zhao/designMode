package com.mode.abstractFactory;

import com.mode.factoryMethod.Page;

public class Main {
	public static void main(String[] arg){
		//用户根据自己的需要配置Factory。更换工厂，即更换整套产品。
		Factory factory = new ChineseFactory();	
		Pen pen = factory.producePen();
		Page p = factory.producePage();
		
		factory = new USFactory();
		Pen pen1 = factory.producePen();
		Page p1 = factory.producePage();
	}
}
