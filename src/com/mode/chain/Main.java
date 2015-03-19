package com.mode.chain;

public class Main {
	public static void main(String[] arg){
		Handler receiveHandler = new ReceiveHandler();
		Handler readHandler = new ReadHandler();
		Handler writeHandler = new WriteHandler();
		
		receiveHandler.setHandler(readHandler);
		readHandler.setHandler(writeHandler);
		
		receiveHandler.operate("write");
	}
}
