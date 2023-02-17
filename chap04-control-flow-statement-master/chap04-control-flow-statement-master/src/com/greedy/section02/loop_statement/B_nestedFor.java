package com.greedy.section02.loop_statement;

import java.util.Scanner;

public class B_nestedFor {
	
	public void printGugudanFromTwoToNine() {
		
		/* for문 안에 for문을 이용할 수 있다. */
		
		//2 * 1 = 2
		//2 * 2 = 4
		//...
		//2 * 9 = 18
		//3 * 1 = 3
		//...
		//3 * 9 = 27
		//...
		//9 * 1 = 9
		//...
		//9 * 9 = 81
		
		for(int dan = 2; dan < 10; dan++) {
			
			System.out.println("========== " + dan + "단 ==========");
			
			for(int su = 1; su < 10; su++) {
				
				System.out.println(dan + " * " + su + " = " + (dan * su));
				
			}
			
		}
		
	}
	
	public void printStarInputRowTimes() {
		
		/* 키보드로 입력 받은 정수만큼 행으로 별을 출력하는 메소드 */
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		/* 입력한 행만큼 반복 */
		for(int i = 1; i <= row; i++) {
			
			/* 별을 5개 출력하는 것을 반복 */
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}
	
	public void printTriangleStars() {
		
		/* 키보드로 입력 받은 정수 행만큼 별을 삼각형 모양으로 출력한다. */
		
		//*
		//**
		//***
		//****
		//*****
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		/* 입력한 행만큼 반복 */
		for(int i = 1; i <= row; i++) {
			
			/* 행의 수만큼 별을 출력하는 반복문 */
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
