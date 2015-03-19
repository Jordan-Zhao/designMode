package com.mode.composite;

/**
 * 组合形状
 * @author jindong.zjd
 *
 */
public class ComplexShapeComposite implements Render{
	private Render circle;
	private Render shapeComposite;
	
	public void render(){
		circle.render();
		shapeComposite.render();
	}

	public Render getCircle() {
		return circle;
	}

	public void setCircle(Render circle) {
		this.circle = circle;
	}

	public Render getShapeComposite() {
		return this.shapeComposite;
	}

	public void setShapeComposite(Render shapeComposite) {
		this.shapeComposite = shapeComposite;
	}
}
