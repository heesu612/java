// 문제 5) 국어, 수학, 영어 점수를 입력하여, 총점, 평균, 학점을 구하시오.
// 변수명 : kor, eng, mat, sum, avg, grade
// 학점 : 평균이 90점 이상이면 A, 80점이상이면 B, 70점 이상이면 C, 60점이상이면 D, 60점 미만이면 F

import java.util.Scanner;

public class If05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 :");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 :");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 :");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = (double)sum/3;
		char grade;
		
		int avg1 = (int)avg/10;
		if(avg1 == 10 || avg1 ==9 ) {
			grade = 'A';
		} else if(avg1 == 8) {
			grade = 'B';
		} else if(avg1 == 7) {
			grade = 'C';
		} else if(avg1 == 6) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		// 출력화면
		/*
		System.out.println("총점은" + sum +"입니다.");
		System.out.printf("평균은 %.4f\n 입니다.", avg);
		System.out.println("학점은 " +grade +"입니다.");
		*/
		System.out.printf("총점 : %d\n평균: %.4f\n학점 : %c",sum,avg,grade);
		sc.close();
		
	}

}
