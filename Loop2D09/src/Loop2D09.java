// 문제9) 정수 1개를 입력하여, 입력한 정수까지의 소수를 판별하여 출력하고,
// 합계와 개수를 구하시오.
// 소수(prime number)는 1을 제외하고, 1과 자신으로만 나누어 떨어지는 수
// 예) 2, 3, 5, 7, 11, 13, 17, 19 ...
// 규칙) 1과 자기 자신으로만 나누어 떨어져야 한다. ==> n % n == 0;?
// 힌트) 중첩 반복문, if문, break, continue.
// 반복문 2개==> 2부터 100까지 

// 예제! -> 에라토스테네스의 체(논리적이긴 하지만 효율적이지는 않다.)

import java.util.Scanner;

public class Loop2D09 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("정수 입력: ");
      int n = sc.nextInt();
      
      //
      /*
      for(int i = 2; i <= n ; i++) {
    	  for(int j = 2; j <= i ; j++) {
    	  if(i%2 == 0) {
    	  }
    		  if(i == j) {
    			  System.out.print(i + " ");
    		  }
    		  if(i % j == 0) { // 자신이 되기 나누어 떨어진다면
    			  break;
    		  }
    	  }
    	  
      }
      */
      
      // 
      for(int i = 2; i <= n ; i++) {
    	  for(int j = 2; j <= i-1 ; j++) {
    		  if(i != 2 && i % 2 == 0) { // 2를 제외한 짝수는 소수가 될 수 없다.
    			  break;
    		  } else if(i % j == 0) { // 다른 수로 나누어 떨어지는 수는 소수가 될 수 없다.
    			  break;
    		  } else if(i/(j + 1) == 1 && i%(j + 1) == 0) { // 자기 자신과 나누어 떨어지면서 나머지가 0인 경우 => 소수이다.
    			  System.out.print(i + ", ");
    		  }
    	  }
    	  
      }
      
      
      
      sc.close();
   }

}