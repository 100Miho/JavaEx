package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1, 3, 5, 7, 8, 10, 12 : 31일 입니다.
		// 4, 6, 9, 11 : 30일 입니다.
		// 나머지(2월) : 28일 입니다.
		System.out.print("월을 입력하세요. >> ");
		int month = sc.nextInt();
		String str = "잘못 입력하셨습니다.";
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			str = "31일 입니다.";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			str = "30일 입니다.";
			break;
		case 2:
			str = "28일 입니다.";
			break;
		}
		System.out.println(month >0 && month <13 ? month + "월은 " + str : str);
	}
}