// 문제2) 실수 1개(x)와 정수 1개(y)를 입력하여, x의 y승을 구하는 프로그램을 작성하시오.
// x의 y승을 구하는 부분을 메소드로 만들어 사용하시오.
// 메소드명: calcPower()

import java.util.Scanner;

public class Method04 {
	/*
	static double calcPower(double x , double y) {
		double power = 1;
		for(double i=1; i<=y; i++) {
				power *= x;
			
		}
		return power;
	 
	}
	*/
	static double calcPower(double x, int y) {
		double power = 1;
		for(int i=1; i<=y; i++) { // int i=0; i<y; i++ // 0부터 돌리는 경우가 많다. 연습!
			power *= x;
		}
		return power;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 입력:(실수) ");
		double x = sc.nextDouble();
		System.out.print("y 입력:(정수) ");
		int y = sc.nextInt();
		
		double power = calcPower(x, y); // 메소드 호출
				
		System.out.printf("%.2f의 %d승은 %f", x, y, power);
		
		sc.close();
	}

}
