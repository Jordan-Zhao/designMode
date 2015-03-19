package com.mode.decorator;

public class Main {
	public static void main(String[] arg){
		Drawable draw = new BobDraw();
		draw.draw();
		
//		BobDrawDecorator bobDrawDecorator = new BobDrawDecorator();
//		bobDrawDecorator.setBobDraw((BobDraw)draw);
//		draw = bobDrawDecorator;
//		draw.draw();
	}
}
