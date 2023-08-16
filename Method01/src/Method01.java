// method(메소드)
// 1. 함수(function)
// 2. 특정 기능을 하도록 하는 명령문의 집합
// 3. 클래스으 ㅣ일부분

// 두개의 정수를 입력하여 덧셈을 하는 프로그램

import java.util.Scanner;

public class Method01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수a 입력: ");
		int a = sc.nextInt();
		System.out.print("정수a 입력: ");
		int b = sc.nextInt();
		
		// 1번 - 메소드를 만들어 사용하기 전
		int c = a + b;
		
		System.out.print("합계: " + c);
		
		sc.close();
		
	}

}
