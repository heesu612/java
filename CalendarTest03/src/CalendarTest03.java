import java.util.Calendar;

// 
public class CalendarTest03 {
	public static void main(String[] args) {
		// 3. 두 날짜 사이의 차이
		Calendar c1 = Calendar.getInstance(); // 현재 날짜
		Calendar c2 = Calendar.getInstance(); // 수업 종강일 : 2023년 11월 15일 18시 30분으로 설정
		
		c2.set(2023,  Calendar.NOVEMBER,15, 18, 30, 0);
		//c2.set(2023, 10, 15, 18, 30, 0); // 수업 종강일 : 2023년 11월 15일 18시 30분으로 설정
		
		long differTime = c2.getTimeInMillis() - c1.getTimeInMillis();
		System.out.println("두 날짜의 차이 : " + differTime + "밀리초"); //1000분 1초 
		System.out.println("두 날짜의 차이 : " + differTime/1000 + "초");
		System.out.println("두 날짜의 차이 : " + differTime/1000/60 + "분");
		System.out.println("두 날짜의 차이 : " + differTime/1000/60/60 + "시간");
		System.out.println("두 날짜의 차이 : " + differTime/1000/60/60/24 + "일");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
