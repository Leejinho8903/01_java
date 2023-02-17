package com.greedy.section01.thread;

public class Application {

	public static void main(String[] args) {
		
		/* thread를 생성하는 방법
		 * 1. Thread 클래스를 상속
		 * 2. Runnable 인터페이스를 구현
		 * */
		
		/* 작성한 세 개의 클래스를 이용해서 인스턴스 생성 */
		Car car = new Car();
		Tank tank = new Tank();
		Plane plane = new Plane();
		
		/* Thread 타입의 인스턴스로 변환 */
		Thread t1 = car;
		Thread t2 = tank;
		/* Runnable을 상속 받은 클래스는 Thread 클래스의 생성자에 인자로 인스턴스를 전달해서 Thread 인스턴스를 생성한다. */
		Thread t3 = new Thread(plane);
		
		/* 다형성을 적용해서 Thread 타입으로 바로 인스턴스 생성 */
		Thread t4 = new Car();
		Thread t5 = new Tank();
		Thread t6 = new Thread(new Plane());
		
		/* 기본적으로 1~10의 우선 순위 중 5의 우선 순위를 가지고 있다. */
		System.out.println("t4 우선순위 : " + t4.getPriority());
		System.out.println("t5 우선순위 : " + t5.getPriority());
		System.out.println("t6 우선순위 : " + t6.getPriority());
		
		/* 우선 순위 변경 */
		t4.setPriority(Thread.MAX_PRIORITY);	//10
		t6.setPriority(Thread.MIN_PRIORITY);	//1
		
		System.out.println("t4 우선순위 : " + t4.getPriority());
		System.out.println("t5 우선순위 : " + t5.getPriority());
		System.out.println("t6 우선순위 : " + t6.getPriority());
		
		/* run() 메소드를 호출하면 별도의 스레드로 동작하지 않고 메소드를 호출하는 방식으로 동작하게 된다. */
//		t4.run();
//		t5.run();
//		t6.run();
		
		/* 스레드를 동작 시키기 위해서 start() 호출 */
		t4.start();
		t5.start();
		t6.start();
		
		/* 지정한 스레드가 종료 될 때까지 현재 메인 스레드의 종료를 대기 시킨다. */
		try {
			t4.join();
			t5.join();
			t6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------- main end!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
