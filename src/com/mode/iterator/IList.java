package com.mode.iterator;

public interface IList {
	Iterator iterator();
	
	Object get(int i);
	int size();
}
