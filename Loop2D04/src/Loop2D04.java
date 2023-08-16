// 문제4) 정수 1개를 입력하여, "*"기호로 좌상변이 직각인 직각삼각형을 출력하시오.
// if문을 사용하지 않고, 중첩 반복문 만을 사용하여 작성.
/*
< 입력 화면 >
길이 입력: 5

< 출력 화면 >
*****
****
***
**
*

*/

import java.util.Scanner;

public class Loop2D04 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("길이 입력: ");
      int n = sc.nextInt();
      
      //1-1번
      /*
      for(int i=1; i<=n; i++) {
         for(int j=n; j>=i; j--) {
            System.out.print("*");
         }
         System.out.println();
      }
      */
      
      // 1-2번
      /*
      for(int i=1; i<=n; i++) {
         for(int j=i; j<=n; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      */
      
      // 1-3번
      
//      for(int i=1; i<=n; i++) {
//         for(int j=1; i-1<=n-j; j++) {
//            System.out.print("*");
//         }
//         System.out.println();
//      }
      // 1-4번
      /*
      for(int i=1; i<=n; i++) {
         for(int j=1; j<=n+1-i; j++) {
            System.out.print("*");
         }
         System.out.println();
      }
      */
      // 2번 - if문 사용 
      for(int i=1; i<=n; i++) {
    	  for(int j=1;j<=n;j++) {
    		  if(j>=i) {
    			  System.out.print("*");
    		  }
    	  }
    	  System.out.println();
      }
      
      
      
      sc.close();
   }

}