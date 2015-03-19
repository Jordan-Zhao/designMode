package com.mode.strategy;

import java.util.ArrayList;

public class Main {
	public static void main(String[] arg){
		/**
		 * 客户端创建策略对象，并配置到PlusUtil中。
		 * PlusUtil存在的意义：当一个策略对象出现在系统中多个地方时，用PlusUtil代替，这样，更换策略时，
		 * 只需要改变plusUtil.setStrategy(strategy)这一个地方即可。
		 */
		PlusUtil plusUtil = new PlusUtil();
		Strategy strategy = new BPlusStartegy(); //当strategy改变时，只用改变这行代码。
		plusUtil.setStrategy(strategy);
		plusUtil.doPlus(new ArrayList<Integer>());
	}
}
