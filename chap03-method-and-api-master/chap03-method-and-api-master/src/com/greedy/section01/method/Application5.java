package com.greedy.section01.method;

public class Application5 {

	public static void main(String[] args) {
		/* 메소드 리턴 테스트 */
		/* 모든 메소드의 내부에는 return;이 존재한다.
		 * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가를 해준다.
		 * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.
		 * */
	}
	
	public void testMethod() {
		/* 컴파일러에 의해 자동으로 추가되는 구문이다.
		 * 가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다.
		 * */
		return;
		
		//System.out.println("무언가 출력해주세요");
	}
	
	
	
	
	
	
	
	
	
	
	

}
