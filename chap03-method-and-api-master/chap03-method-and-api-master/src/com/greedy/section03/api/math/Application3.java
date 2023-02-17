package com.greedy.section03.api.math;

import java.util.Random;

public class Application3 {

	public static void main(String[] args) {
		
		/* java.util.Random 클래스 */
		/* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
		 * nextInt(bound) : 0부터 매개변수로 전달 받은 정수 범위까지의 난수를 발생시켜 정수 형태로 변환
		 * */
		
		/* random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값 */
		
		Random random = new Random();	//임포트 구문 필요
		
		/* 0부터 9까지의 난수 발생 */
		int random1 = random.nextInt(10);
		System.out.println("0부터 9까지의 난수 : " + random1);
		
		/* 1부터 10까지의 난수 발생 */
		int random2 = random.nextInt(10) + 1;
		System.out.println("1부터 10까지의 난수 : " + random2);
		
		/* 20부터 45까지의 난수 발생 */
		int random3 = random.nextInt(26) + 20;
		System.out.println("20부터 45까지의 난수 : " + random3);
		
		
		
		
		
	}

}
