package com.greedy.section02.uses;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/* DTO를 활용한 간단한 회원 관리용 프로그램
		 * 1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
		 * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
		 * => 동일한 타입의 여러 개의 인스턴스를 인자로 전달하거나 리턴받는 경우에 객체 배열을 이용할 수 있다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		MemberManager memberManager = new MemberManager();
		
		menu :
		while(true) {
			System.out.println("===== 회원 관리 프로그램 =====");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : memberManager.signUpMembers(); break;
			case 2 : memberManager.printAllMembers(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break menu;
			default : System.out.println("잘못 된 번호를 입력하셨습니다."); break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
