package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx01 {
	public static void main(String[] args) {
		// 스캐너 열기
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요. (1.JAVA 2.C 3.C++ 4.Python)");
		System.out.print("과목번호: ");

		
		// 과목 번호 입력
//		num = sc.nextInt();
		int sbj = sc.nextInt();
		
		// 조건 분기
//		if(num == 1) {
//			System.out.println("R101호 입니다.");
//		} else if (num == 2) {
//			System.out.println("R202호 입니다.");
//		} else if (num == 3) {
//			System.out.println("R303호 입니다.");
//		} else if (num == 4) {
//			System.out.println("R404호 입니다.");
//		} else {
//			System.out.println("상담원에게 문의하세요.");
//		}	
		switch (sbj) {
		case 1:	// sbj == 1;
			System.out.println("R101호 입니다.");
			break;
		case 2:	// sbj == 2;
			System.out.println("R202호 입니다.");
			break;
		case 3:	// sbj == 3;
			System.out.println("R303호 입니다.");
			break;
		case 4:	// sbj == 4;
			System.out.println("R404호 입니다.");
			break;
		default: // else
			System.out.println("상담원에게 문의하세요.");
			break;
		}
		
		// 스캐너 닫기
		sc.close();
	}
}