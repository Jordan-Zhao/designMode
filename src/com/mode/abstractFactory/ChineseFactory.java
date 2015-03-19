package com.mode.abstractFactory;

import com.mode.factoryMethod.Page;
import com.mode.factoryMethod.RedPage;

public class ChineseFactory implements Factory{
	public Pen producePen(){
		return new ChinesePen();
	}
	
	public Page producePage(){
		return new RedPage();
	}
}
