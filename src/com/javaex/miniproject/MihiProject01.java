package com.javaex.miniproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MihiProject01 {
	private static String roopPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = roopPath + "PhoneDB.txt";
	
	public static void main(String[] args) {
		File file = new File(filename);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("********************************************");
			System.out.println("*          전화번호 관리 프로그램          *");
			System.out.println("********************************************");
			while(true) {
				System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
				System.out.println(">메뉴번호: ");
				int select = sc.nextInt();
				switch(select) {
				case 1:
					Scanner dbsc = new Scanner(file);
					String name;
					String phone;
					String tel;
					
					while(dbsc.hasNextLine()) {
						int cnt = 1;
						name = dbsc.next();
						phone = dbsc.next();
						tel = dbsc.next();
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("잘못 입럭하셨습니다.");
					break;
				}
			} // end while
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}