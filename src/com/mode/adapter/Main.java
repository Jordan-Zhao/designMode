package com.mode.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] arg){
		List list = new ArrayList();
		Sortable sort = new NormalSorter();
		sort.sort(list);
		
//		MySortable mySorter = new MySorter();
//		SorterAdapter adapter= new SorterAdapter();
//		adapter.setMySorter(mySorter);
//		sort = adapter;
//		sort.sort(list);
	}
}
