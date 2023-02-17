package com.greedy.section03.array_copy;

public class Application4 {

	public static void main(String[] args) {
		
		/* 두 개의 같은 값을 가지는 배열을 만든다. */
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1.clone();
		
		/* 일반 for문을 이용해 인덱스에 10씩 누적 증가 시킴 */
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] += 10;
		}
		
		/* 일반 for문을 이용해 값 출력 */
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		/* 향상 된 for문(for each문) : JDK 1.5버전부터 추가
		 * 배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행한다.
		 * */
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/* 향상 된 for문 이용해서 값 증가 시키기 */
		for(int i : arr2) {
			i += 10;
		}
		
		/* 증가 되었는지 출력 확인 */
		for(int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		/* 주의 : 향상 된 for문은 배열 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만 값을 변경할 수는 없다.
		 * 대신 변경이 아니라 사용이 목적인 경우 사용하기에는 편리하다.
		 * */
		
		/* 향상 된 for문으로 출력하기 */
		double[] darr = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6};
		
		for(double num : darr) {
			System.out.print(num + " ");
		}
		
		
		
		
		
		
		
		
	}

}






