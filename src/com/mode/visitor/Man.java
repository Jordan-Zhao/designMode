package com.mode.visitor;

public class Man implements Person{
	
	public void accept(Visitor visitor){	//接收visitor，执行动作
		visitor.visit(this);	//把this对象传给visitor
	}
}
