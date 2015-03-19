package com.mode.chain;

public interface Handler {
	void setHandler(Handler handler);
	void operate(String request);
}
