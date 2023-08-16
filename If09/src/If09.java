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

public class If09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String c = sc.next();
		int sum;
		
		// 계산, 출력 화면
		// -> 문제점 : 잘못된 결과, == 은 참조형(객체형)에 대해서는 참조를 비교, 값을 비교하는 것이 아님
		// -> 해결책 : 문자열의 값의 비교는 equals() 메소드를 사용
		/*
		if(c == "+") {
			sum = a + b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == "-") {
			sum = a - b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == "*") {
			sum = a * b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == "/") {
			sum = a / b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c == "%") {
			sum = a / b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		}
	
		*/
		
		if(c.equals("+")) {
			sum = a + b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c.equals("-")) {
			sum = a - b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c.equals("*")) {
			sum = a * b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c.equals("/")) {
			sum = a / b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		} else if(c.equals("%")) {
			sum = a / b;
			System.out.printf("%d %s %d = %d", a,c,b,sum);
		}
		
		sc.close();
		
	}
}
