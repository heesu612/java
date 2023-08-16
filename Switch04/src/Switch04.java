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

public class Switch04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		System.out.print("연산자 입력 : ");
		char c = sc.next().charAt(0);
		int sum;
		
		// 문자열의 비교에서 equals() 메소드를 사용하지 않아도 값을 비교할 수있음.
		switch(c) {
		case '+' :
			sum = a + b;
			System.out.printf("%d %c %d = %d\n",a,c,b,sum);
			break;
		case '-' :
			sum = a - b;
			System.out.printf("%d %c %d = %d\n",a,c,b,sum);
			break;
		case '*' :
			sum = a * b;
			System.out.printf("%d %c %d = %d\n",a,c,b,sum);
			break;
		case '/' :
			sum = a / b;
			System.out.printf("%d %c %d = %d\n",a,c,b,sum);
			break;
		case '%' :
			sum = a % b;
			System.out.printf("%d %c %d = %d\n",a,c,b,sum);
			break;
		default :
			System.out.printf("잘못입력하셨습니다.");
			break;
		}
		sc.close();
		
	}
}