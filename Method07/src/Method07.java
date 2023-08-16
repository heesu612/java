// 문제7) 정수 1개와 기호 1개를 입력하여, 좌하변이 직각인 직각삼각형을 출력
// 메소드명 : putChar()
/*
 <입력화면>
 정수 입력 : 5
 기호 입력 : @
 
 <출력화면>
 @
 @@
 @@@
 @@@@
 @@@@@
 */

import java.util.Scanner;

public class Method07 {
	
	static void putChar(int n, char k) {
		for(int i = 1 ; i <= n ; i++ ) {
			System.out.print(k);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		System.out.print("기호를 입력하세요 : ");
		char k = sc.next().charAt(0);
		
		for(int i = 1; i <= n; i++) {
			putChar(i,k);
			System.out.println();
		}
		sc.close();
	}
}
