// 문제 6) 단을 입력하여, 입력한 단의 구구단을 출력하시오.
// 구구단의 재입력 여부를 물어보고, 재입력을 원하면 반복하고
// 재입력을 원하지 않으면 프로그램을 끝마치도록 하시오.
//
import java.util.Scanner;

public class Loop06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("<구구단 입력프로그램>\n");
		do {
			System.out.print("단을 입력하세요 : ");
			int a = sc.nextInt();
			int b =0;
			int mul=1;
			for(int i = 1;i<=9;i++) {
				b = i;
				mul = a * b;
				System.out.printf("\n%d * %d = %d",a,b,mul);
			}
			
			System.out.print("\n구구단을 재입력하시겠습니까?(yes = 0, no = 1) : ") ;
			n = sc.nextInt();
			
		} while(n == 0);
		System.out.println("\n구구단 프로그램을 종료합니다.");
		sc.close();
	}

}