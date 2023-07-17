import java.util.Scanner;

/* 변수, 연산자, 입력, 출력에 퀴즈
퀴즈 1번) 원의 반지름과 원주율을 입력하여, 원의 둘레와 원의 면적을 구하는 프로그램을 작성
변수 : radius, pi, perimeter, area
 */
public class Scanner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("원주율 입력 : ");
		//double b = sc.nextDouble();
		float b = sc.nextFloat();
		System.out.println("원의 둘레 : " + (2 * a * b));
		System.out.println("원의 면적 : " + (a * a * b));
	}
}
