/*
<try~catch~finally>
 - try ~ catch 또는
   try ~ catch ~ finally로 사용할 수 있음.
 - try문 안에는 예외 발생 구문
 - catch문 안에는 예외가 발생했을 때 실행할 구문, 메시지
 - finally문 안에는 예외 발생 유무와 상관없이 반드시 실행해야하는 구문을 적어둠.
 - try와 catch는 필수적으로 적어야함, finally는 선택
 - try 블럭에서 발생하는 예외가 다양하다면 catch 출력을 여러개 사용할 수 있음.
 	- 아래로 갈수록 상위의 예외를 적어 주어야 함.
 - 모든 예외의 최상위 예외는 Exception이 됨.
 */
public class ExceptionTest04 {
	public static void main(String[] args) {
		int[] a = {95, 88, 75, 66, 82};
		int sum = 0;
		
		// 예외가 발생한다면 : try -> catch -> finally
		// 예외가 발생하지 않으면 : try -> finally, catch문은 사용되지 않음.
		try {
			for(int i=0; i<=a.length; i++) {
				System.out.println("a[" + i + "] = " + a[i]);
				sum += a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			//System.err.println(e.getMessage() + "번 인덱스는 존재하지 않습니다.");
			System.err.println("배열의 인덱스를 벗어났습니다.");
		} catch (Exception e) {
			System.err.println("예외가 발생했습니다.");
			//e.printStackTrace();
		} finally {
			System.out.println("합계 : " + sum);
		}
		
		System.out.println("예외는 발생하면, 처리하고, 프로그램은 계속 실행되어야 합니다.");
		
	}
}
