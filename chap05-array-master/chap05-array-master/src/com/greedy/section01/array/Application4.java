package com.greedy.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {

		/* 배열을 이용한 예제 */
		/* 5명의 자바 점수를 정수로 입력 받아서 합계와 평균을 실수로 구하는 프로그램 */
		
		/* 5명의 자바 점수를 저장할 배열 할당 */
		int[] score = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		/* 반복문을 이용하여 배열 인덱스에 하나씩 접근해서 점수를 저장한다. */
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 학생의 자바 점수를 입력 : ");
			score[i] = sc.nextInt();
		}
		
		/* 합계와 평균을 구한다. */
		double sum = 0.0;
		double avg = 0.0;
		
		/* 합계는 모든 인덱스의 값을 sum 변수에 누적해서 담아준다. */
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		/* 평균은 합계를 구한 값에서 배열의 길이(숫자)로 나눈다. */
		avg = sum / score.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
		
	}

	
	
	
	
	
	
	
	
	
}
