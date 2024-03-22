package com.javaex.oop.goods.v02;

// Ver02. Private
public class Goods {
	// Field (맴버변수)
	private String name;
	private int price;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public void showInfo() {
		System.out.println("상품 이름: " + name);
		System.out.println("가격: " + price);
	}
}