package com.javaex.basic.loop;

public class LoopPractice {
	public static void main(String[] args) {
		System.out.println("For문 구구단");
		forGugu();
		System.out.println("\nWhile문 구구단");
		whileGugu();
		System.out.println("\nDo~While문 구구단");
		doWhileGugu();
	}
	
	public static void forGugu() {
		for (int dan=2; dan<10; dan++) {
			for (int num=1; num<10; num++) {
				System.out.printf("%d*%d=%d\t", dan, num, dan*num);
			}
			System.out.println();
		}
	}
	
	public static void whileGugu() {
		int dan=2, num=1;
		while(dan < 10) {
			while(num < 10) {
				System.out.printf("%d*%d=%d\t", dan, num, dan*num);
				num++;
			}
			System.out.println(dan);
			num=1;
			dan++;
		}
	}
	
	public static void doWhileGugu() {
		int dan=1;
		do {
			int num=1;
			dan++;
			System.out.println();
			do {
				System.out.printf("%d*%d=%d\t", dan, num, dan*num);
				num++;
			} while (num < 10);
		} while (dan < 9);
	}
}