package ncs.test10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {
	public static void main(String[] args) {
		
		BookListTest test10 = new BookListTest();
		ArrayList<Book> list = new ArrayList<Book>();
		
		// Book 객체를 3개 생성하여 리스트에 넣는다
		test10.storeList(list);
		
		//books.dat 파일에 리스트에 저장된 Book 객체들을 저장한다.
		test10.saveFile(list);
		
		//books.dat 파일로부터 객체들을 읽어서 리스트에 담는다.
		List<Book> bookList = test10.loadFile();
		
		// 할인된 가격은 booksList 에 기록된 객체 정보를 사용하여 getter 로 계산 출력한다.
		// – for each 문을 이용 할 것
		test10.printList(bookList);
		
	}
	
	public void storeList(List<Book> list) {
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
	
	public void saveFile(List<Book> list) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))){
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Book> loadFile() {
		List<Book> bookList = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))){
			bookList = (List<Book>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
	public void printList(List<Book> list) {
		for(Book b : list) {
			System.out.println(b);
			System.out.println("할인 된 가격 : " + (int)(b.getPrice() * (1 - b.getDiscountRate())) + "원");
		}
	}
}
