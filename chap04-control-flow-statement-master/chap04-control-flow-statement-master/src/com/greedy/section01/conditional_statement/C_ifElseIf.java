package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class C_ifElseIf {
	
	public void testSimpleIfElseIfStatement() {
		
		/* 90점 이상 A, 80점 이상 90점 미만 B, 70점 이상 80점 미만 C, 60점 이상 70점 미만 D, 
		 * 60점 미만은 F로 점수에 따른 성적을 매긴다.
		 * */
		
		/* 학생의 이름과 점수 입력 받기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		/* 학생의 등급을 저장하기 위한 변수 초기화 */
		String grade = "";
		
		if(point >= 90) {
			grade = "A";
		} else if(point >= 80 /*&& point < 90*/) {
			grade = "B";
		} else if(point >= 70) {
			grade = "C";
		} else if(point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println(name + " 학생의 점수는 " + point + "점이고, 등급은 " + grade + "입니다.");

	}
	
	public void testNestedIfElseIfStatement() {
		
		/* 중첩 된 if-else if-else 실행 흐름 확인
		 * if-else if-else 문 안에서 또 다른 조건을 사용하여 if or if-else or if-else if-else문을 사용할 수 있다.
		 * */
		
		/* 학생의 이름과 점수 입력 받기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		/* 학생의 등급을 저장하기 위한 변수 초기화 */
		String grade = "";
		
		if(point >= 90) {
			grade = "A";
			
			if(point >= 95) {
				grade += "+";
			}
			
		} else if(point >= 80 /*&& point < 90*/) {
			grade = "B";
			
			if(point >= 85) {
				grade += "+";
			}
			
		} else if(point >= 70) {
			grade = "C";
			
			if(point >= 75) {
				grade += "+";
			}
			
		} else if(point >= 60) {
			grade = "D";
			
			if(point >= 65) {
				grade += "+";
			}
			
		} else {
			grade = "F";
		}
		
		System.out.println(name + " 학생의 점수는 " + point + "점이고, 등급은 " + grade + "입니다.");
		
	}
	
	public void improveNestedIfElseIfStatement() {
		
		/* 위에서 작성한 코드를 개선해본다. */
		
		/* 학생의 이름과 점수 입력 받기 */
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("점수를 입력하세요 : ");
		int point = sc.nextInt();
		
		/* 학생의 등급을 저장하기 위한 변수 초기화 */
		String grade = "";
		
		if(point >= 90) {
			grade = "A";
		} else if(point >= 80 /*&& point < 90*/) {
			grade = "B";
		} else if(point >= 70) {
			grade = "C";
		} else if(point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		/* 각 등급의 중간 점수 이상이면서 60점 이상인지, 또는 100점인 경우 => "+" 추가 */
		if(point % 10 >= 5 && point >= 60 || point == 100) {
			grade += "+";
		}
		
		System.out.println(name + " 학생의 점수는 " + point + "점이고, 등급은 " + grade + "입니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
