package com.greedy.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {
		
		/* FileReader : 외부 데이터 File로부터 문자 단위로 데이터를 읽어오는 입력 스트림 
		 * FileInputStream과 사용하는 방법이 거의 동일하다.
		 * 단, byte 단위가 아닌 character 단위로 읽어들이는 부분이 차이점이다. 
		 * */

		FileReader fr = null;
		
		try {
			
			/* 파일이 존재하지 않는 경우 FileNotFoundException 발생하므로 파일을 추가해서 정상적으로 스트림이 생성되게 한다. */
			fr = new FileReader("src/com/greedy/section02/stream/testReader.txt");
			
//			int value;
//			while((value = fr.read()) != -1) {
//				System.out.println(value);
//				System.out.println((char)value);
//			}
			
			/* byte가 아닌 char 배열로 읽어오는 기능을 제공하고 있다. */
			char[] carr = new char[(int) new File("src/com/greedy/section02/stream/testReader.txt").length()];
			fr.read(carr);
			
			for(int i = 0; i < carr.length; i++) {
				System.out.println(carr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
