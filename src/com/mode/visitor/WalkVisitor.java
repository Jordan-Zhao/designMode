package com.mode.visitor;

public class WalkVisitor implements Visitor{
	public void visit(Person person){
		System.out.println("获取Person的步长，计算行走速度");
	}
}
