// 문제 2) 정수 1개를 입력하여 3의 배수이면서 4의 배수인지를 판별
// 정수를 나누었을 때, 나머지가 0이면
import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		if(a%3==0 && a%4==0) {
			System.out.println(a + "은/는 3의 배수이면서 4의 배수 입니다.");
		} else {
			System.out.println(a + "은/는 3의 배수이면서 4의 배수가 아닙니다.");
		}
		
		sc.close();
		
	}

}
