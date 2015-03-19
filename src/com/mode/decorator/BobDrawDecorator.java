package com.mode.decorator;

public class BobDrawDecorator implements Drawable{
	private BobDraw bobDraw;
	
	public void draw(){
		System.out.println("before bob draw.");
		bobDraw.draw();
		System.out.println("after bob draw.");
	}

	public BobDraw getBobDraw() {
		return bobDraw;
	}

	public void setBobDraw(BobDraw bobDraw) {
		this.bobDraw = bobDraw;
	}
	
}
