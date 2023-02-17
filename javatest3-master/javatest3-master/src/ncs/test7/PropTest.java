package ncs.test7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropTest {
	
	public static void main(String[] args) {
		Properties p = new Properties();
		
		//명시한 사용 데이터를 prop 에 기록한다.
		p.setProperty("1", "apple,1200,3");
		p.setProperty("2", "banana,2500,2");
		p.setProperty("3", "grape,4500,5");
		p.setProperty("4", "orange,800,10");
		p.setProperty("5", "melon,5000,2");
		
		// fileSave() 메소드를 호출한다.
		new PropTest().fileSave(p);
		// fileOpen() 메소드를 호출한다.
		new PropTest().fileOpen(p);
		
	}

	//fileSave() 메소드를 구현한다.
	public void fileSave(Properties p) {
		try {
			p.storeToXML(new FileOutputStream("data.xml"), "test");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//fileOpen() 메소드를 구현한다.
	public void fileOpen(Properties p) {
		try {
			p.loadFromXML(new FileInputStream("data.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Iterator<Object> it = p.keySet().iterator();
		ArrayList<String> keyList = new ArrayList<>();
		
		while(it.hasNext()) {
			keyList.add((String)it.next());
		}
		
		Collections.sort(keyList);
		
		Fruit[] arr = new Fruit[p.size()];
		int idx = 0;
		for(String key : keyList) { // "apple,1200,3"
			String[] s =  p.getProperty(key).split(",");
			arr[idx] = new Fruit(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
			System.out.println(key + " = " + arr[idx].getName() + ", " + 
			      arr[idx].getPrice() +"원, " + arr[idx].getQuantity()+"개");
			idx++;
		}
		
	}
	
	
	
	
	
	
	
	
	
}
