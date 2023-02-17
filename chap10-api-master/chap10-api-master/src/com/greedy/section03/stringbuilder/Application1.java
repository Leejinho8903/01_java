package com.greedy.section03.stringbuilder;

public class Application1 {

	public static void main(String[] args) {
		
		/* String : 불변
		 * 문자열에 + 연산으로 합치기 하는 경우 기존 인스턴스를 수정하지 않고 새로운 인스턴스를 반환
		 * => 문자열 변경이 자주 일어나는 경우 성능 면에서 좋지 않다.
		 * => 변하지 않는 문자열을 자주 읽어 들이는 경우 좋은 성능을 기대할 수 있다.
		 * 
		 * StringBuilder : 가변
		 * 문자열에 append() 메소드를 이용하여 합치기 하는 경우 기존 인스턴스를 수정하고 새로운 인스턴스를 생성하지 않음
		 * => 잦은 문자열 변경이 일어나는 경우 String 보다 성능이 좋다.
		 * */
		
		StringBuilder sb = new StringBuilder("java");
		
		System.out.println("sb : " + sb);	//toString 오버라이딩 되어 가지고 있는 문자열이 출력 된다.
		
		/* hashCode는 오버라이딩 되어 있지 않다.
		 * 즉, 동일한 값을 가지는 경우 같은 해쉬코드를 반환하지 않고, 인스턴스가 동일해야 같은 해쉬코드를 반환한다. */
		System.out.println("sb의 hashCode : " + sb.hashCode());
		
		/* 문자열 수정 */
		sb.append("oracle");
		
		System.out.println("sb : " + sb);
		
		/* 문자열을 수정해도 기존의 인스턴스와 동일한 주소 값을 가지고 있다.
		 * 즉, 문자열을 변경 해도 새로운 인스턴스가 생성 된 것이 아니다. */
		System.out.println("sb의 hashCode : " + sb.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
