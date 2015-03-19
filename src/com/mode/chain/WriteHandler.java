package com.mode.chain;

public class WriteHandler implements Handler{
	private Handler handler;
	public void setHandler(Handler handler){
		this.handler = handler;
	}
	public void operate(String request){
		if("write".equals(request)){
			System.out.println("write handler.");
			return;
		}
		handler.operate(request);
	}
}
