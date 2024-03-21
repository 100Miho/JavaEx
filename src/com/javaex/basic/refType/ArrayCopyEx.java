package com.javaex.basic.refType;

import java.util.Arrays;

public class ArrayCopyEx {
	public static void main(String[] args) {
//	배열은 크기 변경 불가
//	공간을 늘리고자 한다면 새 배열 생성 후 복사
		
		//For 문을 이용한 배열 복사
//		arrayCopyByFor();
		
		// System을 이용한 배열 복사
		arrayCopyBySystem();
	}
	
	public static void arrayCopyByFor() {
		int scores[] = {1, 2, 3};	// .length == 3
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		
		System.out.println();
		
		
		// 새 공간을 만들어 복사
		int[] target = new int[10];
		for(int i=0; i<scores.length; i++) {
			target[i] = scores[i];
			System.out.print(target[i] + "\t");
		}
		
		System.out.println();
		
		
		// 배열 유틸리티 클래스를 이용한 출력
		System.out.println(Arrays.toString(target));
	}
	
	public static void arrayCopyBySystem() {
		int[] source = {1, 2, 3};
		int target[] = new int[10];
		
		System.out.println(Arrays.toString(source));
		
		// 배열 복제
//                      원본배열, 원본배열의 복사 시작 index, 복사 대상 배열, 대상배열의 시작 index, 복사할 길이
		System.arraycopy(source, 0, target, 3, source.length);
		System.out.println("target = " + Arrays.toString(target));
		
		// Enhanced For문 (확장된 For문)
//		for(추출 될 데이터 : 원본 배열or컬렉션)
		for(int value : source) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
}