import java.util.Date;

//SimpleDateFormat 클래스 : 날짜를 다양한 형식으로 출력하는 클래스
// Date 클래스만 가능, Calendar 클래스는 Date

public class SimpleDateFormatTest01 {
	public static void main(String[] args) {
		// 2023년 11월 15일 18시 30분 0초로 설정
		Date d = new Date(123, 10, 15, 18, 30, 0); // 년도는 1900을 빼고 저장, 월은 1을 뺴고 저장
		System.out.println(d.toString()); // Wed Nov 15 18:30:00 KST 2023
		System.out.println(d.toLocaleString()); // 2023. 11. 15 오후 6:30:00
		System.out.println("--------");
		
		// SimpleDateFormat 클래스의 날짜 출력 형식 지정
		// yy : 년도 2자리, yyyy : 년도 4자리
		// MM : 월 2자리, M : 월 1자리 또는 2자리
		// dd : 일 2자리, d : 일 1자리 또는 2자리
		// HH : 24시간, hh : 12시간 
		// mm : 분 2자리, m : 분 1자리 또는 2자리
		// ss : 초2자리, s : 초 1자리 또는 2자리, sss : 밀리초(1000분의 1초)
		// a :오전 또는 오후
		// E : 요일
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy/MM/dd a HH:mm:ss E요일");
		
		// 출력
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		System.out.println(sdf5.format(d));
		
		int a = 1000;
	}
}
