// 문제 9) 실수 1개(x)와 정수 1개(y)를 입력하여, x의 y승을 구하는 프로그램을 작성
// ex) 2의 5승
// 출력화면 - 2의 5승은 32입니다.
import java.util.Scanner;

public class Loop09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("실수를 입력하세요 : ");
		double a = sc.nextDouble();
		System.out.print("정수를 입력하세요 : ");
		int b = sc.nextInt();
		double mul = 1;
		
		for(int i=1; i<= b; i++) {
			mul *= a;
		}
		System.out.printf("%.2f의 %d승은 %.2f입니다.",a,b,mul);
		sc.close();
	}
}
