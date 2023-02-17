package com.greedy.section01.polymorphism;

public class Application3 {

	public static void main(String[] args) {
		
		/* 매개변수에도 다형성을 활용할 수 있다. */
		Application3 app3 = new Application3();
		
		/* Animal 타입의 토끼와 호랑이 인스턴스를 만들어서 먹이를 준다. */
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();
		
		/* Rabbit 타입의 토끼와 Tiger 타입의 호랑이 인스턴스도 만들어본다. */
		Rabbit rabbit = new Rabbit();
		Tiger tiger = new Tiger();
	
		app3.feed(animal1);	//동일한 타입이기 때문에 전달 가능
		app3.feed(animal2);
		app3.feed(rabbit);	//묵시적 형변환(up-casting)
		app3.feed(tiger);
		
		/* 다형성을 적용하지 않았다면 호랑이, 토끼에게 먹이주는 메소드를 각각 별도로 작성해야 했을 것이다.
		 * 또한 추가적으로 다른 동물을 다뤄야 하는 경우도 그 메소드를 더 추가해야 했을 것이다.
		 * 하지만 다형성을 적용하면 하나의 메소드로 모든 하위 객체를 다룰 수 있어 별도의 메소드 작성 및 추가가 불필요하다.
		 * */
	}

	/* 동물에게 먹이를 주기 위한 용도의 메소드 */
	public void feed(Animal animal) {
		animal.eat();
	}

	
	
	
	
	
	
}
