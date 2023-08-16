// 문제 1) 학생 5명의 성적에 대한 배열을 만들어 출력하고, 5명의 총점과 평균
// 85, 93, 71, 63, 82

public class Array04 {
	public static void main(String[] args) {
		
		int[] a = {85, 93, 71, 63, 82};
		int sum = 0;
		double avg = 0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
			System.out.printf("%d번 학생의 점수 = %d\n",i+1,a[i]);
		}
		avg = (double)sum / a.length;
		System.out.printf("\n총점 : %d\n평균 : %.2f", sum, avg);
	}
}
