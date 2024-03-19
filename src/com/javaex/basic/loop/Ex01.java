package com.javaex.basic.loop;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Ex01");
		for(int i=2; i<10; i++) {
			for(int j=1; j<10 ;j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1; i<10; i++) {
			for(int j=2; j<10 ;j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nEx02");
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\nEx03");
		int num = 1;
		while(num > 0) {
			num++;
			if((num % 6) == 0 && (num % 14 == 0)) {
				System.out.println(num);
				break;
			}
		}
		
		num=0;
		do {
			num++;
			if((num % 6) == 0 && (num % 14 == 0)) {
				System.out.println(num);
				break;
			}
		} while(num > 0);
		
		for (; ; num++) {
			if((num % 6) == 0 && (num % 14 == 0)) {
				System.out.println(num);
				break;
			}
		}
	} // end main
}