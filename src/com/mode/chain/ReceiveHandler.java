package com.mode.chain;

public class ReceiveHandler implements Handler{
	private Handler handler;
	public void setHandler(Handler handler){
		this.handler = handler;
	}
	public void operate(String request){
		System.out.println("receive handler.");
		handler.operate(request);
	}
}
