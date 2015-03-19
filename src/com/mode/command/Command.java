package com.mode.command;

public interface Command {
	void execute();
	void setReceiver(Receiver receiver);
}
