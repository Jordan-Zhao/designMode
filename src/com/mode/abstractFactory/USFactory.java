package com.mode.abstractFactory;

import com.mode.factoryMethod.BlackPage;
import com.mode.factoryMethod.Page;

public class USFactory implements Factory{
	public Pen producePen(){
		return new USPen();
	}
	
	public Page producePage(){
		return new BlackPage();
	}
}
