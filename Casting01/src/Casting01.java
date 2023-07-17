/*
 퀴즈 2번) 국어, 영어, 수학 점수를 입력하여, 총점과 평균을 구하시오.
 변수명 : kor, eng, mat, sum, avg
  
 */

import java.util.Scanner;

public class Casting01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		double sum = kor + eng + mat ;
		System.out.println("총점 : " + sum);
		double avg = sum / 3;
		System.out.println("평균 : " + avg);
	}
}
