import java.util.Calendar;
import java.util.Date;

public class DateTest02 {
	public static void main(String[] args) {
		// 1. Calendar 클래스를 Date로 변환
		Calendar c = Calendar.getInstance();
		c.set(2023, Calendar.NOVEMBER, 15, 18, 30, 0);
		
		Date d = new Date(c.getTimeInMillis());
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		
		System.out.printf("%4d년 %02d월 %02d일 %02d:%02d\n",year,month,date,hour,minute,second);
		System.out.println(d.toString());
		System.out.println(d.toLocaleString());
		System.out.println("-----------");
		
		// 2. Date 클래스를 Calendar로 변환
		Date d2 = new Date(123, 10, 15, 18, 30, 0); // 년은 1900을 뺴고 저장, 월은 1을 뺴고 저장
		Calendar c2 = Calendar.getInstance();
		
		c2.setTime(d2); // Date -> Calendar로 변경
		year = c2.get(Calendar.YEAR) - 1900; // 3923 - 1900
		month = c2.get(Calendar.MONTH) + 1;
		date = c2.get(Calendar.DATE);
		hour = c2.get(Calendar.HOUR_OF_DAY); // 24시간
		minute = c2.get(Calendar.MINUTE);
		second = c2.get(Calendar.SECOND);
		
		System.out.printf("%4d년 %02d월 %02d일 %02d:%02d\n",year,month,date,hour,minute,second);
		System.out.println(c2.getTime()); // Thu Nov 15 18:30:00 KST 3923
		System.out.println(c2.toString()); // 모든 정보
		
		
	}
}
