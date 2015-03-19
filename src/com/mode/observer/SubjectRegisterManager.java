package com.mode.observer;

public class SubjectRegisterManager {
	public static void register(Subject subject,Observer observer){
		subject.add(observer);
	}
	
	public static void remove(Subject subject,Observer observer){
		subject.remove(observer);
	}
}
