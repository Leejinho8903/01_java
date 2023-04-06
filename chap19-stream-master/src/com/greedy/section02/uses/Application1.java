package com.greedy.section02.uses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

	public static void main(String[] args) {
		
		/* 배열과 컬렉션 객체의 stream() 메소드를 활용한 스트림 생성 */
		
		/* 배열 스트림 생성 */
		String[] sarr = {"java", "oracle", "jdbc"};
		
		Stream<String> strStream1 = Arrays.stream(sarr);
		strStream1.forEach(System.out::println);
		
		Stream<String> strStream2 = Arrays.stream(sarr, 0, 2);
		strStream2.forEach(System.out::println);
		
		/* 컬렉션 스트림 생성 */
		List<String> stringList = Arrays.asList("html", "css", "javascript");
		
		Stream<String> strStream3 = stringList.stream();
		strStream3.forEach(System.out::println);
		
		/* forEach는 컬렉션에도 작성되어 있어 Stream으로 만들지 않고 사용할 수 있다. */
		stringList.forEach(System.out::println);
		
	}

}






