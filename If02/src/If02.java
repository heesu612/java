
// 정수 1개를 입력하여 홀수인지, 짝수인지를 판별
// 정수를 나누었을 때, 나머지가 0이면 짝수, 나머지가 1이면 홀수
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		if(a%2 ==0) {
			System.out.println(a + "은 짝수입니다.");
		} else {
			System.out.println(a + "은 홀수입니다.");
		}
		
		sc.close();
		
	}
}
