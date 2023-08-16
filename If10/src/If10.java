// 문제9번) 두 개의 정수와 연산자를 입력하여, 계산하는 프로그램을 작성하시오.
/*
 <입력 화면>
 첫번째 정수 입력 : 10
 두번째 정수 입력 : 3
 연산자 입력 : *
 
 <출력 화면>
 10 * 3 = 30
 */

import java.util.Scanner;

public class If10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		System.out.print("연산자 입력 : ");
		char c = sc.next().charAt(0); // 문자열 중에서 첫번째 문자만 저장
		int sum;
		
		
		if(c == '+') {
			sum = a + b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == '-') {
			sum = a - b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == '*') {
			sum = a * b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == '/') {
			sum = a / b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == '%') {
			sum = a / b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		}
	
		
		sc.close();
		
	}
}