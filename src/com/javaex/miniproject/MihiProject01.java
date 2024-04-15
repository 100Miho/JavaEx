package com.javaex.miniproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MihiProject01 {
	private static String roopPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = roopPath + "PhoneDB.txt";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("********************************************");
		System.out.println("*          전화번호 관리 프로그램          *");
		System.out.println("********************************************");
		
		outerLabel:
		while(true) {
			// 파일을 ArrayList에 저장
			List <Person> list = new ArrayList<>();
			String line;
			int cnt=1;
			
			try(Reader fr = new FileReader(filename);
					BufferedReader br = new BufferedReader(fr);){
				
				while((line = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, ",");
					while(st.hasMoreTokens()) {
						String name = st.nextToken();
						String phone = st.nextToken();
						String tel = st.nextToken();
						
						list.add(new Person(cnt, name, phone, tel));
					}
					cnt++;
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
				
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("------------------------------------");
			System.out.printf(">메뉴번호: ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("<1.리스트>");
				
				try(Reader fr = new FileReader(filename);
						BufferedReader br = new BufferedReader(fr);){
					
					cnt=1;
					while((line = br.readLine()) != null) {
						StringTokenizer st = new StringTokenizer(line, ",");
						while(st.hasMoreTokens()) {
							String name = st.nextToken();
							String phone = st.nextToken();
							String tel = st.nextToken();

							System.out.printf("%d. %s, %s, %s%n", cnt, name, phone, tel);
						}
						cnt++;
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println();
				break;
			case 2:
				System.out.println("<2.등록>");
				System.out.printf(">이름: ");
				String name = sc.next();
				System.out.printf(">휴대전화: ");
				String phone = sc.next();
				System.out.printf(">회사전화: ");
				String tel = sc.next();
					
				list.add(new Person(cnt, name, phone, tel));
				
				saveTxt(list);
				
				System.out.println("[ 등록되었습니다. ]\n");
				break;
			case 3:
				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				int selectNum = sc.nextInt();
				list.remove(selectNum-1);
				
				saveTxt(list);
				break;
			case 4:
				System.out.println("<4.검색>");
				System.out.print(">이름: ");
				String inputTxt = sc.next();
				
				Iterator <Person> it = list.iterator();
				while(it.hasNext()) {
					Person obj = it.next();
					if(obj.getName().contains(inputTxt)) {
						System.out.println(obj.toString());
					}
				}
				break;
			case 5:
				System.out.println("********************************************");
				System.out.println("*                감사합니다                *");
				System.out.println("********************************************");
				
				sc.close();
				break outerLabel;
			default:
				System.out.println("[ 다시 입력해 주세요. ]");
				break;
			} // end switch
		} // end while
	}
	
	// 파일 덮어쓰기
	private static void saveTxt(List<Person> list) {
		try (FileWriter fw = new FileWriter(filename, false); // 파일 덮어쓰기 모드로 열기
		         PrintWriter pw = new PrintWriter(fw)) {
			
		        for (Person person : list) {
		            person.setTxt(pw);
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
	}
}