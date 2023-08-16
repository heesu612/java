// 문제 6) 월을 입력하여 계절을 판별
// 3,4,5 : 봄 
// 6,7,8 :여름
// 9,10,11 : 가을
// 12, 1, 2 : 겨울
// 이외의 값 : 잘못입력하셨습니다.
// 변수명 : month

import java.util.Scanner;

public class Switch03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12) : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.printf("%d월의 계절은 겨울입니다.",month);
			break;
		case 3: case 4: case 5:
			System.out.printf("%d월의 계절은 봄입니다.",month);
			break;
		case 6: case 7: case 8:
			System.out.printf("%d월의 계절은 여름입니다.",month);
			break;
		case 9: case 10: case 11:
			System.out.printf("%d월의 계절은 가을입니다.",month);
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		
		sc.close();
		
	}

}