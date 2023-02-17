package com.greedy.section04.array_sort;

public class Application1 {

	public static void main(String[] args) {

		/* 변수의 두 값 변경하기 */
		int num1 = 10;
		int num2 = 20;
		
		/* 변경 전 값 출력 */
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		/* 두 변수의 값을 바꾸기 위해서는 다른 변수 한 개가 더 필요하다. */
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		/* 변경 후 값 출력 */
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		/* 배열의 인덱스에 있는 값도 서로 변경할 수 있다. */
		int[] arr = {2, 1, 3};
		
		int temp2 = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp2;
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
}
