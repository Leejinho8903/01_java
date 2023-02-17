package com.greedy.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		/* java.io 패키지의 입출력 스트림은 기본 스트림과 필터 스트림으로 분류할 수 있다.
		 * 기본 스트림은 외부 데이터에 직접 연결이 되는 스트림이고
		 * 필터 스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림이다.
		 * 주로 성능을 향상 시키는 목적으로 사용하며 생성자를 보면 구분이 가능하다.
		 * 생성자 쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터 스트림이라고 볼 수 있다.
		 * */
		
		/* 버퍼를 이용해서 성능을 향상 시키는 스트림
		 * BufferedInputStream/OutputStream
		 * BufferedReader/Writer
		 * */
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/com/greedy/section03/filterstream/testBuffered.txt"));
			
			bw.write("안녕하세요.\n");
			bw.write("반갑습니다.\n");
			
			/* 버퍼를 이용하는 경우 버퍼가 가득 차면 자동으로 내보내기를 하지만 버퍼가 가득 차지 않은 상태에서는 강제로 내보내기를 해야 함 
			 * flush()를 해주면 파일에 기록 된다. */
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					/* 사용한 보조 스트림만 close()하면 내부적으로 기반 스트림도 close() 한다. */
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* BufferedReader
		 * 버퍼에 미리 읽어온 뒤 한 줄 단위로 읽어들이는 기능을 제공하며 기본 스트림보다 성능을 개선시킨다. */
		
		BufferedReader br = null;
		
		try {
			
			br = new BufferedReader(new FileReader("src/com/greedy/section03/filterstream/testBuffered.txt"));
			
			/* readLine() 메소드를 추가로 제공한다. 버퍼의 한 줄을 읽어와서 문자열로 반환한다. */
			String temp;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
