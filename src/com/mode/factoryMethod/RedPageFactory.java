package com.mode.factoryMethod;

public class RedPageFactory implements PageFactory{
	public Page producePage(){
		return new RedPage();
	}
}
