import java.util.Calendar;

// Calendar 클래스는 추상 클래스
public class CalendarTest01 {
	public static void main(String[] args) {
		// 1. 시스템의 날짜와 시간을 가져오는 방법
		//Calendar c = new Calendar(); // 추상 클래스는 인스턴스를 생성할 수 없음.
		Calendar c = Calendar.getInstance(); // Calendar 클래스를 사용하는 방법.
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;// 월은 0~11 사이의 값, 1을 더해서 보정해서 사용
		int date = c.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND); // 1000분의 1초
		System.out.println(hour + " 시 " + minute + " 분 " + second + " 초 " + millisecond + "밀리초");
		
		// Calendar 클래스에서 추가한 기능
		System.out.println("올해의 몇번째 주 : " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇번째 주 : " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 며칠 : " + c.get(Calendar.DATE));
		System.out.println("이달의 며칠 : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 며칠 : " + c.get(Calendar.DAY_OF_YEAR));
		
		// <요일을 다루는 방법>
		// 2023년 8월 1일 화요일 -> 3
		// 요일(1~7) : 일:1, 월:2, 화:3 , 수:4, 목:5, 금:6, 토:7
		System.out.println("오늘 요일 : " + c.get(Calendar.DAY_OF_WEEK));
		
		// 요일 - 1번 방법 -> 배열 활용
		String[] dayOfWeek = {"","일","월","화","수","목","금","토"};
		System.out.println("오늘 요일 : " + dayOfWeek[c.get(Calendar.DAY_OF_WEEK)]);
		
		// 요일 - 2번 방법 -> Calendar 클래스의 상수를 활용
		System.out.print("오늘 요일 : ");
		switch(c.get(Calendar.DAY_OF_WEEK)) {
		
		case 1: System.out.println("일"); break;
		case 2: System.out.println("월"); break;
		case 3: System.out.println("화"); break;
		case 4: System.out.println("수"); break;
		case 5: System.out.println("목"); break;
		case 6: System.out.println("금"); break;
		case 7: System.out.println("토"); break;
		
		}
		
		System.out.print("오늘 요일 : ");
		switch(c.get(Calendar.DAY_OF_WEEK)) {
		
		case Calendar.SUNDAY: System.out.println("일"); break;
		case Calendar.MONDAY: System.out.println("월"); break;
		case Calendar.TUESDAY: System.out.println("화"); break;
		case Calendar.WEDNESDAY: System.out.println("수"); break;
		case Calendar.THURSDAY: System.out.println("목"); break;
		case Calendar.FRIDAY: System.out.println("금"); break;
		case Calendar.SATURDAY: System.out.println("토"); break;
		
		}
		
		
	}
}
