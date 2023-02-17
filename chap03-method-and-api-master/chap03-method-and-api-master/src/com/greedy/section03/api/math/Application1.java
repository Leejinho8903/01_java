package com.greedy.section03.api.math;

public class Application1 {

	public static void main(String[] args) {
		
		/* API(Application Programming Interface) 
		 * 응용프로그램에서 제어할 수 있도록, 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스
		 * 우리가 구현할 수 없거나 구현하기 번거로운 기능을 JDK를 설치하면 사용할 수 있도록 제공해놓은 소스 코드를 의미
		 * 모든 코드를 외울 수 없으므로 API 문서를 별도로 제공해주고 있다.
		 * */
		
		/* java.lang.Math 
		 * Math 클래스는 수학에서 자주 사용하는 상수들과 메소드들을 미리 구현해놓은 클래스이다.
		 * API 문서에서 확인하면 Math 클래스는 모두 static으로 선언 되어 있으므로
		 * static 메소드 호출 방식으로 호출한다.
		 * */
		
		/* 절대값 출력 */
		System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));
		
		/* java.lang 패키지 하위에 있는 클래스는 import 구문이 불필요하다.
		 * 워낙 자주 쓰는 기능이 담긴 패키지여서 컴파일러가 import java.lang.*; 이라는 코드를 자동으로 
		 * 추가해서 컴파일한다. */
		System.out.println("-7의 절대값 : " + (Math.abs(-7)));
	
		/* 최대값, 최소값 */
		System.out.println("10과 20 중 더 작은 것은 : " + Math.min(10, 20));
		System.out.println("10과 20 중 더 큰 것은 : " + Math.max(10, 20));
		
		/* 수학적으로 많이 사용하는 고정 된 값들도 이미 Math에 정의 된 것이 있다.
		 * 필드라는 것을 이용한 것인데 이 부분은 나중에 자세히 다룬다.
		 * */
		System.out.println("원주율 : " + Math.PI);
		
		/* 난수를 발생시키는 메소드
		 * 0부터 1 전까지의 실수 형태의 난수를 발생시킨다. */
		System.out.println("난수 발생 : " + Math.random());
		
		
		
		
		
		
		
	}

}
