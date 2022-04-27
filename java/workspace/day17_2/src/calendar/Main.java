package calendar;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		// 캘린더 객체 생성 / 싱글톤
		Calendar cal = Calendar.getInstance();

		// 년월 시분초  24시간
		int yy = cal.get(Calendar.YEAR);
		//자바에서 월은 0부터 시작
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);

		System.out.printf("%4d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", yy, mm, dd, hh, mi, ss);
		
		
		
		//년월일시분초 12시간
		yy = cal.get(Calendar.YEAR);
		mm = cal.get(Calendar.MONTH);
		dd = cal.get(Calendar.DAY_OF_MONTH);
		hh = cal.get(Calendar.HOUR);
		mi = cal.get(Calendar.MINUTE);
		ss = cal.get(Calendar.SECOND);
		
		// 오전 오후
		int ampm = cal.get(Calendar.AM_PM);
		String[] apName = {"오전","오후"};
		System.out.printf("%4d년 %02d월 %02d일 %s %02d시 %02d분 %02d초\n", yy, mm, dd,apName[ampm], hh, mi, ss);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
