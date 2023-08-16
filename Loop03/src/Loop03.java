// 문제3) 구구단의 단을 입력하여, 입력한 단의 구구단을 출력.
import java.util.Scanner;
 
public class Loop03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int a = sc.nextInt();
		int b = 0;
		int mul = 0;
		
		for(int i = 1; i<10; i++) {
			b = i;
			mul = a * b;
			System.out.printf("%d * %d = %d\n",a,b,mul);
		}
		
	}
}
