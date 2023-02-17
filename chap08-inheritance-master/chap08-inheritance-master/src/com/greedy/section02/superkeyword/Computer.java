package com.greedy.section02.superkeyword;

import java.util.Date;

/* Computer 는 하나의 Product 이다. (IS-A) */
public class Computer extends Product {
	
	/* Computer만 가지는 추가적인 속성을 필드로 정의한다. */
	private String cpu;
	private int hdd;
	private int ram;
	private String operationSystem;
	
	/* 기본 생성자 */
	public Computer() {
		super();
		System.out.println("Computer 클래스의 기본 생성자 호출");
	}

	/* 모든 필드를 초기화 하는 생성자 */
	public Computer(String cpu, int hdd, int ram, String operationSystem) {
		/* 부모 클래스의 기본 생성자 호출 */
		super();
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		System.out.println("Computer 클래스의 모든 필드를 초기화 하는 생성자 호출");
	}

	/* 부모의 필드까지 모두 초기화 하는 생성자 */
	public Computer(String code, String brand, String name, int price, Date manufacturingDate,
			String cpu, int hdd, int ram, String operationSystem) {
		
		/* 부모 클래스의 모든 필드 초기화 매개변수 생성자 호출 */
		super(code, brand, name, price, manufacturingDate);
		
		/* 아래와 같이 작성하면 this()로 다시 한 번 생성자를 호출하게 되는데
		 * 생성자를 두 번 호출 하는 것은 허용 되지 않는다. */
		//this(cpu, hdd, ram, operationSystem);
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.operationSystem = operationSystem;
		
		System.out.println("Computer 클래스의 부모 필드도 초기화 하는 생성자 호출");
	}

	/* getter, setter 
	 * 부모 필드의 메소드에 대해서는 자신의 멤버처럼 사용 가능하므로 따로 작성할 필요가 없다.
	 * 자식 클래스에 추가 된 필드에 대해서만 작성한다.
	 * */

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	/* 모든 필드 값을 문자열로 반환하는 메소드 */
	@Override
	public String getInformation() {
		
		/* 부모 클래스에 작성한 getter를 이용해서 부모 필드가 가지고 있는 값도 한 번에 문자열 합치기를 한다.
		 * 부모가 가진 멤버는 super. 와 this. 둘 다 사용이 가능하다.
		 * 하지만 코드의 의미를 명확히 하기 위해 super. 을 사용했다.
		 * */
		
//		return "Computer ["
//				+ "code=" + super.getCode() 
//				+ ", brand=" + super.getBrand()
//				+ ", name=" + super.getName()
//				+ ", price=" + super.getPrice()
//				+ ", manufaturingDate=" + super.getManufacturingDate()
//				+ ", cpu=" + this.cpu
//				+ ", hdd=" + this.hdd
//				+ ", ram=" + this.ram
//				+ ", operationSystem=" + this.operationSystem
//				+ "]";
		
		/* super.getInformation() : 정상적으로 부모의 메소드를 호출한다.
		 * this.getInformation() : 재귀 호출(자기 자신의 메소드를 다시 호출하는 것)이 일어나며 StackOverflowError 발생한다.
		 * getInformation() : this. 이 자동으로 추가 되어 동일하게 재귀 호출이 일어난다. */
		return super.getInformation() 
				+ " Computer ["
				+ "cpu=" + this.cpu
				+ ", hdd=" + this.hdd
				+ ", ram=" + this.ram
				+ ", operationSystem=" + this.operationSystem
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
