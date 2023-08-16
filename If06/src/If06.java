// 문제 6) 월을 입력하여 계절을 판별
// 3,4,5 : 봄 
// 6,7,8 :여름
// 9,10,11 : 가을
// 12, 1, 2 : 겨울
// 이외의 값 : 잘못입력하셨습니다.
// 변수명 : month

import java.util.Scanner;

public class If06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int month = sc.nextInt();
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println(month + " 은/는 봄입니다.");
		} else if(month == 6 || month == 7 || month == 8) {
			System.out.println(month + " 은/는 여름입니다.");
		} else if(month == 9 || month == 10 || month == 11) {
			System.out.println(month + " 은/는 가을입니다.");
		} else if(month == 12 || month == 1 || month == 2) {
			System.out.println(month + " 은/는 겨울입니다.");
		} else {
			System.out.println(month + " 은/는 잘못입력하셨습니다.");
		}
		sc.close();
		
	}

}
