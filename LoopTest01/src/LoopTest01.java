// 문제1) 정수 1개를 입력하여, 입력한 수를 거꾸로 출력
// 정수로 처리하도록 함. 문자열로 처리하지 않음
/*
 -입력화면
 정수 입력 : 34567
 
 -출력화면
 reverse:76543
 */
import java.util.Scanner;

public class LoopTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();

		System.out.print("reverse : ");
		while(a>0) {
			System.out.print(a%10);
			a /= 10;
		}
		
		sc.close();
	}
}
