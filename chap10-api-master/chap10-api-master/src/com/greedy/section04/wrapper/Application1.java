package com.greedy.section04.wrapper;

public class Application1 {

	public static void main(String[] args) {

		/* Wrapper 클래스 */
		/* 상황에 따라 기본 타입의 데이터를 인스턴스화 해야 하는 경우들이 발생한다.
		 * 이 때 기본 타입 데이터를 먼저 인스턴스로 변환한 후 사용해야 하는데,
		 * 8가지에 해당하는 기본 타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를 래퍼 클래스라고 한다.
		 * */
		
		/* Boxing과 UnBoxing
		 * 기본 타입을 래퍼 클래스의 인스턴스로 인스턴스화 하는 것을 박싱이라고 하며,
		 * 래퍼 클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 언박싱이라고 한다.
		 * */
		int intValue = 20;
		
		/* new Integer() : @Deprecated(since="9") 
		 * 동작하기는 하지만 앞으로 사용하지 않을 것을 권고하는 상태 */
		Integer boxingNumber1 = new Integer(intValue);		//인스턴스화 - 박싱 (생성자 이용)
		Integer boxingNumber2 = Integer.valueOf(intValue);	//인스턴스화 - 박싱 (static 메소드 이용)
		
		int unBoxingNumber1 = boxingNumber1.intValue();		//언박싱 (intValue 메소드 이용)
		
		/* 오토 박싱(Auto Boxing)과 오토 언박싱(Auto UnBoxing)
		 * JDK 1.5부터 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 자동으로 처리 해준다.
		 * */
		Integer boxingNumber3 = intValue;
		int unBoxingNumber2 = boxingNumber3;
		
		/* Wrapper 클래스 값 비교 */
		int inum = 20;
		Integer integerNum1 = new Integer(20);
		Integer integerNum2 = new Integer(20);
		Integer integerNum3 = 20;
		Integer integerNum4 = 20;
		
		/* 기본 타입과 레퍼런스 클래스 타입은 == 연산으로 비교 가능하다. */
		System.out.println("int와 Integer 비교 : " + (inum == integerNum1));
		System.out.println("int와 Integer 비교 : " + (inum == integerNum3));
		
		/* 생성자를 이용해 생성한 인스턴스의 경우 ==로 비교하지 못한다. (주소 값 비교) 
		 * 오토 박싱으로 생성한 값은 ==로 비교가 가능하다. 
		 * */
		System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum2));
		System.out.println("Integer와 Integer 비교 : " + (integerNum1 == integerNum3));
		System.out.println("Integer와 Integer 비교 : " + (integerNum3 == integerNum4));
		
		/* 래퍼 클래스 타입의 인스턴스의 "값"을 비교할 때는 equals()를 사용한다. */
		System.out.println("equals() : " + (integerNum1.equals(integerNum2)));
		System.out.println("equals() : " + (integerNum1.equals(integerNum3)));
		System.out.println("equals() : " + (integerNum3.equals(integerNum4)));
		
	}

}
