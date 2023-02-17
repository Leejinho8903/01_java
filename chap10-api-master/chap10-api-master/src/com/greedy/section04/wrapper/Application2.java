package com.greedy.section04.wrapper;

public class Application2 {

	public static void main(String[] args) {
		
		/* parsing : 문자열(String) 값을 기본 자료형 값으로 변경하는 것을 parsing이라고 한다. */
		byte b = Byte.parseByte("1");
		System.out.println("b : " + b);
		
		short s = Short.parseShort("2");
		System.out.println("s : " + s);
		
		// 숫자로 parsing 처리할 때 파싱 불가능한 문자열을 전달 받으면 아래와 같은 오류가 발생한다.
		// java.lang.NumberFormatException: For input string: "안녕"
		// int i = Integer.parseInt("안녕");
		int i = Integer.parseInt("4");
		System.out.println("i : " + i);
		
		long l = Long.parseLong("8");
		System.out.println("l : " + l);
		
		float f = Float.parseFloat("4.0");
		System.out.println("f : " + f);
		
		double d = Double.parseDouble("8.0");
		System.out.println("d : " + d);
		
		/* boolean으로 파싱 될 수 없는 문자가 전달 되면 false로 파싱 */
		boolean bl = Boolean.parseBoolean("true");
		System.out.println("bl : " + bl);
		
		/* Character는 parsing 기능을 제공하지 않는다. */
		char c = "abc".charAt(0);
		System.out.println("c : " + c);
		
		
		
		
		
		
		
	}

}
