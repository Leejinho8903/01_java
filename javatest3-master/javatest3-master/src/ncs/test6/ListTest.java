package ncs.test6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		//명시한 사용 데이터를 list 에 기록한다.
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 100) + 1);
		}
		
		// display() 메소드를 호출한다.
		System.out.print("정렬 전 : ");
		new ListTest().display(list);
		
		// list 의 데이터를 내림차순 정렬한다.
		Collections.sort(list, new Descending());
		
		// display() 메소드를 호출한다
		System.out.print("정렬 후 : ");
		new ListTest().display(list);
		
	}
	
	//display() 메소드를 구현한다.
	public void display(List list) {
		for(Object i : list) {
			System.out.print(i + "  ");
		}
		System.out.println();

	}

}
