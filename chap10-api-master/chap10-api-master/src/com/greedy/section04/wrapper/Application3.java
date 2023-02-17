package com.greedy.section04.wrapper;

public class Application3 {

	public static void main(String[] args) {
		
		/* parsing과 반대로 기본자료형 값을 문자열로 변경하는 경우도 필요하다. */
		
		/* valueOf() : 기본자료형 값을 Wrapper 클래스 타입으로 변환시키는 메소드
		 * toString() : 필드 값을 문자열로 반환하는 메소드
		 * */
		
		String b = Byte.valueOf((byte)1).toString();
		System.out.println("b : " + b);
		
		String s = Short.valueOf((short)2).toString();
		System.out.println("s : " + s);
		
		String i = Integer.valueOf(4).toString();
		System.out.println("i : " + i);
		
		String l = Long.valueOf(8L).toString();
		System.out.println("l : " + l);
		
		String f = Float.valueOf(4.0f).toString();
		System.out.println("f : " + f);
		
		String d = Double.valueOf(8.0).toString();
		System.out.println("d : " + d);
		
		String bl = Boolean.valueOf(true).toString();
		System.out.println("bl : " + bl);
		
		String c = Character.valueOf('a').toString();
		System.out.println("c : " + c);
		
		/* String 클래스의 valueOf 메소드를 사용할 수도 있다. */
		String str = String.valueOf(10);
		System.out.println("str : " + str);
		
		/* 문자열 합치기를 이용해 String으로 변환할 수도 있다. */
		String str2 = 123 + "";
		System.out.println("str2 : " + str2);
		
	}

}
