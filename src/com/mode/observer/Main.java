package com.mode.observer;


public class Main {
	public static void main(String[] arg){
		Subject subject1 = new ClockTimerSubject();
		Observer observer1 = new SendEmailObserver();
		SubjectRegisterManager.register(subject1, observer1);
		
		subject1.notifyObserver();//外界触发subject1状态改变，通知observer更新
	}
}
