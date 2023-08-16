// 문제 4) 정수 1개를 입력하여, 3의 배수 인지 4의 배수인지 3의 배수이면서 4의 배수인지, 3의 배수도 4의 배수도 아닌지 

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		if(a%3==0 && a%4==0) {
			System.out.println(a + "은/는 3의 배수이면서 4의 배수 입니다.");
		} else if(a%3==0) {
			System.out.println(a + "은/는 3의 배수입니다.");
		} else if(a%4==0) {
			System.out.println(a + "은/는 4의 배수입니다.");
		} else {
			System.out.println(a + "은/는 3의 배수도 4의 배수도 아닙니다.");
		}
		
		sc.close();
		
	}


}
