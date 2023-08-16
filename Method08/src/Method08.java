
// 문제 8) 학생의 총점, 평균, 학점을 구하는 메소드
// 메소드명 : getSum(), getAvg(), getGrade()

import java.util.Scanner;

public class Method08 {
	
	static int getSum(int [] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
	static double getAvg(int sum, int [] scores) {
		
		double avg = sum/scores.length;
		
		return avg;
	}
	static char getGrade(double avg) {
		char grade;
		switch((int)avg/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;
		}
		return grade;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] scores = {95, 77, 86, 64, 85};
		
		
		int sum = getSum(scores);
		double avg = getAvg(sum, scores);
		char grade = getGrade(avg);
		
		System.out.printf("학생의 총점은 %d이고 평균은 %.2f이며 학점은 %c입니다.",sum,avg,grade);

		sc.close();
	}
}
