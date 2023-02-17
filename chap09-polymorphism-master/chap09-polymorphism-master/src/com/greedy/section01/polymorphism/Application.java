package com.greedy.section01.polymorphism;

public class Application {

	public static void main(String[] args) {
		
		/* 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것을 의미한다.
		 * Rabbit은 Rabbit 타입이기도 하면서 Animal 타입이기도 하다.
		 * Tiger는 Tiger 타입이기도 하면서 Animal 타입이기도 하다.
		 * => 그렇기 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
		 *    하나의 메소드 호출로 객체 별로 각기 다른 방법으로 동작하게 할 수도 있다.
		 * */
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
		/* 하지만 반대로 Animal은 Animal일 뿐 Rabbit, Tiger가 될 수 없다. 
		 * 따라서 반대로 작성 시 에러가 발생한다. */
		//Rabbit r = new Animal();
		//Tiger t = new Animal();
		
		System.out.println("동적 바인딩 확인 ------------------------");
		/* 컴파일 당시에는 해당 타입(Animal)의 메소드와 연결 되어 있다. => 정적 바인딩
		 * 하지만 런타임 당시에는 실제 객체가 가지는 오버라이딩 된 메소드로 바인딩이 바뀌어 동작한다. => 동적 바인딩 */
		a1.cry();
		a2.cry();
		
		/* 현재 레퍼런스 변수의 타입은 Animal이기 때문에 Rabbit과 Tiger가 가지고 있는 고유한 기능을 동작시키지 못한다. */
//		a1.jump();
//		a2.bite();
		
		System.out.println("클래스타입 형변환 확인------------------");
		/* 객체별로 고유한 기능을 동작시키기 위해 레퍼런스 변수를 형변환하여 Rabbit과 Tiger로 변경해야 메소드 호출 가능.
		 * class type casting : 클래스 형변환
		 * */
		((Rabbit)a1).jump();
		((Tiger)a2).bite();
		
		/* 타입 형변환을 잘못 하는 경우 컴파일 시에는 문제가 없지만 런타임 시 Exception이 발생한다.
		 * java.lang.ClassCastException */
		//((Tiger)a1).bite(); => 토끼는 호랑이가 될 수 없다.
		
		/* 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자 instanceof */
		System.out.println("instanceof 확인 ---------------------");
		System.out.println("a1이 Tiger 타입인지 확인 : " + (a1 instanceof Tiger));
		System.out.println("a1이 Rabbit 타입인지 확인 : " + (a1 instanceof Rabbit));
		System.out.println("a2이 Tiger 타입인지 확인 : " + (a2 instanceof Tiger));
		System.out.println("a2이 Rabbit 타입인지 확인 : " + (a2 instanceof Rabbit));
		/* 상속 받은 타입도 함께 가지고 있다. (다형성) */
		System.out.println("a1이 Animal 타입인지 확인 : " + (a1 instanceof Animal));
		System.out.println("a2이 Animal 타입인지 확인 : " + (a2 instanceof Animal));
		/* 모든 클래스는 Object의 후손이다. */
		System.out.println("a1이 Object 타입인지 확인 : " + (a1 instanceof Object));
		System.out.println("a2이 Object 타입인지 확인 : " + (a2 instanceof Object));
		
		/* instanceof 연산자를 이용해서 해당 타입이 맞는 경우에만 클래스 형변환을 적용한다. */
		if(a1 instanceof Rabbit) {
			((Rabbit)a1).jump();
		}
		
		if(a2 instanceof Tiger) {
			((Tiger)a2).bite();
		}
		
		/* 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
		 * up-casting : 상위 타입으로 형변환
		 * down-casting : 하위 타입으로 형변환
		 * */
		
		/* up-casting의 경우 자동 형변환(묵시적 형변환)이 적용 된다. */
		Animal animal1 = (Animal) new Rabbit();	
		Animal animal2 = new Rabbit();
		
		/* down-casting의 경우 강제 형변환(명시적 형변환)을 해야 한다. */
		Rabbit rabbit1 = (Rabbit) animal1;
//		Rabbit rabbit2 = animal2;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
}
