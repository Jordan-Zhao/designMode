package com.mode.iterator;

public class MyList implements IList{
	
	private int[] data = {1,2,3,4,5};
	
	public Iterator iterator(){
		return new MyIterator(this);
	}
	
	public Object get(int i){
		return data[i];
	}
	public int size(){
		return data.length;
	}
}
