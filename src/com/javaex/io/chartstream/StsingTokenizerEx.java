package com.javaex.io.chartstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StsingTokenizerEx {
	private static String roopPath = System.getProperty("user.dir") + "\\files\\";
	private static String filename = roopPath + "thieves.txt";
	
	public static void main(String[] args) {
		System.out.println("원본: " + filename);
		
		try (
				// 스트림 열기
				Reader fr = new FileReader(filename);
				BufferedReader br = new BufferedReader(fr);
		) {
			String line;	// 한 줄을 읽어오기 위한 변수
			while((line = br.readLine()) != null) {
				// 토크나이징 
				StringTokenizer st = new StringTokenizer(line, " ");
				while(st.hasMoreTokens()) {	// 뒤에 토큰이 더 들어있는가?
					String token = st.nextToken();
					System.out.println("Token: " + token);
				}
			}
			br.close();	// 보조 스트림을 닫으면 주스트림도 닫힌다.
		} catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}