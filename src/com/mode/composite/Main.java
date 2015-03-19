package com.mode.composite;

public class Main {
	public static void main(String[] arg){
		Render complexShape = new ComplexShapeComposite();
		complexShape.render();
	}
}
