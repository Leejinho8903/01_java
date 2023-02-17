package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		/* ArrayList
		 * 가장 많이 사용하는 컬렉션 클래스로 JDK 1.2부터 제공된다.
		 * 내부적으로는 배열을 이용해서 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
		 * 배열의 단점 1. 크기 변경 불가 2. 요소의 추가/수정/삭제/정렬이 복잡
		 * 이러한 배열의 단점을 보완하기 위해 ArrayList는 만들어 졌다.
		 * 크기 변경, 요소의 추가/수정/삭제/정렬 기능 등을 미리 메소드로 구현해서 제공한다.
		 * 단, 자동으로 수행되는 것이지 속도가 빨라진다는 의미는 아니다.
		 * */
		
		/* 인스턴스 생성 시 내부적으로 10칸짜리 배열을 생성해서 관리한다. */
		ArrayList alist = new ArrayList();
		
		/* 다형성을 적용하여 상위 레퍼런스로 ArrayList 객체를 참조할 수 있다.
		 * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에 레퍼런스 타입은 List로 해두는 것이
		 * 더 유연한 코드를 작성하는 것이다. */
		List list = new ArrayList();
		
		/* 더 상위 타입인 Collection 타입을 이용할 수도 있다. */
		Collection clist = new ArrayList();
		
		/* Object 클래스 하위 타입 인스턴스를 모두 저장할 수 있다. (int나 double은 Integer, Double로 오토 박싱 된다) */
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());
		
		/* toString 메소드가 오버라이딩 되어 있다. 저장 순번이 유지 되고 있다. */
		System.out.println("alist : " + alist);
		
		/* size 메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다.
		 * 내부적으로 관리되는 배열의 사이즈는 외부에서 알 필요가 없으므로 기능을 제공하지 않는다. */
		System.out.println("alist의 size : " + alist.size());
		
		/* 내부 배열에 인덱스가 지정 되어 있기 때문에 for문으로 접근 가능 */
		for(int i = 0; i < alist.size(); i++) {
			/* 인덱스에 해당하는 요소를 가져올 때는 get 메소드를 사용한다. */
			System.out.println(i + " : " + alist.get(i));
		}
		
		/* 데이터의 중복 저장을 허용한다.
		 * 배열과 같이 인덱스로 요소들을 관리하기 때문에 인덱스가 다른 위치에 동일한 값을 저장하는 것이 가능하다. */
		alist.add("apple");
		System.out.println("alist : " + alist);
		
		/* 원하는 인덱스 위치에 값을 추가할 수도 있다. 
		 * 값을 중간에 추가하는 경우 인덱스 위치에 덮어쓰는 것이 아니라
		 * 새로운 값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스는 하나씩 뒤로 밀리게 된다. */
		alist.add(1, "banana");
		System.out.println("alist : " + alist);
		
		/* 지정된 값을 삭제할 때는 remove 메소드를 사용한다. 
		 * 중간 인덱스의 값을 삭제하는 경우 자동으로 인덱스를 하나씩 앞으로 당긴다. */
		alist.remove(2);
		System.out.println("alist : " + alist);
		
		/* 지정 된 위치의 값을 수정할 때에도 인덱스를 활용할 수 있으며 set() 메소드를 사용한다. */
		alist.set(1, true);
		System.out.println("alist : " + alist);
		
		/* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성 되어 있다. */
		List<String> stringList = new ArrayList<>();
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("mango");
		stringList.add("grape");
		/* 제네릭 타입을 지정하면 지정한 타입 외의 인스턴스는 저장하지 못한다. */
//		stringList.add(123);
		
		System.out.println("stringList : " + stringList);
		
		/* 저장 순서를 유지하고 있는 stringList를 오름차순 정렬한다. */
		Collections.sort(stringList);

		/* sort 메소드를 사용하면 list가 정렬 된 뒤 해당 상태가 유지 된다. */
		System.out.println("stringList : " + stringList);
		
		/* ArrayList에는 역순 정렬 기능이 제공 되지 않고 LinkedList에는 정의되어 있다.
		 * 현재의 ArrayList를 LinkedList로 변경해본다. 
		 * */
		stringList = new LinkedList<>(stringList);
		
		/* Iterator
		 * Collection 인터페이스의 iterator() 메소드를 이용해서 생성하는 인스턴스로
		 * 컬렉션에서 값을 읽어오는 통일된 방식을 제공하기 위해 사용한다.
		 * 반복자라고 불리우며 반복문을 이용해서 목록을 하나씩 꺼내는 방식으로 사용하기 위함이다.
		 * 인덱스로 관리 되는 컬렉션이 아닌 경우 반복문을 사용해서 요소에 하나씩 접근할 수 없고
		 * 인덱스 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할을 한다.
		 * */
		
		Iterator<String> iter = stringList.iterator();
		while(iter.hasNext()) {	// 다음 요소를 가지고 있는 경우 true, 더 이상 요소가 없는 경우 false 반환
			System.out.println(iter.next()); //다음 요소를 반환
		}
		
		Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		/* Iterator는 한 번 꺼내면 다시 쓸 수 없다. */
		while(dIter.hasNext()) {
			System.out.println(dIter.next());
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
