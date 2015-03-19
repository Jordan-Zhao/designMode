package com.mode.chain;

public class ReadHandler implements Handler{
	private Handler handler;			//如果持有的是Handler列表，则可以组成树状或者环装结构
	public void setHandler(Handler handler){
		this.handler = handler;
	}
	public void operate(String request){
		if("read".equals(request)){
			System.out.println("read handler.");
			return;
		}
		handler.operate(request);
	}
}
