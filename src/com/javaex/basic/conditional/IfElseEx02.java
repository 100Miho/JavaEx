package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx02 {
	//숫자 입력, > : 0 양수, < 0 : 음수 , 0
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		
		// 숫자 입력
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		
		// 숫자 조건 분기
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		if (num > 0) {
			System.out.println("양수입니다.");
		} else {
			if (num < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("0입니다.");
			}
		}
		
		System.out.println("\n===== 연습문제 =====");
		System.out.print("숫자 입력 >> ");
		num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println(0);
		}
		if (num > 0) {
			String str= num % 2 == 0 ? "삼항연산자 - 짝수" : "삼항연산자 - 홀수";
			System.out.println(str);
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println(0);
		}
		
		System.out.println("\n===== 연습문제 =====");
		System.out.println("과목을 선택하세요.\n(1.JAVA 2.C 3.C++ 4.Python)");
		System.out.print("과목번호: ");
		num = sc.nextInt();
		if(num == 1) {
			System.out.println("R101호 입니다.");
		} else if (num == 2) {
			System.out.println("R202호 입니다.");
		} else if (num == 3) {
			System.out.println("R303호 입니다.");
		} else if (num == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		// 스캐너 닫기
		sc.close();
	}
}