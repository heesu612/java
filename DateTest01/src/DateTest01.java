import java.util.Date;

// Date 클래스 : Java 1.0 버전부터 사용
// Calendar 클래스 : Date 클래스의 문제점을 보완하고 개선해서 만든 클래스
public class DateTest01 {
	public static void main(String[] args) {
		Date d = new Date();
		
		int year = d.getYear() + 1900; // 1900년부터 시작, 1900을 더해서 보정
		int month = d.getMonth() + 1; // 월은 0~11까지의 값, 1을 더해서 보정 
		int date = d.getDate();
		
		System.out.println(year + "년" + month + " 월" + date + "일");
		
		int hour = d.getHours();
		int minute = d.getMinutes();
		int second = d.getSeconds();
		System.out.println(hour + "시" + minute + "분" + second + "초");
		System.out.println("-------");
		
		// 2. 날짜를 생성하는 방법
		// 2-1. setter를 사용
		// ex) 2023년 7월 20일 18시 30분 10초 설정 -> 여자 월드컵 개최일
		Date d2 = new Date();
		d2.setYear(123); // 1900을 빼서 삽입
		d2.setMonth(6); // 월은 0~11까지의 값, 7월이면 1을 빼서 6을 저장
		d2.setDate(20);
		d2.setHours(10);
		d2.setMinutes(30);
		d2.setSeconds(10);
		
		year = d2.getYear() + 1900;
		month = d2.getMonth() + 1; // 월은 0 ~ 11 까지의 값, 1을 더해서 보정
		date = d2.getDate();
		hour = d2.getHours();
		minute = d2.getMinutes();
		second = d2.getSeconds();
		
		System.out.println(year + "년" + month + " 월" + date + "일" + hour + "시" + minute + "분" + second + "초");
		System.out.println("---------");
		
		// 2-2. 생성자를 사용
		// ex) 2023년 8월 20일 21시 45분 30초 설정 -> 여자 월드컵 폐회일
		Date d3 = new Date(2023, 7, 20, 21, 45, 30); // 년은 1900을 빼고 저장, 월은 1을 빼서 저장
		
		year = d3.getYear() + 1900; // 1900을 더해서 보정
		month = d3.getMonth() + 1; // 월은 1을 더해서 사용
		date = d3.getDate();
		hour = d3.getHours();
		minute = d3.getMinutes();
		second = d3.getSeconds();
		
		System.out.println(year + "년" + month + " 월" + date + "일" + hour + "시" + minute + "분" + second + "초");
		System.out.println("-----------");
		
		// 날짜 정보 확인 메소드
		// 3923-1900 = 2023
		System.out.println(d3.getTime()); // 시간의 밀리초
		System.out.println(d3.toString()); // Mon Aug 20 21:45:30 KST 2023
		System.out.println(d3.toGMTString()); // 20 Aug 2023 12:45:30 GMT -> 그리니치 천문대 -9로 설정
		System.out.println(d3.toLocaleString()); // 2023. 8. 20 오후 9:45:30
	}
}
