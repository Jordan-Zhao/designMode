package com.mode.adapter;

import java.util.List;

public class SorterAdapter implements Sortable{
	private MySortable mySorter;
	
	public void sort(List list){
		mySorter.mySort(list);
	}

	public MySortable getMySorter() {
		return mySorter;
	}

	public void setMySorter(MySortable mySorter) {
		this.mySorter = mySorter;
	}

}
