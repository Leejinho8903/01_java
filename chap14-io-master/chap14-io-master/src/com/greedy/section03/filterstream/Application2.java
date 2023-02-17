package com.greedy.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

	public static void main(String[] args) {
		
		/* 형변환 보조 스트림(InputStreamReader, OutputStreamWriter)
		 * 기본 스트림이 byte 기반 스트림이고, 보조 스트림이 char 기반 스트림인 경우 사용한다.
		 * */
		
		/* 표준 스트림
		 * 자바에서는 콘솔이나 키보드 같은 표준 입력 장치로부터 데이터를 입출력하기 위한 스트림을 표준 스트림 형태로 제공하고 있다.
		 * System 클래스의 필드 in, out, err가 대상 데이터의 스트림을 의미한다.
		 * System.in (InputStream) : 콘솔로부터 데이터를 입력 받는다.
		 * System.out (PrintStream) : 콘솔로 데이터를 출력한다.
		 * System.err (PrintStream) : 콘솔로 데이터를 출력한다.
		 * 자주 사용 되는 자원에 대해 미리 스트림을 생성해 두었기 때문에 개발자가 별도로 스트림을 생성하지 않아도 된다.
		 * */
		
		/* 이러한 표준 스트림 중 콘솔로부터 읽어오는 System.in은 InputStream 타입인데 
		 * Buffer를 이용해서 성능을 향상시키고 싶은 경우 형변환 보조 스트림을 사용할 수 있다. */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			System.out.print("문자열 입력 : ");
			String value = br.readLine();
			System.out.println("value : " + value);
			
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
		
		/* 출력을 위한 것도 동일한 방식으로 사용할 수 있다. 
		 * try-with-resource 문으로 작성한다. */
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
			bw.write("java oracle jdbc");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}
