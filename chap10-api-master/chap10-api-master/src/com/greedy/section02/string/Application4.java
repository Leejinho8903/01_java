package com.greedy.section02.string;

public class Application4 {

	public static void main(String[] args) {
		
		/* 개행 문자 */
		System.out.println("안녕하세요.\n저는 홍길동입니다.");
		
		/* 탭 문자 */
		System.out.println("안녕\t하세요.저는 홍길동입니다.");
		
		/* 홑따옴표 문자 */
		System.out.println("안녕하세요 저는 '홍길동'입니다.");
//		System.out.println(''');		//홑따옴표 문자와 문자 리터럴 기호가 중복 됨
		System.out.println('\'');		//이스케이프 문자를 사용해서 구분해줌

		/* 쌍따옴표 문자 */
//		System.out.println("안녕하세요 저는 "홍길동"입니다.");	
		System.out.println("안녕하세요 저는 \"홍길동\"입니다.");
		
		/* 역슬래쉬 문자 */
//		System.out.println("안녕하세요 저는 \홍길동\입니다.");	//역슬래쉬를 표현하고 싶지만 이스케이프 문자 예약 문자와 겹침
		System.out.println("안녕하세요 저는 \\홍길동\\입니다.");	
		
		
		
		
		
	}

}
