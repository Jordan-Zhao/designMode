package com.mode.factoryMethod;

public class BlackPageFactory implements PageFactory{
	public Page producePage(){
		return new BlackPage();
	}
}
