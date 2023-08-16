
public class MathTest02 {
	public static void main(String[] args) {
		// 최대값, 최소값
		System.out.println(Math.max(10, 20)); // 둘 중의 큰 값을 구함
		System.out.println(Math.max(5.7, 3.8));
		System.out.println(Math.max(5.5, 7));
		System.out.println(Math.min(10, 20)); // 둘 중의 작은 값을 구함
		System.out.println(Math.min(5.7, 3.8));
		System.out.println(Math.min(5.5, 7));
		System.out.println("------");
		System.out.println(Math.max(10, Math.max(20, 30))); // 메소들르 중첩해서 사용하면 여러 개의 값을 비교할 수 있음
		System.out.println(Math.min(10,  Math.min(20, 30)));
		System.out.println("------");
		// round() 메소드를 활용하는 방법
		// - 소수 첫째 자리에서 반올림하여 정수를 구함
		System.out.println(Math.round(10.1)); // 10
		System.out.println(Math.round(10.5)); // 11
		// 1. 소수 첫째 자리까지 구하는 방법
		double n = 60.56789;
		double n2 = Math.round(n * 10) / 10.0; // 605.6789 -> 606 / 10.0 -> 60.6
		System.out.println(n2);
		// 2. 소수 둘째 자리까지 구하는 방법(셋째 자리에서 반올림)
		double n3 = Math.round(n * 100) / 100.0; // 6056.789 -> 6057 / 100.0 -> 60.57
		System.out.println(n3);
		// 3. 소수 셋째 자리까지 구하는 방법(넷째 자리에서 반올림)
		double n4 = Math.round(n * 1000) / 1000.0; // 60567.89 -> 60568 / 1000.0 -> 60.568
		System.out.println(n4);
		System.out.println("------");
		
		// 다양한 난수를 생성하는 방법
		// 난수 : 무작위수, random number, 정해지지 않은 수
		// Math.random(), Random 클래스
		// random() : 0 ~ 1 미만의 실수 난수를 생성하는 메소드
		System.out.println(Math.random());
		
		// 범위의 정수 난수를 생성하는 방법
		// 1. 0 ~ 9 사이의 난수
		int rn = Math.random() * 9;
	}
}
