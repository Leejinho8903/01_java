package com.greedy.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		/* 입출력과 관련 된 API는 java.io 패키지에서 제공하고 있다.
		 * API 문서에서 목록을 확인해보면 대부분 InputStream/OutputStream, Reader/Writer로 끝난다.
		 * 
		 * 이 중 InputStream, Reader는 데이터를 읽어오는 입력 스트림이고
		 * OutputStream, Writer는 데이터를 내보내는 출력 스트림이다.
		 * 
		 * 또한 InputStream, OutputStream은 데이터를 1바이트 단위로 입/출력을 하고
		 * Reader, Writer는 문자 단위로 입/출력을 한다.
		 * 
		 * 자바 프로그램과 연결 되는 외부 데이터의 타입이 무엇인지는 클래스의 이름을 보고 유추할 수 있다.
		 * InputStream/OutputStream, Reader/Writer를 빼고 남은 단어가 외부 데이터의 타입이다.
		 * 
		 * Ex. FileInputStream : 외부 데이터 File로부터 1바이트 단위로 데이터를 읽어오는 입력 스트림
		 * */
		
		FileInputStream fin = null;
		
		try {
			/* 대상 파일이 존재하지 않는 경우 발생하는 FileNotFoundException에 대해 핸들링 해야 한다. try-catch 블럭 처리. 
			 * 인스턴스만 생성한 후 실행하면 FileNotFoundException 이 발생하며
			 * 파일을 직접 생성한 후 실행하면 예외가 발생하지 않는다. 스트림 인스턴스가 정상적으로 생성된 것이다. */
			fin = new FileInputStream("src/com/greedy/section02/stream/testInputStream.txt");
			
			int value;
			
			/* read()는 throws IOException이므로 add catch clause to surrounding try 눌러서 catch 블럭 하단에 추가 */
			/* read() : 파일에 기록 된 값을 1byte씩 순차적으로 읽어서 반환하고 더 이상 읽어올 데이터가 없는 경우 -1 반환 */
//			while((value = fin.read()) != -1) {
//				
//				/* 값을 정수로 읽어온다. */
//				System.out.println(value);
//				
//				/* 문자로 출력해본다. */
//				System.out.println((char)value);
//			}
			
			/* 한글 값을 입력하는 경우 한글이 깨져서 나온다.
			 * 한글은 한 글자에 3byte이기 때문에 3byte 데이터를 1byte씩 읽어오면 글자가 깨지게 된다. */
			
			/* 1byte씩 읽어와야 하는 경우도 있긴 하지만 대부분은 비효율적이다.
			 * byte 배열을 이용해서 한 번에 데이터를 읽어오는 방법도 제공하고 있다. */
			
			/* 파일의 길이만큼 byte 배열을 만든다. */
			int fileSize = (int) new File("src/com/greedy/section02/stream/testInputStream.txt").length();
			byte[] bar = new byte[fileSize];
			
			/* read() 메소드의 인자로 생성한 byte 배열을 넣어주면 파일의 내용을 읽어서 byte 배열에 기록한다. */
			fin.read(bar);
			
			for(int i = 0; i < bar.length; i++) {
				System.out.println((char)bar[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			/* fin 인스턴스가 null이 아닌 경우 자원 반납을 해야 한다. */
			if(fin != null) {
				try {
					/* 자원을 해제하는 경우에도 IOException을 핸들링 해야 한다.
					 * 이미 자원이 반납 된 경우 발생하는 Exception이다. */
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}
