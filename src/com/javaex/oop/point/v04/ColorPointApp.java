package com.javaex.oop.point.v04;

public class ColorPointApp {
	public static void main(String[] args) {
		Point p = new Point(4,4);
		ColorPoint cp1 = new ColorPoint("Mint");
		ColorPoint cp2 = new ColorPoint(10, 10, "Blue");
		
		p.draw();
		cp1.draw();
		cp2.draw();
		
		cp1.draw(true);
		cp2.draw(false);
	}
}