package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		/* java.util.Scanner를 이용한 다양한 자료형 값 입력 받기 */
		/* 콘솔 화면에 값을 입력 받아 출력해보기
		 * 이런 어려운 기능 또한 미리 JDK를 설치하면 손쉽게 사용할 수 있도록 구현해 놓았다.
		 * */
		
		/* Scanner 객체 생성 */
		Scanner sc = new Scanner(System.in);
		
		/* 자료형별 값 입력 받기 */
		/* 1-1. 문자열 입력 받기 
		 * nextLine() : 입력 받은 값을 문자열로 반환해줌 */
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("입력하신 이름은 " + name + "입니다.");
		
		/* 1-2. 정수형 값 입력 받기 */
		/* nextInt() : 입력 받은 값을 int형으로 반환해줌 
		 * 숫자가 아닌 값을 입력하게 되면 java.util.InputMismatchException이 발생함
		 * int 범위를 초과한 값을 입력하게 되면 역시 InputMismatchException이 발생함
		 * */
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("입력하신 나이는 " + age + "입니다.");
		
		/* nextLong() : 입력 받은 값을 long형으로 반환해줌
		 * nextInt와 Exception이 발생하는 이유는 동일하다.
		 * */
		System.out.print("금액을 입력하세요 : ");
		long money = sc.nextLong();
		System.out.println("입력하신 금액은 " + money + "원 입니다.");
		
		/* 1-3. 실수형 값 입력 받기 */
		/* nextFloat() : 입력 받은 값을 float 형으로 반환함 
		 * 숫자가 아닌 값의 경우 InputTypeMismatchException 발생
		 * 정수 입력 시 실수로 변환 후 정상 동작하며 길이를 길게 입력하면 유효자리 숫자까지만 표현
		 * */
		System.out.print("키를 입력하세요 : ");
		float height = sc.nextFloat();
		System.out.println("입력하신 키는 " + height + "cm 입니다.");
		
		/* nextDouble() : 입력 받은 값을 double 형으로 반환함 
		 * nextFloat와 유사하게 동작한다. 
		 * */
		System.out.print("원하는 실수를 입력하세요 : ");
		double number = sc.nextDouble();
		System.out.println("입력하신 실수는 " + number + "입니다.");
		
		/* 1-4. 논리형 값 입력 받기 */
		/* nextBoolean() : 입력 받은 값을 boolean 형으로 반환함 
		 * true of false 외의 다른 값을 입력하게 되면 InputTypeMismatchException 발생 */
		System.out.print("참과 거짓 중에 한가지를 true or false로 입력하세요 : ");
		boolean isTrue = sc.nextBoolean();
		System.out.println("입력하신 논리 값은 " + isTrue + "입니다.");
		
		/* 1-5. 문자형 입력 받기 */
		/* 문자를 직접 입력 받는 기능은 제공하지 않으므로
		 * 문자열로 입력 받고 입력 받은 문자에서 원하는 순번째 문자를 분리해서 사용해야 한다.
		 * java.lang.String의 charAt(int index)를 사용한다.
		 * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자형으로 반환해주는 기능을 한다.
		 * index는 0부터 시작하는 숫자 체계이며 컴퓨터에서 주로 사용되는 방식이다.
		 * 만약 존재하지 않는 인덱스를 입력하게 되면 java.lang.StringIndexOutOfBoundsException이 발생한다.
		 * */
		
		sc.nextLine();   //뒤에서 설명
		System.out.print("아무 문자나 입력 해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("입력하신 문자는 " + ch + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
