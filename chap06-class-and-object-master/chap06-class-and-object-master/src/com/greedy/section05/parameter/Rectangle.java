package com.greedy.section05.parameter;

public class Rectangle {
	
	private double width;
	private double height;
	
	/* 기본 생성자로 객체 생성하는 것을 막고, 
	 * 모든 필드를 초기화 하는 생성자로 초기값을 입력해서 인스턴스 생성하도록 제한 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/* getter, setter */
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	
	
	
	
}







