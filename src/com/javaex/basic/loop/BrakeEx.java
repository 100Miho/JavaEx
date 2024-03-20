package com.javaex.basic.loop;

public class BrakeEx {
	public static void main(String[] args) {
		System.out.println("Ex01 - 6과 14로 나누어 떨어지는 숫자 찾기");
		// 6과 14로 나누어 떨어지는 숫자 찾기
//				반복 횟수를 정확하게 알기 힘든 경우 -> while
		int num =1;
		while(true) {
			if((num % 6) == 0 && (num % 14 == 0)) {
				break;
			}
			num++;
		}
		System.out.println(num);
		
		System.out.println("\nEx02 - 미니 로또 (중복 허용)");
		for(int i=1; i<=6; i++) {
			int ran = (int)(Math.random()*45) + 1;
			System.out.printf("%d, ", ran);
		}
		// while
		num = 6;
		while (num<6) {
			System.out.print((int)(Math.random()*45) + 1 + ", ");
			num++;
		}
		
		System.out.println("\n\nEx02 - 미니 로또 (중복 불허)");
		while(true) {
			for(int i=1; i<4; i++) {
				num = (int)(Math.random()*45) + 1;
				int ran = (int)(Math.random()*45) + 1;
				if (num == ran) {
					ran = (int)(Math.random()*45) + 1;
				}
				System.out.print(num + ", ");
				System.out.print(ran + ", ");
			}
			break;
		}
	} // end main
}