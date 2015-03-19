package com.mode.proxy;

public class Main {
	public static void main(String[] arg){
		Register register = new RegisterProxy();
		register.register();
	}
}
