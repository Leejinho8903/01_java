package com.greedy.section02.loop_statement;

import java.util.Scanner;

public class C_while {
	
	public void testSimpleWhileStatement() {
		
		/* 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 반복문 */
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
	}
	
	public void testWhileExample1() {
		
		/* 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		/* charAt() : String 클래스의 메소드로 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
		 * length() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환하는 기능
		 * index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 1 작은 수를 가진다.
		 * 만약 존재하지 않는 인덱스에 접근하게 되면 StringIndexOutOfBoundsException이 발생한다.
		 * (조건식이 i <= str.length() 가 될 경우) 
		 * 
		 * java.lang.StringIndexOutOfBoundsException: String index out of range: 5
		 * */
		
		int index = 0;
		while(index < str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
		}
		
	}
	
	public void testWhileExample2() {
		
		/* 정수 하나를 입력 받아 1부터 입력 받은 정수까지의 합계를 구한다. */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		/* while문 사용 */
		int i = 1;
		while(i <= num) {
			sum += i++;
			//i++; 누적 대입 연산보다 후위 연산자가 나중에 동작하므로 한 줄로 작성 가능
		}
		
		System.out.println("1부터 입력받은 정수 " + num + "까지의 합계는 " + sum + "입니다.");
	}
	
	public void testWhileExample3() {
		
		/* 중첩 while문을 이용한 구구단 출력 */
		int dan = 2;
		while(dan < 10) {
			
			int su = 1;
			while(su < 10) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
				su++;
			}
			
			dan++;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
