package com.greedy.section03.abstraction;

public class CarRacer {
	
	/* CarRacer가 상호 작용할 Car 클래스를 CarRacer는 알고 있어야 한다.
	 * 알고 있다는 의미는 필드에 가지고 있다는 의미를 가진다.
	 * */
	private Car car = new Car();
	
	public void startUp() {
		car.startUp();
	}
	
	public void stepAccelator() {
		car.go();
	}
	
	public void stepBreak() {
		car.stop();
	}
	
	public void turnOff() {
		car.turnOff();
	}
	
	
	
	
	
	
	
	
	
	
	
}
