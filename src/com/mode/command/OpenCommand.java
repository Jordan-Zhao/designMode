package com.mode.command;

public class OpenCommand implements Command{
	private Receiver receiver;
	public void execute(){
		receiver.process();
	}
	public void setReceiver(Receiver receiver){
		this.receiver = receiver;
	}
}
