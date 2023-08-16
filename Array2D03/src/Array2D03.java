// 문제1) 학생 5명의 3과목의 점수를 더하여 총점과 평균을 계산하시오.
// 개선 -> 학생수를 입력하고, 각 과목의 점수를 입력하여 계산하고, 출력하도록 개선함.
//   ㄴ 나중에 꼭 해보기를. 0721 과제!

public class Array2D03 {
	public static void main(String[] args) {
		// 학생 5명의 국어, 영어, 수학, 총점 을 계산하는 2차원 배열
		int[][] scores = new int[][] {
			{93, 93, 92, 0}, // 0번 학생 3- 총점, int형 배열, 소수점 출력이 불가하여 평균은 넣지 않는다.
			{85, 85, 86, 0}, // 1번 학생
			{71, 71, 72, 0}, // 2번 학생
			{68, 68, 67, 0}, // 3번 학생
			{83, 83, 82, 0}, // 4번 학생
		};
		
		// 학생 5명의 평균을 저장하는 1차원 배열 - 실수형
		// 평균을 위한(실수형) 새로운 배열을 생성. 평균을 저장. 
		
		double[] avgs = new double[5];
//		double[][] avgs = {0.0, 0.0, 0.0, 0.0, 0.0};
		
		
		// 총점과 평균을 계산
		/*
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				if(j<3) {
					scores[i][3] += scores[i][j];
				}
				
			}
//			System.out.println(scores[i][3]);
//			System.out.printf("%2d번 학생의 점수: %d, %d, %d", i+1, scores[i], scores[i][j]);
		}
		
		// 평균
		
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				avgs[i] = (double)scores[i][3] / (scores[j].length-1);
			}
//			System.out.println(avgs[i]);
		}
		
		// 출력
		// n번학생: 국어 | 영어 | 수학 | 총점 | 평균
		
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%2d번 학생:", i+1);
			for(int j=0; j<scores[i].length; j++) {
				System.out.printf(" %3d |", scores[i][j]);
			}
			System.out.printf(" %.2f", avgs[i]);
			System.out.println();
		}
		*/
		
		
		// 2. 총점과 평균을 계산
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length-1; j++) {
				scores[i][3] += scores[i][j];
			}
			avgs[i] = (double)scores[i][3] / 3;
		}
		
		// 3. 출력
		// 국어 | 영어 | 수학 | 총점 | 평균
		System.out.println("학생들 성적표 |국어  | 영어  | 수학  | 총점  |  평균    |");
		System.out.println("==========================================");
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%2d 번 학생: |", i+1);
			for(int j =0; j<scores[i].length; j++) {
				System.out.printf("%3d | ", scores[i][j]);
			}
			System.out.printf("%.2f |\n", avgs[i]);
		}
		
		// 끝
		
		
		
		
	}

	
}
