
package com.mode.singleton;


public class SingleSun {
	//在系统中只存在一个唯一的对象。有助于保持状态唯一。
	private static SingleSun singleSun;

	private SingleSun() {

	}

	public static SingleSun getInstance() {
		if (singleSun == null) {
			synchronized (SingleSun.class) {	//并发控制
				if (singleSun == null) {
					singleSun = new SingleSun();
				}
			}
		}
		return singleSun;
	}
	
	public static void main(String[] arg){
		SingleSun.getInstance();
	}
}
