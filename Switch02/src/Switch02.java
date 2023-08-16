import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = (double)sum/3;
		System.out.printf("총점은 %d입니다.\n평균은 %.2f입니다.",sum,avg);
		
		char grade;
		switch((int)avg/10) {
		case 10 : case 9 :
			grade = 'A';
			System.out.printf("학점은 %c입니다",grade);
			break;
		case 8 :
			grade = 'B';
			System.out.printf("학점은 %c입니다",grade);
			break;
		case 7 :
			grade = 'C';
			System.out.printf("학점은 %c입니다",grade);
			break;
		case 6 :
			grade = 'D';
			System.out.printf("학점은 %c입니다",grade);
			break;
		default :
			grade = 'F';
			System.out.printf("학점은 %c입니다",grade);
			break;
			
		}
		
		

		sc.close();
	}

}
