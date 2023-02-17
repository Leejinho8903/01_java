package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.greedy.section01.list.comparator.AscendingPrice;
import com.greedy.section01.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {
		
		/* 여러 권의 책 목록을 관리할 ArrayList 인스턴스 생성 */
		List<BookDTO> bookList = new ArrayList<>();
		
		/* 도서 정보 추가 */
		bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2, "목민심서", "정약용", 40000));
		bookList.add(new BookDTO(3, "동의보감", "허준", 30000));
		bookList.add(new BookDTO(4, "삼국사기", "김부식", 20000));
		bookList.add(new BookDTO(5, "삼국유사", "일연", 35000));
		
		/* 추가 된 도서 정보 출력 */
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
		
		/* 향상 된 for문으로 도서 정보 출력 */
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 정렬 기준이 존재하지 않아 정렬할 수 없는 상태이다. */
		//Collections.sort(bookList);
		
		/* 가격 순으로 오름차순 정렬 - AscendingPrice 클래스 추가 */
		Collections.sort(bookList, new AscendingPrice());
		System.out.println("가격 오름차순 정렬 --------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 인터페이스를 구현할 클래스를 재사용하는 경우 AscendingPrice 클래스처럼 작성하면 되지만
		 * 한 번만 사용하고 더 이상 재사용할 일이 없을 경우에는 조금 더 간편한 방법을 이용할 수 있다.
		 * 익명 클래스(Anonymous)를 이용한 방법이다. 익명클래스는 뒤에 {}를 만들어서 
		 * Comparator 인터페이스를 상속 받은 클래스인데 이름이 없다고 생각하고 사용하는 것이다. 
		 * */
		Collections.sort(bookList, new Comparator<BookDTO> () {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				/* 가격 내림차순 기준 작성 
				 * 가격 오름차순과는 반대로 뒤에 있는 값인 o2의 price가 더 클 경우 양수를 반환하여 순서를 바꾸게 한다. */
				return o2.getPrice() - o1.getPrice();
			}
			
		});
		System.out.println("가격 내림차순 정렬 --------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 제목 오름차순 정렬 */
		Collections.sort(bookList, new Comparator<BookDTO> () {

			/* 문자열은 대소비교를 할 수 없다.
			 * 문자 배열로 변경 후 인덱스 하나 하나를 비교해서 어느 것이 더 큰 값인지 확인해야 하는데
			 * String 클래스의 compareTo() 메소드에서 이미 정의해 놓았다. */
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		System.out.println("제목 오름차순 정렬 --------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* 제목 내림차순 정렬 */
		Collections.sort(bookList, new Comparator<BookDTO> () {

			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o2.getTitle().compareTo(o1.getTitle());
			}
			
		});
		System.out.println("제목 내림차순 정렬 --------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* BookDTO implements Comparable<BookDTO> 를 작성하고나면 sort 메소드 호출을 할 수 있다.
		 * 내부적인 정렬 기준이 정의 되었기 때문이다. */
		Collections.sort(bookList);
		System.out.println("번호 오름차순 정렬 --------------------");
		for(BookDTO book : bookList) {
			System.out.println(book);
		}
		
		/* Vector 클래스의 경우 스레드 동기화 처리가 된다는 점만 다르고 ArrayList와 동일하게 동작한다.
		 * ArrayList의 구 버전이므로 따로 코드는 작성해보지 않는다.
		 * JDK 1.0부터 사용하긴 했지만 하위 호환을 위해 남겨 놓았을 뿐 성능 문제로 현재는 잘 사용하지 않으며
		 * 가급적이면 ArrayList를 사용하면 된다.
		 * */
		
		
	}

}
