package com.greedy.section01.method;

public class Calculator {
	
	/* 매개변수로 전달 받은 두 수를 비교하여 더 작은 값을 가진 정수를 반환하는 메소드 
	 * 같은 값을 가지는 조건에 대해서는 처리하지 않음 */
	public int minNumberOf(int first, int second) {
		
		return first > second ? second : first;
	}
	
	/* 매개변수로 전달 받은 두 수를 비교하여 더 큰 값을 가지는 정수를 반환하는 메소드
	 * 같은 값을 가지는 조건에 대해서는 처리하지 않음 (maxNumberOf) */
	public static int maxNumberOf(int first, int second) {
		
		return first > second ? first : second;
	}

}






