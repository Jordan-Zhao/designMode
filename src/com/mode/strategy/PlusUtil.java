package com.mode.strategy;

import java.util.List;

public class PlusUtil {
	private Strategy strategy;
	
	public void doPlus(List<Integer> list){
		strategy.plus(list);
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	
}
