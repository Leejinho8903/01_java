package com.greedy.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.greedy.section02.set.dto.BookDTO;

public class Application1 {

	public static void main(String[] args) {
		
		/* Set 인터페이스를 구현한 Set 컬렉션의 특징
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다. (null 값도 중복 되지 않아 하나의 null만 저장한다)
		 * */
		
		/* HashSet 클래스 
		 * Set 컬렉션 클래스에서 가장 많이 사용 되는 클래스 중 하나이다.
		 * JDK 1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
		 * */
		
		/* HashSet 인스턴스 생성 */
		Set<String> hset = new HashSet<>();
		
		hset.add(new String("java"));
		hset.add(new String("oracle"));
		hset.add(new String("jdbc"));
		hset.add(new String("html"));
		hset.add(new String("css"));
		
		/* 저장 순서가 유지 되지 않는다. */
		System.out.println(hset);
		
		/* 값이 같은 동등 객체를 저장하고자 했을 때 중복 저장 되지 않는다. */
		hset.add(new String("java"));
		System.out.println(hset);
		
		/* 값이 같은 동등 객체를 이용해 포함 여부 확인이 가능하다. */
		System.out.println("포함 여부 확인 : " + hset.contains(new String("oracle")));
		
		/* HashSet에 BookDTO 저장하기 */
		Set<BookDTO> hset2 = new HashSet<>();
		hset2.add(new BookDTO(1, "홍길동전", "허균", 50000));
		hset2.add(new BookDTO(1, "홍길동전", "허균", 50000));	//동등 객체 중복 저장 테스트
		
		System.out.println(hset2);
		
		System.out.println(hset2.contains(new BookDTO(1, "홍길동전", "허균", 50000))); //동등 객체 포함 여부 테스트
		
		/* String 클래스 내에 hashCode, equals 메소드가 오버라이딩 되어 동등 객체 처리가 가능했던 것이고
		 * 직접 구현한 클래스에서 동일한 처리가 될 수 있도록 하려면 hashCode, equals 메소드를 오버라이딩 해야 한다. */
		
		/* 저장 된 객체를 하나씩 꺼내는 기능이 따로 없다. 반복문(인덱스) 사용이 불가하다. */
		
		/* 1. toArray()로 배열로 변경한 뒤 for loop 사용 */
		Object[] arr = hset.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		/* 2. iterator()로 목록 만들어 연속 처리 */
		Iterator<String> iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		/* 3. 향상 된 for문 사용 */
		for(String str : hset) {
			System.out.println("str : " + str);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
