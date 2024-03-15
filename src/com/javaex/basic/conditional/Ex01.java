package com.javaex.basic.conditional;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. >> ");
		int score = sc.nextInt();
		System.out.println("========== if문 ==========");
		if (score % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println(score + "은/는 3의 배수가 아닙니다.");
		}
		System.out.println("========== switch문 ==========");
		int result = score % 3;
		switch (result) {
		case 0:
			System.out.println("3의 배수입니다.");
			break;
		default:
			System.out.println(score + "은/는 3의 배수가 아닙니다.");
			break;
		}
		
		
		System.out.print("\n점수를 입력하세요. >> ");
		score = sc.nextInt();
		if(score <= 100 && score >= 90) {
			System.out.println("A 등급");
		} else if (score < 90 && score >= 80) {
			System.out.println("B 등급");
		} else if (score < 80 && score >= 70 ) {
			System.out.println("C 등급");
		} else if (score < 70 && score >= 60) {
			System.out.println("D 등급");
		} else if (score < 60 && score >=0) {
			System.out.println("F 등급");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
//		다른 풀이
		score /= 10;
		switch (score) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B 등급");
			break;
		case 7:
			System.out.println("C 등급");
			break;
		case 6:
			System.out.println("D 등급");
			break;
		default:
			System.out.println("F 등급");
			break;
		}
		
		sc.close();
	}
}