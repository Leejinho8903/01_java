package com.greedy.section01.polymorphism;

public class Rabbit extends Animal {

	/* 동물이 하는 행동을 보다 구체화 하여 행동할 수 있도록 Animal 클래스의 메소드를 오버라이딩한다. */

	@Override
	public void eat() {
		System.out.println("토끼가 풀을 뜯어먹고 있습니다.");
	}

	@Override
	public void run() {
		System.out.println("토끼가 달려갑니다. 깡총~ 깡총~");
	}

	@Override
	public void cry() {
		System.out.println("토끼가 울음소리를 냅니다. 끼익~ 끼익~");
	}
	
	/* 토끼만의 추가 메소드 */
	public void jump() {
		System.out.println("토끼가 점프합니다. 점프~!!!");
	}
	
	
	
	
	
	
}
