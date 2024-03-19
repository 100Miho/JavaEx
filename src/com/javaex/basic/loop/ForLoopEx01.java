package com.javaex.basic.loop;

import java.util.Scanner;

public class ForLoopEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 단을 입력
		System.out.print("단을 입력해 주세요 >> ");
		int dan = sc.nextInt();
		
		// for 루프로 1 ~ 9 반복
		// 단 * num = 
		
//		for(초기화; 반복여부 체크; 증감식)
		for(int i=1; i<=9 ; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
		// For문의 무한루프
//		for( ; ; ;) {}
		
		sc.close();
	}
}