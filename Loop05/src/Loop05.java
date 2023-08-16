import java.util.Scanner;

// 문제 5) 정수 1개를 입력하여, 입력한 수의 팩토리얼을 구하시오
/*
 <입력화면>
 정수 입력 : 5
 <출력화면>
 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class Loop05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int b = 0;
		int mul = 1;
		System.out.print(a + "! = ");
		for(int i = 1;i <= a; i++) {
			if(i<a) {
				b = i;
				mul *= b;
				System.out.print( i + " * ");
			} else {
				b = i;
				mul *= b;
				System.out.print(i);
			}
			
		}
		System.out.printf(" = %d",mul);
		sc.close();
	}

}
