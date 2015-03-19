package com.mode.observer;

import java.util.List;

public class ClockTimerSubject implements Subject{
	private List<Observer> observers;
	
	public void add(Observer observer){
		observers.add(observer);
	}
	
	public void remove(Observer observer){
		observers.remove(observer);
	}
	
	public void notifyObserver(){
		for(Observer observer : observers){
			observer.update();
		}
	}
}
