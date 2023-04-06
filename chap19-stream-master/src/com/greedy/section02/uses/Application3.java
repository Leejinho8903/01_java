package com.greedy.section02.uses;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application3 {

	public static void main(String[] args) {

		/* 스트림의 중간 연산 
		 * : 스트림을 전달 받아 또 다른 스트림을 반환하는 연산으로 연속으로 연결해서(chaining) 사용할 수 있다.
		 *   Filtering, Mapping, Sorting 등의 가공 작업을 말한다.
		 */

		/* 1. filter() : 조건에 맞지 않는 요소 제거 */
		IntStream stream1 = IntStream.rangeClosed(1, 10);

		System.out.println("===== 짝수 값만 필터링 된 스트림 결과 출력 =====");
		stream1.filter(i -> i % 2 == 0).forEach(System.out::print);
		System.out.println();

		/* 2. map() : 스트림 요소 변환 */
		Stream<String> stream2 = Stream.of("JAVA", "ORACLE", "HTML", "CSS");

		System.out.println("===== 문자열을 문자열의 길이로 변환한 스트림 결과 출력 =====");
		stream2.map(str -> str.length()).forEach(System.out::print);
		System.out.println();

		/* 3. sorted() : 정렬 Comparator를 전달하여 스트림 요소 정렬, Comparator를 전달하지 않을 시 기본 정렬(Comparable)로 정렬
		 */
		Stream<String> stream3 = Stream.of("JAVA", "ORACLE", "HTML", "CSS");

		System.out.println("===== 정렬 된 문자 스트림 결과 출력 =====");
		//stream3.sorted().forEach(System.out::println); //기본 정렬
		//stream3.sorted(Comparator.reverseOrder()).forEach(System.out::println); // 정렬 역순
		stream3.sorted(Comparator.comparing(String::length)).forEach(System.out::println); // 문자열 길이순 정렬

		Stream<StudentDTO> stream4 = Stream.of(new StudentDTO(1, 3, "유관순", 90), new StudentDTO(2, 1, "홍길동", 80),
				new StudentDTO(3, 1, "신사임당", 85), new StudentDTO(4, 2, "장보고", 95), new StudentDTO(5, 2, "선덕여왕", 75));

		System.out.println("===== 점수 기준으로 정렬 된 학생 스트림 결과 출력 =====");
		stream4.sorted(Comparator.comparing(StudentDTO::getScore)).forEach(System.out::println);

	}

}
