package com.greedy.section04.array_sort;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {

		/* 배열 중복 제거 아이디어 */
		/* 10개짜리 int형 배열에 1~20 사이의 난수 값을 채워서 출력한다.
		 * 단, 중복은 허용하지 않는다. */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
			
			/* 현재 랜덤 값을 채운 인덱스 이전의 인덱스를 확인하는 반복문 */
			for(int j = 0; j < i; j++) {
				
				/* 현재 랜덤 값 arr[i]와 이전 인덱스의 값 arr[j]가 같다면 중복 */
				if(arr[i] == arr[j]) {
					System.out.println(i + "인덱스에 " + arr[i] + "중복 값 발생");
					i--;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
