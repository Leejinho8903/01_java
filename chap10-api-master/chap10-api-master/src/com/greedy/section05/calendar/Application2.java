package com.greedy.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

	public static void main(String[] args) {
		
		/* Calendar 클래스 
		 * JDK 1.1부터 새롭게 제공되는 시간과 날짜에 관한 처리를 담당하는 클래스이다.
		 * Calendar 클래스가 추가되면서 Date의 많은 메소드는 Deprecated 되었다. 
		 * */
		
		/* Calendar 클래스는 추상 클래스이다. 따라서 생성자를 통해 인스턴스를 생성할 수 없다. */
//		Calendar calendar = new Calendar();
		
		/* Calendar 클래스를 이용한 인스턴스 생성 방법
		 * 1. getInstance() static 메소드를 이용해서 인스턴스를 반환 받는 방법
		 * 2. 후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법
		 * */
		
		/* 1. getInstance() static 메소드 */
		Calendar calendar = Calendar.getInstance();
		
		/* toString이 오버라이딩 되어 있어서 모든 필드의 값을 확인할 수 있다.
		 * Date 클래스에 비해 매우 많은 필드 값이 있으며 생성 된 인스턴스 타입은 GregorianCalendar 타입이다.
		 * */
		System.out.println(calendar);
		
		/* 2. GregorianCalendar 생성자 */
		Calendar gregorianCalendar = new GregorianCalendar();
		System.out.println(gregorianCalendar);
		
		/* 년, 월, 일, 시, 분, 초 정보를 이용해서 인스턴스 생성 */
		int year = 2023;
		int month = 6 - 1;	//월은 0~11로 사용하기 때문에 주의
		int dayOfMonth = 9;
		int hour = 9;
		int min = 10;
		int second = 30;
		
		Calendar endDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
		System.out.println(endDay);
		
		/* 상황에 따라서 특정 일자를 기준으로 한 Date 타입의 인스턴스가 필요한 경우도 있다. 
		 * 먼저 GregorianCalendar를 이용해서 특정 날짜/시간 정보로 인스턴스를 생성한 후 
		 * 1970년 1월 1일 0시 0분 0초를 기준으로 지난 시간을 millisecond으로 계산해서 long형으로 반환하는 메소드가 있다.
		 * */
		System.out.println(endDay.getTimeInMillis());
		
		Date date = new Date(endDay.getTimeInMillis());
		System.out.println(date);
		
		/* 생성 된 인스턴스의 필드 정보를 Calendar 클래스에 있는 get() 메소드를 사용하여 반환 받을 수 있다. */
		int endYear = endDay.get(1);
		int endMonth = endDay.get(2);
		int endDayOfMonth = endDay.get(5);
		
		System.out.println(endYear);
		System.out.println(endMonth);
		System.out.println(endDayOfMonth);
		
		/* 인자로 전달하는 정수에 따라 필드 값을 반환 받는데 각 필드에 매칭 되는 정수를 외우고 있을 수는 없으므로
		 * 해당 값을 상수 필드 형태로 제공한다. 
		 * */
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		/* get() 메소드의 인자로 정수 대신 상수 필드 값을 호출하는 식으로 코드를 개선하면
		 * 보다 의미 전달이 쉬운 코드가 된다. */
		System.out.println("year : " + endDay.get(Calendar.YEAR));
		System.out.println("month : " + endDay.get(Calendar.MONTH));
		System.out.println("dayOfMonth : " + endDay.get(Calendar.DATE));
		/* 요일(일-1, 월-2, ..., 토-7)의 의미이다. */
		System.out.println("dayOfWeek : " + endDay.get(Calendar.DAY_OF_WEEK));
		
		String day = "";
		switch(endDay.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY : day = "일"; break;
		case Calendar.MONDAY : day = "월"; break;
		case Calendar.TUESDAY : day = "화"; break;
		case Calendar.WEDNESDAY : day = "수"; break;
		case Calendar.THURSDAY : day = "목"; break;
		case Calendar.FRIDAY : day = "금"; break;
		case Calendar.SATURDAY : day = "토"; break;
		}
		
		System.out.println(day + "요일");
		
		System.out.println("ampm : " + endDay.get(Calendar.AM_PM));	//0은 오전, 1은 오후
		System.out.println(endDay.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후");
		
		System.out.println("hourOfDay : " + endDay.get(Calendar.HOUR_OF_DAY));	//24시간 체계
		System.out.println("hour : " + endDay.get(Calendar.HOUR)); 				//12시간 체계
		
		System.out.println("min : " + endDay.get(Calendar.MINUTE));
		System.out.println("second : " + endDay.get(Calendar.SECOND));
		
		
	}

}
