// 문제5) 정수 1개를 입력하여, "*"기호로 좌상변이 직각인 직각삼각형을 출력하시오.
// if문을 사용하지 않고, 중첩 반복문 만을 사용하여 작성.
// 힌트: 공백찍고 별찍고.
/*
< 입력 화면 >
길이 입력: 5

< 출력 화면 >
    *
   **
  ***
 ****
*****

*/

import java.util.Scanner;

public class Loop2D05 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("길이 입력: ");
      int n = sc.nextInt();
      
      /*
      for(int i=1; i<=n; i++) {
         for(int j=1;j<=n-i ; j++) { // 공백
            System.out.print(" ");            
         }
         for(int j=1;j<=i ; j++) { // 별 ( k라고 선언한다면 3중으로 오해 가능. j라고 써도 문제없다.)
            System.out.print("*");
         }
         System.out.println();
      }
      */
      
  	// 2번 - if문 활용
		for(int i= 1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j >= n+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();

   }

}