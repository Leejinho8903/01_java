package com.greedy.section01.intenum;

public class Application {
	
	public static void main(String[] args) {
		
		/* 정수 열거 패턴 단점 */
		/* 1. 정수 값 만을 저장하고 있는 필드일 뿐이다. */
		int subject1 = Subjects.JAVA;
		int subject2 = Subjects.HTML;
		
		/* 둘 다 상수 0을 가지기 때문에 구분이 불가능하다. */
		if(subject1 == subject2) {
			System.out.println("두 과목은 같은 과목입니다.");
		}
		
		/* 2. 이름 충돌 방지를 위해 접두어를 써서 구분해야 한다. 
		 * BACKEND_JAVASCRIPT = 0;
		 * FRONTEND_JAVASCRIPT = 0;
		 * */
		
		/* 3. 문자열로 출력하기 까다롭다. */
		int num = 2;
		String subjectText = "";
		
		switch(num) {
		case Subjects.JAVA : subjectText = "JAVA"; break;
		case Subjects.ORACLE : subjectText = "ORACLE"; break;
		case Subjects.JDBC : subjectText = "JDBC"; break;
		}
		
		System.out.println("subjectText : " + subjectText);
		
		/* 4. 같은 그룹에 속한 상수들을 순회(반복문 사용) 할 수 없고 전체 상수의 개수 확인도 불가능하다. */
		
		/* 5. 타입 안정성을 보장할 수 없다.*/
		printSubject(Subjects.ORACLE);
		printSubject(1);
	}
	
	
	public static void printSubject(int subjectNumber) {

		String subjectText = "";
		
		switch(subjectNumber) {
		case Subjects.JAVA : subjectText = "JAVA"; break;
		case Subjects.ORACLE : subjectText = "ORACLE"; break;
		case Subjects.JDBC : subjectText = "JDBC"; break;
		}
		
		System.out.println("subjectText : " + subjectText);
	}
	
	
	
	
	
	
	
	
	
	
	

}
