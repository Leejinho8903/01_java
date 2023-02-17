package com.greedy.section03.array_copy;

public class Application1 {

	public static void main(String[] args) {
		
		/* 배열의 복사 */
		/* 배열의 복사에는 크게 2가지가 있다.
		 * 1. 얕은 복사(shallow copy) : stack의 주소값만 복사
		 * 2. 깊은 복사(deep copy) : heap의 배열에 저장 된 값을 복사
		 * */
		
		/* 얕은 복사를 확인할 원본 배열 생성 */
		int[] originArr = {1, 2, 3, 4, 5};
		
		/* 원본 배열을 복사 배열에 복사 */
		int[] copyArr = originArr;
	
		/* hashcode 출력해서 확인 */
		System.out.println(originArr.hashCode());
		System.out.println(copyArr.hashCode());
		
		/* 복사본 배열을 통해 값 변경 후 출력 
		 * 복사본 배열만 변경하더라도 원본 배열에 영향을 미침을 알 수 있다.
		 * 서로 같은 배열을 가리키고(참조하고) 있기 때문이다. */
		copyArr[0] = 99;
		
		for(int i = 0; i < originArr.length; i++) {
			System.out.print(originArr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		
		System.out.println();

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
