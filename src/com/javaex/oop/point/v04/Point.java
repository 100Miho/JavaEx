package com.javaex.oop.point.v04;

public class Point {
	protected int x;
	protected int y;
//	private int x;
//	private int y;
	
//	public Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
	
	// 메서드 오버로딩
//	boolean bDrow = false;// treu이면 지움, false면 그림 
	public void draw(boolean bdraw) {
		String massage = String.format("점[x=%d, y=%d]를 그렸습니다.\n", x, y);
		massage +=  bdraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(massage);
	}
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]를 그렸습니다.\n", x, y);
	}
}