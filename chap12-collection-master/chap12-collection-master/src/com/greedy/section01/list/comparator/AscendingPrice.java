package com.greedy.section01.list.comparator;

import java.util.Comparator;

import com.greedy.section01.list.dto.BookDTO;

/* 가격 오름차순이라는 정렬 기준을 작성하는 용도의 클래스 */
public class AscendingPrice implements Comparator<BookDTO> {

	/* Comparator 인터페이스를 상속 받으면 오버라이딩 해야 하는 메소드가 강제화 된다. - compare 메소드
	 * 제네릭 작성 시 Object가 아닌 구체화 된 타입으로 매개변수가 선언 되어 다운 캐스팅할 필요가 없어진다.
	 * */
	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		
		/* sort()에서 내부적으로 사용 되는 메소드이다.
		 * 비교 대상 두 인스턴스의 가격이 오름차순 정렬이 되기 위해서는 앞의 가격이 더 작은 가격이어야 하고
		 * 만약 뒤의 가격이 더 작은 경우 두 인스턴스의 순서를 바꿔야 한다.
		 * 그 때 두 값을 바꾸라는 신호로 양수를 보내주게 되면 정렬 시 순서를 바꾸는 조건으로 사용된다.
		 * */
		
		int result = 0;
		
		if(o1.getPrice() > o2.getPrice()) {
			/* 오름차순을 위해 순서를 바꿔야 하는 경우 양수 반환 */
			result = 1;
		} else if(o1.getPrice() < o2.getPrice()) {
			/* 이미 오름차순으로 정렬 되어 있는 경우 음수 반환 */
			result = -1;
		} else {
			/* 두 값이 같은 경우 0을 반환 */
			result = 0;
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	

}
