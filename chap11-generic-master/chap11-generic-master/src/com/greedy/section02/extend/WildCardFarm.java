package com.greedy.section02.extend;

public class WildCardFarm {
	
	/* 매개변수로 전달 받는 토끼 농장을 구현할 때 사용한 타입 변수에 대해 제한할 수 있다. */
	
	/* 토끼 농장에 있는 토끼가 어떤 토끼이던 상관 없다는 의미 */
	public void anyType(RabbitFarm<?> farm) {
		farm.getAnimal().cry();
	}
	
	/* 토끼 농장의 토끼는 Bunny이거나 그 후손 타입으로 만들어진 토끼 농장만 매개변수로 사용 */
	public void extendsType(RabbitFarm<? extends Bunny> farm) {
		farm.getAnimal().cry();
	}
	
	/* 토끼 농장의 토끼는 Bunny이거나 그 부모 타입으로 만들어진 토끼 농장만 매개변수로 사용 */
	public void superType(RabbitFarm<? super Bunny> farm) {
		farm.getAnimal().cry();
	}

}
