/*
 퀴즈 2번) 정수 1개를 입력하여 별표로 정삼각형을 출력하시오.
    *
   ***
  *****
 *******
 */
import java.util.Scanner;

public class Loop2D11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();

		/*
		// 1번
		for(int i = 1; i<= a; i++) {
			for(int j = 1; j<=a-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i*2-1;j++) {
				System.out.printf("*");
			}
			
			System.out.println();
		}
		*/
		/*
		// 2번
		int k = 1;
		for(int i = 1; i<= a; i++) {
			for(int j = 1; j<=a-i; j++) { // 공백
				System.out.print(" ");
			}
			for(int j = 1; j <= k;j++) { // 별표
				System.out.printf("*");
			}
			k += 2;
			System.out.println();
		}
		*/
		
		// 3번- 2번을 간결하게 표현
		for(int i = 1, k=1; i<= a; i++, k+=2) {
			for(int j = 1; j<=a-i; j++) { // 공백
				System.out.print(" ");
			}
			for(int j = 1; j <= k;j++) { // 별표
				System.out.printf("*");
			}
			System.out.println();
		}
		sc.close();
	}

}