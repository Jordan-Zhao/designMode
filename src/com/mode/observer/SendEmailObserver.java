package com.mode.observer;

public class SendEmailObserver implements Observer{
	public void update(){
		System.out.println("如果到达设定的时间，则发送邮件。");
	}
}
