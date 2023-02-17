package ncs.test8;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		// Generics 적용된 맵 객체를 선언 할당한다.
		Map<String, Inventory> map = new HashMap<String, Inventory>();
		//상품명을 키로 사용하여 저장 처리 한다.
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7", new GregorianCalendar(2016, 3-1, 15).getTime(), 30));
		map.put("LG G5", new Inventory("LG G5", new GregorianCalendar(2016, 2-1, 25).getTime(), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", new GregorianCalendar(2016, 1-1, 23).getTime(), 15));
		
		Inventory[] inventory = new Inventory[map.size()];
		int i = 0;
		// 맵에 기록된 정보를 연속 출력한다. EntrySet() 사용한다.
		//맵에 기록된 정보를 Inventory[] 로 변환한 다음
		for(Entry<String, Inventory> e : map.entrySet()) {
			System.out.println(e.getValue());
			inventory[i++] = e.getValue();
		}
		
		// 출고 날짜를 오늘 날짜로, 출고 수량은 모두 10개로 지정한다. 예외처리함
		// 변경된 Inventory[] 의 정보를 모두 출력한다.
		System.out.println("출고 수량 10 적용시-------------------------------------");
		for(Inventory iv : inventory) {
			
			try {
				iv.setGetDate(new Date());
				iv.setGetAmount(10);
				System.out.println(iv);
			} catch (AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		System.out.println("출고수량 부족시-------------------------------------");
		for(Inventory iv : inventory) {
			
			try {
				iv.setGetDate(new Date());
				iv.setGetAmount(25);
				System.out.println(iv);
			} catch (AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
			
		}
	}

}
