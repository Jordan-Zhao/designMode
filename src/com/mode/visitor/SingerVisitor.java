package com.mode.visitor;

public class SingerVisitor implements Visitor{
	public void visit(Person person){
		System.out.println("获取Person的音调，做相应的发音");
	}
}
