package ncs.test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar birth = new GregorianCalendar(1987, 5 - 1, 27);
		Calendar today = new GregorianCalendar();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 d일");

		int factor = 0;
		if (today.get(Calendar.DAY_OF_YEAR) < birth.get(Calendar.DAY_OF_YEAR)) {
			factor = -1;
		}
		int age = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR) + factor;

		System.out.println("생일 : " + sdf1.format(birth.getTime()));
		System.out.println("현재 : " + sdf2.format(today.getTime()));
		System.out.println("나이 : 만 " + age + " 세");

	}

}
