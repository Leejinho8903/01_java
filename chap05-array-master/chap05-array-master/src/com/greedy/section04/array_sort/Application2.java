package com.greedy.section04.array_sort;

import java.util.Arrays;

public class Application2 {

	public static void main(String[] args) {
		
		/* 초기 배열 선언 및 초기화 */
		int[] iarr = {2, 5, 4, 6, 1, 3};
		
		int[] copy = iarr.clone();
		System.out.println("copy 정렬 전 : " + Arrays.toString(copy));
		Arrays.sort(copy);
		System.out.println("copy 정렬 후 : " + Arrays.toString(copy));
						
		/* 인덱스를 한 개씩 증가시키는 반복문
		 * 첫 번째 인덱스는 비교할 필요가 없으므로 1번 인덱스부터 비교를 시작한다. */
		for(int i = 1; i < iarr.length; i++) {
			
			/* 인덱스가 증가할 때마다 처음부터 해당 인덱스 - 1 까지의 값을 비교하는 반복문 */
			for(int j = 0; j < i; j++) {
				
				/* 오름차순 정렬을 위한 처리 
				 * 내림차순으로 구현하고자 한다면 부등호 방향을 반대로 처리 */
				if(iarr[i] < iarr[j]) {
					
					/* 값 위치 변경 */
					int temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
					
				}
			}
			
			System.out.println(i + "회차 : " + Arrays.toString(iarr));
			
		}
		
		/* 최종 결과 */
		System.out.println("정렬 완료 : " + Arrays.toString(iarr));
		
	}

}




