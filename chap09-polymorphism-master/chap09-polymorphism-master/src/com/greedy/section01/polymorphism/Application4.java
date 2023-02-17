package com.greedy.section01.polymorphism;

public class Application4 {

	public static void main(String[] args) {
		
		/* 리턴 타입에도 다형성을 적용할 수 있다. */
		Application4 app4 = new Application4();
		
		Animal randomAnimal = app4.getRandomAnimal();
		randomAnimal.cry();
		
	}
	
	/* 랜덤하게 토끼 또는 호랑이를 반환하는 메소드 */
	public Animal getRandomAnimal() {
		
		int random = (int) (Math.random() * 2);
		
		return random == 0 ? new Rabbit() : new Tiger();
	}
	

}
