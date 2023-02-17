package com.greedy.section01.array;

public class Application3 {

	public static void main(String[] args) {
		
		/* 기본적으로 배열을 선언하고 할당하게 되면 
		 * 배열의 각 인덱스는 자바에서 지정한 기본 값으로 초기화 된 상태가 된다.
		 * heap 영역은 값이 없는 빈 공간이 존재할 수 없다.
		 * */
		
		/* int의 기본 값인 0으로 초기화 되어 있다. */
		int[] iarr = new int[5];
		for(int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}
		
		/* 지정 된 기본 값 외의 값으로 초기화 하고 싶은 경우 {} 블럭을 이용한다.
		 * 이 때 new 연산자를 사용하지 않아도 되며, 값의 개수만큼 자동으로 크기가 설정 된다.
		 * */
		int[] iarr2 = {11, 22, 33, 44, 55};
		int[] iarr3 = new int[] {66, 77, 88, 99};
		
		for(int i = 0; i < iarr2.length; i++) {
			System.out.println(iarr2[i]);
		}
		
		for(int i = 0; i < iarr3.length; i++) {
			System.out.println(iarr3[i]);
		}
		
		/* 문자열도 배열로 사용할 수 있다. */
		String[] sarr = new String[5];
		
		for(int i = 0; i < sarr.length; i++) {
			System.out.println(sarr[i]);
		}
		
		String[] sarr2 = {"apple", "banana", "grape", "orange"};
		
		for(int i = 0; i < sarr2.length; i++) {
			System.out.println(sarr2[i]);
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
