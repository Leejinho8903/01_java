package com.greedy.section05.calendar;

import java.util.Date;

public class Application1 {

	public static void main(String[] args) {
		
		/* Date 클래스 */
		/* JDK 1.0부터 날짜를 취급하기 위해 사용되던 Date 클래스는
		 * 생성자를 비롯하여 대부분의 메소드가 Deprecated 되어 있다. 
		 * */
		
		/* 1. 기본 생성자 
		 * : 운영 체제의 날짜와 시간 정보를 이용해서 인스턴스 생성 */
		Date today = new Date();
		
		/* toString() 메소드가 오버라이딩 되어 있어 쉽게 필드 값을 출력해볼 수 있다.*/
		System.out.println(today);
		
		/* getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 millisecond로 계산해서 long 타입으로 반환한다. */
		System.out.println(today.getTime());
		
		/* 2. 매개변수 생성자
		 * : 전달하는 long 타입의 숫자 기준의 날짜로 인스턴스 생성 */
		Date time = new Date(0L);
		System.out.println(time);
		
		
		
		
		
		
	}

}
