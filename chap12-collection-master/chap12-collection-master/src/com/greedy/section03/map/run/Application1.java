package com.greedy.section03.map.run;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Application1 {

	public static void main(String[] args) {
		
		/* Map 인터페이스의 특징 
		 * Collection 인터페이스와는 다른 저장 방식을 가진다.
		 * key, value를 하나의 쌍으로 저장하는 방식을 사용한다.
		 * key란? value를 찾기 위한 이름 역할을 하는 객체를 의미한다.
		 * 
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 키는 중복 허용하지 않지만, 키가 다르면 중복 값은 저장 가능하다.
		 * 
		 * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있다.
		 * HashMap이 가장 많이 사용 되며 HashTable은 JDK 1.0부터 제공 되었고 HashMap과 동일하게 동작한다.
		 * 하위 호환을 위해 남겨 놓았기 때문에 HashMap을 사용하는 것이 좋다.
		 * */
		
		/* HashMap 인스턴스 생성 */
		Map hmap = new HashMap();
		
		/* 키, 값 쌍으로 저장한다. 둘 다 반드시 객체여야 한다. 기본 자료형은 오토 박싱 되어 Wrapper 클래스로 저장되고 있다. */
		hmap.put("one", new Date());
		hmap.put(12, "red apple");
		hmap.put(33, 123);
		
		/* 저장 순서를 유지하지 않는다. */
		System.out.println("hmap : " + hmap);
		
		/* 키는 중복 저장 되지 않으며 value 값만 덮어쓰기 된다. */
		hmap.put(12, "yellow banana");
		System.out.println("hmap : " + hmap);

		/* 키가 다르면 값 객체 저장은 중복으로 가능하다. */
		hmap.put(11, "yellow banana");
		System.out.println("hmap : " + hmap);
		
		/* 값 객체의 내용을 가져올 때 */
		System.out.println("키 11에 대한 객체 : " + hmap.get(11));
		
		/* 키 값을 가지고 삭제할 때 */
		hmap.remove(11);
		System.out.println("hmap : " + hmap);
		
		/* 저장 된 객체 수를 확인할 때 */
		System.out.println("hmap 저장 된 객체 수 : " + hmap.size());
		
		/* 제네릭 설정한 HashMap 인스턴스 생성 
		 * Map의 key 타입은 가장 보편적으로 String 타입을 사용한다. */
		Map<String, String> hmap2 = new HashMap<>();
		
		hmap2.put("one", "java");
		hmap2.put("two", "oracle");
		hmap2.put("three", "jdbc");
		hmap2.put("four", "html");
		hmap2.put("five", "css");
		
		System.out.println(hmap2);
		
		/* 1. keySet()을 이용해서 키만 따로 Set으로 만들고, iterator로 키에 대한 목록을 만든다. or 향상 된 for문을 사용한다. */
		Set<String> keys = hmap2.keySet();
		
		/* iterator */
		Iterator<String> keyIter = keys.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			String value = hmap2.get(key);
			System.out.println(key + " = " + value);
		}
		
		/* 향상 된 for문 */
		for(String key : keys) {
			String value = hmap2.get(key);
			System.out.println(key + " = " + value);
		}
		
		System.out.println("=============================================");
		
		/* 2. entrySet()을 이용해서 Entry를 Set으로 만들고 iterator로 Entry에 대한 목록을 만든다. or 향상 된 for문을 사용한다. */
		Set<Entry<String, String>> set = hmap2.entrySet();
		
		/* iterator */
		Iterator<Entry<String, String>> entryIter = set.iterator();
		while(entryIter.hasNext()) {
			Entry<String, String> entry = entryIter.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		/* 향상 된 for문 */
		for(Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		/* 3. 저장 된 value 객체들만 values로 Collection으로 만든다. */
		Collection<String> values = hmap2.values();
		
		Iterator<String> valueIter = values.iterator();
		while(valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
