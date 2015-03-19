package com.mode.iterator;

public class Main {
	public static void main(String[] arg){
		IList list = new MyList();
		Iterator iterator = list.iterator();
		//用户不用获取MyList里的int数组，即可遍历MyList。这样MyList的存储结构改变时，用户代码不受影响。
		while (iterator.hasNext()) {	
			System.out.println(iterator.next());
		}
	}
}
