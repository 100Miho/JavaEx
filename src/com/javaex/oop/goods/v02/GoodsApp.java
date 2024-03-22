package com.javaex.oop.goods.v02;

public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("PENTAX");
		camera.setPrice(400_000);
//		
		Goods lgGram = new Goods();
		lgGram.setName("LG 그램");
		lgGram.setPrice(900_000);
//		
		Goods mugCup = new Goods();
		mugCup.setName("머그컵");
		mugCup.setPrice(2_000);
		
		System.out.println("[ 상품 정보 ]");
		camera.showInfo();
		System.out.println();
		lgGram.showInfo();
		System.out.println();
		mugCup.showInfo();
	}
}
