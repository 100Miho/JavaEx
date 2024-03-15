package com.javaex.basic.loop;

import java.util.Scanner;

public class WhileExGugu {
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 단 입력받기
		System.out.print("단을 입력해 주세요. >> ");
		int dan = sc.nextInt();
		int num=1;
		
		// 1 ~ 9 까지 while loop
		//		단 * num 출력
		while (num <= 9) {
			System.out.println(dan + " * " + num + " = " + dan*num);
			num += 1;
		}
		
		sc.close();
	}
}