
public class Variable03 {
	public static void main(String[] args) {
		// 상수 : 변경할 수 없는 값
		// 1번
		final int MAX = 10; // 권장 : 상수는 모든 문자를 대문자로 사용할 것을 권장, final 이라고 앞에 적으면 값을 변경할 수 없다.
		// MAX = 20; // 상수는 값을 변경할 수 없다.
		System.out.println("MAX = " + MAX);
		
		
		// 2번
		final double PI = 3.14;
		//PI = 3.5;// 상수는 값을 변경할 수 없음
		System.out.println("PI = " + PI);
		
		// 3번
		final int SCORE;
		SCORE = 80; // 값을 초기화하는 것은 가능
		//SCORE = 90; // 값을 변경하는 것은 불가능
		
		System.out.println("SCORE = " + SCORE);
	}
}
