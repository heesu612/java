// 문제 6번) 정수 1개를 입력하여, 홀수인지 짝수인지를 판별하는 프로그램을 작성
// switch~case문 사용

import java.util.Scanner;

public class Switch06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		switch(a%2) {
		case 0:
			System.out.printf("%d은/는 짝수입니다.", a);
			break;
		case 1:
			System.out.printf("%d은/는 홀수입니다.", a);
			break;
		}
		
		sc.close();
		
	}
}
