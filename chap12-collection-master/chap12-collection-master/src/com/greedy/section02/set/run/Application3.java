package com.greedy.section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {

	public static void main(String[] args) {
		
		/* TreeSet
		 * 데이터가 정렬 된 상태로 저장 되는 이진 검색 트리의 형태로 요소를 저장한다.
		 * 이진 검색 트리는 데이터를 추가하거나 삭제하는 등의 기본 동작 시간이 매우 빠르다.
		 * JDK 1.2부터 제공 되고 있으며 Set 인터페이스가 가지는 특징을 그대로 가지지만
		 * 정렬 된 상태를 유지한다는 점이 다른 점이다. 
		 * */
		
		Set<String> tset = new TreeSet<>();
		
		tset.add("java");
		tset.add("oracle");
		tset.add("jdbc");
		tset.add("html");
		tset.add("css");
		
		/* 저장 순서와 상관 없이 오름차순 정렬 된 상태로 출력 */
		System.out.println(tset);
		
		/* 로또 번호 발생기 (TreeSet의 특징 이용) */
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		
		System.out.println(lotto);
		
		
		
		
	}

}
