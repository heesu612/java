// 문제1) 정수 1개를 입력하여, 입력한 수까지 중에서 홀수를 출력하고,
// 홀수의 개수와 합계를 출력하시오.

import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int num = 0;
		int sum = 0;
		/*
		for(int i = 1; i<(a+1); i = i + 2) {
			num += 1;
			sum = sum + i;
		}
		System.out.printf("홀수의 개수 : %d\n홀수의 합계 : %d", num, sum);
		*/
		for (int i=1; i<=a;i++) {
			if(i%2 == 1) { // i가 홀수인지를 판별
				sum += i ;
				++num;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n총점 : " + sum);
		System.out.println("개수 : " + num);
		sc.close();
		
	}

}
