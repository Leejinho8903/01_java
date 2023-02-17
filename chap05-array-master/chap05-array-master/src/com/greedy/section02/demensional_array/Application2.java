package com.greedy.section02.demensional_array;

public class Application2 {

	public static void main(String[] args) {
		/* 2차원 정변 배열을 선언 및 할당하고 차례로 값을 대입해서 출력해보자. */
		
		/* 1. 배열의 선언과 할당 
		 * 정변 배열의 경우 각 인덱스별 배열을 따로 할당할 수도 있지만 선언과 동시에 모든 배열을 할당할 수 있다.
		 * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][할당할 배열의 길이]
		 * */
		int[][] iarr = new int[3][5];
		
		/* 2. 각 배열의 인덱스에 접근해서 값 대입 후 출력 */
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		
		int value = 1;
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = value++;
			}
		}
		
		/* 값 출력 */
		for(int i = 0; i < iarr.length; i++) {
			for(int j = 0; j < iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	
	
	
	
	
	
	
	
}
