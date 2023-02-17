package com.greedy.section02.loop_statement;

import java.util.Scanner;

public class A_for {
	
	public void testSimpleForStatement() {
		
		/* 1부터 10까지 1씩 증가시키면서 값을 출력하는 기본 반복문 */
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//for문 초기식에 선언한 변수는 for문 내에서만 사용 가능
		//System.out.println(i);
	
	}
	
	public void testForExample() {
		
		/* 1~10까지의 합계를 구한다. */
		
		/* 결과를 누적시켜 담아줄 변수 선언 */
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("sum : " + sum);
		
	}
	
	public void testForExample2() {
		
		/* 5~10 사이의 난수를 발생시켜서 1에서부터 발생한 난수까지의 합계를 구한다. */
		int random = (int) (Math.random() * 6) + 5;
		
		int sum = 0;
		
		for(int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.println("1부터 " + random + "까지의 합계는 " + sum + "입니다.");
		
	}
	
	public void testForExample3() {
		
		/* 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구한다.
		 * 단, 두 숫자는 같은 숫자를 입력하지 않는 가정으로 해결한다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		
		/* first와 second 중 어느 것이 더 큰 수인지 확인하면
		 * 작은 수에서 시작해서 큰 수까지의 합계를 구하는 반복문을 작성할 수 있다.
		 * */
		int min = 0;
		int max = 0;
		
		if(first > second) {
			max = first;
			min = second;
		} else {
			max = second;
			min = first;
		}
		
		int sum = 0;
		
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		System.out.println(min + "부터 " + max + "까지의 합은 " + sum + "입니다.");
		
		
	}
	
	public void printSimpleGugudan() {
		
		/* 키보드로 정수 값을 입력 받아 2~9 사이의 값인 경우 해당 단의 구구단을 출력하고
		 * 그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다."를 출력한다.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		/* 입력한 숫자가 2~9 사이인지 조건 확인 */
		if(dan >= 2 && dan <= 9) {
			// 2 * 1 = 2
			// 2 * 2 = 4
			// ...
			// 2 * 9 = 18
			for(int su = 1; su <= 9; su++) {
				System.out.println(dan + " * " + su + " = " + (dan * su));
			}
			
		} else {
			System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
