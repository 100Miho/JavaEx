package com.javaex.oop.goods.v03;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods("PENTAX", 400_000);
//		
		Goods lgGram = new Goods("LG 그램",900_000);
//		
		Goods mugCup = new Goods("머그컵", 2000);
		
		System.out.println("[ 상품 정보 ]");
		camera.showInfo();
		System.out.println();
		lgGram.showInfo();
		System.out.println();
		mugCup.showInfo();
	}
}