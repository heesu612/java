// 문제3) 3개의 정수를 입력하여, 최대값과 최소값을 구하는 프로그램을 작성하시오.
// 최대값과 최소값은 메소드를 생성하여 사용하시오.
// 메소드명: calcMax(), calcMin()

import java.util.Scanner;

public class Method05 {
	static int calcMax(int x, int y, int z) {
		int max;
		if(x > y) {
			if(x > z) {
				max = x;
			}
		}
		return max = x;
	}
	
	static int calcMin(int x, int y, int z) {
		int min;
		if(x < y) {
			if(x < z) {
				min = x;				
			}
		}
		return min = x;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1번 정수 입력: ");
		int n1 = sc.nextInt();
		System.out.print("2번 정수 입력: ");
		int n2 = sc.nextInt();
		System.out.print("3번 정수 입력: ");
		int n3 = sc.nextInt();
		
		int max = calcMax(n1, n2, n3);
		
		int min = calcMin(n1, n2, n3);
		
		System.out.printf("최대값: %d\n최소값: %d\n", max, min);
		
		sc.close();
	}

}
