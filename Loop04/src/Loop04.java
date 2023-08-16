// 문제4) 정수 1개를 입력하여, 입력한 정수의 약수를 출력하고,
// 약수의 합계와 개수를 출력
import java.util.Scanner;
 
public class Loop04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int tot = 0;
		int cnt = 0;
		
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				++cnt;
				tot += i;
				System.out.print(i + " ");
			}
		}
		System.out.printf("\n약수의 합계 : %d\n약수의 개수 : %d",tot,cnt);
		sc.close();
	}
}
