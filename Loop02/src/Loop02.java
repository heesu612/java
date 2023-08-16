// 문제2) 정수 1개를 입력하여, 입력한 수까지 중에서 3의 배수이면서 4의 배수를 출력하고,
// 합계와 개수를 구하시오.
 import java.util.Scanner;
 
public class Loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int sum=0;
		int cnt=0;
		
		for(int i=1; i <= a; i++) {
			if(i%3 == 0 && i%4 == 0) {
				++cnt;
				sum += i;
				System.out.println(i);
			}
		}
		System.out.printf("합계 : %d\n개수 : %d", sum, cnt);
	}
}
