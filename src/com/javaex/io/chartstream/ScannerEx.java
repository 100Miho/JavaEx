package com.javaex.io.chartstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
	private static String roopPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = roopPath + "thieves.txt";
	
	public static void main(String[] args) {
		// 입력 소스(파일)
		File file = new File(filename);
		
		try {
		Scanner sc = new Scanner(file);
		// 데이터 저장 변수
		String name;
		float height;
		float weight;
		while(sc.hasNextLine()) {
			name = sc.next();	// 문자열 토큰 읽기
			height = sc.nextFloat();	// 실수 토큰 읽기
			weight = sc.nextFloat();	// 실수 토큰 읽기
			
			System.out.printf("%s, 키: %f, 체중: %f%n", name, height, weight);
			sc.nextLine();
		}
		
		sc.close();
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}