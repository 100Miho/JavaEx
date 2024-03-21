package com.javaex.basic.refType;

public class ArrayMultiDimEx {
	public static void main(String[] args) {
		// 2차원 배열 선언
		int[][] twoDimen = new int[5][10];
		
		int[][] table = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
		/* index[1]	*/   {2, 3, 4, 5, 6, 7, 8, 9, 10, 1},
		/* index[2]	*/   {3, 4, 5, 6, 7, 8, 9, 10, 1, 2},
		/* index[3]	*/   {4, 5, 6, 7, 8, 9, 10, 1, 2, 3},
		/* index[4]	*/   {5, 6, 7, 8, 9, 10, 1, 2, 3, 4}
		//              [0][1][2][3][4][5][6][7][8][9][10]
						};
		System.out.println(table); // 주소값 출력
		System.out.println("table.length = " + table.length);
		System.out.println("table[0].length = " + table[0].length);
		
		int sum = 0;
		// 행 루프
		for(int row=0; row<table.length; row++) {
			// 열 루프
			for(int col=0; col<table[row].length; col++) {
				sum += table[row][col];
				System.out.print(table[row][col] + ", ");
			}
			System.out.println("SUM = " + sum);
		}
	}
}