// 문제11) 정수 2개를 a, b에 입력하여, a에는 항상 작은 값이 b에 항상 큰 값이 저장되도록 작성하시오.
// 입력a <- 10, b <-5, 출력 a = 5, b = 10

import java.util.Scanner;

public class If11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 값 입력 : ");
		int a = sc.nextInt();
		System.out.print("b 값 입력 : ");
		int b = sc.nextInt();
		int c;
		
		// 계산 -> swapping
		if (a >= b) {
			System.out.printf("a : %d\nb : %d", a, b);
		} else if(a<b) {
			
			c = a;
			a = b;
			b = c;
			
			System.out.printf("a : %d\nb : %d", a, b);
		}
		
		sc.close();
		
	}
}