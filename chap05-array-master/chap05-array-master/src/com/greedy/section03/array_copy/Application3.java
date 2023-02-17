package com.greedy.section03.array_copy;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {
		
		/* 깊은 복사는 heap에 생성 된 배열이 가지고 있는 값을 또 다른 배열에 복사하는 것이다.
		 * 서로 같은 값을 가지고 있지만, 두 배열을 서로 다른 배열이기에 하나의 배열을 변경해도
		 * 다른 배열에 영향을 주지 않는다. 
		 * */
		
		/* 깊은 복사를 하는 방법은 4가지가 있다.
		 * 1. for문을 이용한 동일한 인덱스 값 복사 
		 * 2. Object의 clone()을 이용한 복사
		 * 3. System의 arraycopy()를 이용한 복사
		 * 4. Arrays의 copyOf()를 이용한 복사
		 * 
		 * 이 방법 중 가장 높은 성능을 보이는 방법은 순수 배열 복사를 위해 만들어진 arraycopy() 메소드이다.
		 * 가장 많이 사용 되는 방식은 좀 더 유연한 방식인 copyOf() 메소드이다.
		 * clone()은 이전 배열과 같은 배열 밖에 만들 수 없으며 그 외 3가지 방식은 복사 배열의 길이를
		 * 마음대로 조정할 수 있다는 특징을 가지고 있다.
		 * */
		
		/* 원본 배열 */
		int[] originArr = {1, 2, 3, 4, 5};
		
		/* 1. for문을 이용한 동일한 인덱스 값 복사 */
		int[] copyArr1 = new int[10];
		
		for(int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		
		print(originArr);
		print(copyArr1);
		
		/* 2. Object의 clone()을 이용한 복사 */
		int[] copyArr2 = originArr.clone();
		print(copyArr2);
		
		/* 3. System의 arraycopy()를 이용한 복사 */
		int[] copyArr3 = new int[10];
		
		/* 원본 배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이의 의미를 가진다. */
		System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
		
		print(copyArr3);
		
		/* 4. Arrays의 copyOf()를 이용한 복사 */
		/* 시작 인덱스부터 원하는 길이만큼만 복사해서 사용 가능하다. */
		int[] copyArr4 = Arrays.copyOf(originArr, 10);
		print(copyArr4);
	}
	
	/* 배열을 매개변수로 받아 모든 인덱스에 저장 되어 있는 값을 출력하는 기능을 제공하는 메소드 */
	public static void print(int[] iarr) {
		
		System.out.println("iarr의 hashcode : " + iarr.hashCode());
		
		for(int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i] + " ");
		}
		
		System.out.println();
	}

	
	
	
	
	
	
	
}
