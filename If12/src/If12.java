// 문제 12) 월을 입력하여 해당 월에 대한 일수를 출력하는 프로그램을 작성
// <출력화면>
// 7월의 일수는 31일입니다.
import java.util.Scanner;

public class If12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 (1~12) :");
		int month = sc.nextInt();
		/*
		if (month == 2) {
			System.out.printf("%d월은 28일 입니다.", month);
		} else if(month >= 13 || month <= 0){
			System.out.println("맞는 값이 아닙니다.");
		} else if(month%2 == 0 && month <8) {
			System.out.printf("%d월은 30일입니다.", month);
		} else if(month%2 == 1 && month >= 8) {
			System.out.printf("%d월은 30일입니다.", month);
		} else if(month%2 == 1 && month < 8) {
			System.out.printf("%d월은 31일입니다.", month);
		} else if(month%2 == 0 && month >= 8) {
			System.out.printf("%d월은 31일입니다.", month);
		}
		*/
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
			System.out.printf("%d월은 31일 입니다.", month);
		} else if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.printf("%d월은 30일입니다.", month);
		} else if(month == 2) {
			System.out.printf("%d월은 28일입니다.", month);
		} else {
			System.out.println("맞는 값이 아닙니다.");
		}
		
		sc.close();
		
	}

}
