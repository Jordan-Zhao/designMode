package com.mode.visitor;

public class Main {
	public static void main(String[] arg){
		Person man = new Man();
		Visitor singerVisitor = new SingerVisitor();
		man.accept(singerVisitor);	//通过接收visitor，执行动作
		
		Visitor walkVisitor = new WalkVisitor();
		man.accept(walkVisitor);
		
	}
}
