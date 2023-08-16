/*
문제 1)
1. numbers 배열을 사용하여 합계를 구하시오.
2. 계산 과정에서 발생하는 예외를 발견하고, 예외를 처리하여 정상적으로 프로그램을 끝마치도록 하시오.

 */
public class ExceptionTest05 {
	public static void main(String[] args) {
		String[] numbers = {"95","87","66","77","83","3.14"};
		int sum = 0;
		
		// 예외 발생 : java.lang.NumberFormatException : For input String :3.14
		// 예외 처리
		try {
			for(int i = 0; i<numbers.length;i++) {
				
				String num = numbers[i];
				int num2 = Integer.parseInt(num);
				
				sum += num2;
			}
			
		} catch(NumberFormatException e) {
			e.printStackTrace();
			//System.err.println();
			
		} finally {
			System.out.println("합계 : " + sum);
			System.out.println("예외를 처리하고 나서도 프로그램은 계속 실행되어야 합니다.");
		}
	}
}
