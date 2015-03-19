package com.mode.composite;

/**
 * 组合形状
 * @author jindong.zjd
 *
 */
public class ShapeComposite implements Render{
	private Render circle;
	private Render square;
	
	public void render(){
		circle.render();
		square.render();
	}

	public Render getCircle() {
		return circle;
	}

	public void setCircle(Render circle) {
		this.circle = circle;
	}

	public Render getSquare() {
		return square;
	}

	public void setSquare(Render square) {
		this.square = square;
	}
	
	
}
