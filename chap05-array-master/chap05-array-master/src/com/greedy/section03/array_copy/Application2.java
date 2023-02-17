package com.greedy.section03.array_copy;

public class Application2 {

	public static void main(String[] args) {
		
		/* 얕은 복사의 활용 */
		/* 얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
		 * 리턴 값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
		 * */
		String[] names = {"유관순", "홍길동", "신사임당"};
		System.out.println("names의 hashcode : " + names.hashCode());
		
		/* print 메소드의 인자로 names 전달 */
		print(names);
		
		/* 리턴 값으로도 활용 */
		String[] animals = getAnimals();
		System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());
		
	}
	
	/* 배열을 매개변수로 받아 모든 인덱스에 저장 되어 있는 값을 출력하는 기능을 제공하는 메소드 */
	public static void print(String[] sarr) {
		
		System.out.println("sarr의 hashcode : " + sarr.hashCode());
		
		for(int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
		
		System.out.println();
	}
	
	/* 동물 종류로 생성 된 문자열 배열을 반환하는 메소드 */
	public static String[] getAnimals() {
		
		String[] animals = {"낙타", "호랑이", "나무늘보"};
		
		System.out.println("새로 만든 animals의 hashcode : " + animals.hashCode());

		return animals;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
