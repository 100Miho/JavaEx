package com.javaex.basic.refType;

public class ArrayEx {
	public static void main(String[] args) {
		// 배열을 생성하는 여러가지 방법
		String[] names; // 타입[] 식별자(변수명)
		int scores[];	// 타입 식별자(변수명)[]
		
		// 초기화 방법
		names = new String[] {"곤", "키르아", "크라피카", "레오리오"};
//				new 키워드로 기본값과 함께 생성

		float height[] = {162.5f, 172.8f, 175.5f, 180.3f};	// 값 목록을 가지고 있을 때
		
		// 값을 가지고 있지 않고, 공간의 개수만 알고 있을 때
		scores = new int[4];
//		index는 0부터
//		데이터의 총 길이: .length - 1
		scores[0] = 48;
		scores[1] = 65;
		scores[2] = 87;
		scores[3] = 76;
		// scores[4] = 92; // -> index 초과 (IndexOutOfBounds)
		
		for(int i=0; i<names.length; i++) {
			// 배열의 총 길이는 배열의 .length -1
			System.out.printf("%s(%.2f) : scores = %d%n",names[i], height[i] ,scores[i]);
		}
	}
}