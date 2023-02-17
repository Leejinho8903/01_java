package com.greedy.section02.extend;

public class Bunny extends Rabbit {

	@Override
	public void cry() {
		System.out.println("바니바니 바니바니 당근당근");
	}
	
	/* Bunny를 상속 받는 DrunkenBunny 클래스를 만든다. */
}
