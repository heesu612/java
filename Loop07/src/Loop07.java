// 문제 7) 실수를 입력하여 입력한 수의 삼각함수 값을 구하시오.
// 무한 루프를 사용하여 3가지의 메뉴를 1-3 중에서 선택하게 하고, 
// 1-3의 메뉴가 아닌 경우에는 다시 선택 메뉴를 보여주도록 하고,
// 0을 입력하면 종료하도록 하시오.
// 무한루프(while), break, continue, switch~case문,
/*
 <입력 화면> - 메뉴 선택 화면
 1 - sin 함수
 2 - cos 함수
 3 - tan 함수
 0 - 종료
 
 */

import java.util.Scanner;

public class Loop07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("- 삼각 함수 계산 메뉴 -\n1. sin 함수\n2. cos 함수\n3. tan 함수");
			System.out.println("\n메뉴 번호를 선택하세요. : ");
			n = sc.nextInt();
			/*
			if(n==1) {
				System.out.println("sin 함수 ,정수를 입력하세요 : ");
				double a = sc.nextDouble();
				System.out.println(Math.sin(a));
				
			} else if(n==2) {
				System.out.println("cos 함수, 정수를 입력하세요 : ");
				double a = sc.nextDouble();
				System.out.println(Math.cos(a));
			} else if(n==3) {
				System.out.println("tan 함수, 정수를 입력하세요 : ");
				double a = sc.nextDouble();
				System.out.println(Math.tan(a));
			} else if(n!=0 && n>3) {
				continue;
			}
			*/
			switch(n) {
			case 1 :
				System.out.println("sin 함수 ,실수를 입력하세요 : ");
				double a = sc.nextDouble();
				System.out.println(Math.sin(a));
				break;
			case 2 :
				System.out.println("cos 함수, 실수를 입력하세요 : ");
				double b = sc.nextDouble();
				System.out.println(Math.cos(b));
				break;
			case 3 :
				System.out.println("tan 함수, 실수를 입력하세요 : ");
				double c = sc.nextDouble();
				System.out.println(Math.tan(c));
				break;
			default :
				continue;
			}
			
		} while(n != 0);
		System.out.println("메뉴를 종료하겠습니다.");
	sc.close();
	}
}