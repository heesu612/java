
// Math 클래스 : 수학에 관한 다양한 메소드와 상수에 관해 정의해놓은 클래스
// 클래스 메소드, 클래스 상수만 존재함.
// final 클래스 : 인스턴스를 생성할 수 없음.
// 클래스명.메소드명, 클래스명.상수명으로 사용함.
public class MathTest01 {
	public static void main(String[] args) {
		System.out.println(Math.abs(-10)); // 절대값
		System.out.println(Math.sqrt(9)); // 루트값
		System.out.println(Math.PI); // 원주율
		System.out.println(Math.pow(2, 3)); // 승수
		System.out.println("-----------");
		System.out.println(Math.ceil(10.1)); // 11, 올림(큰 정수로 만듦)
		System.out.println(Math.ceil(10.5)); // 11
		System.out.println(Math.ceil(10.0)); // 10
		System.out.println(Math.ceil(-10.1)); // -10
		System.out.println(Math.ceil(-10.5)); // -10
		System.out.println(Math.ceil(-10.0)); // -10
		System.out.println(Math.floor(7.1)); // 7, 내림(작은 정수로 만듦)
		System.out.println(Math.floor(7.5)); // 7
		System.out.println(Math.floor(7.0)); // 7
		System.out.println(Math.floor(-7.1)); // -8
		System.out.println(Math.floor(-7.5)); // -8
		System.out.println(Math.floor(-7.0)); // -7
		System.out.println(Math.round(5.1)); // 5, 반올림(소수 첫째자리에서 반올림하여 정수로 만듦) 
		System.out.println(Math.round(5.5)); // 6
		System.out.println(Math.round(5.0)); // 5
		System.out.println(Math.round(-5.1)); // -5
		System.out.println(Math.round(-5.5)); // -5
		System.out.println(Math.round(-5.0)); // -5
		System.out.println("---------");
		System.out.println(Math.rint(5.1)); // 5.0, 
		System.out.println(Math.rint(5.5)); // 6.0
		System.out.println("-------");
		
		System.out.println(Math.round(1.5));
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(3.5));
		System.out.println(Math.round(4.5));
		System.out.println(Math.round(5.5));
		System.out.println(Math.round(6.5));
		System.out.println(Math.round(7.5));
		System.out.println(Math.round(8.5));
		System.out.println(Math.round(9.5));
		
		System.out.println("------");
		// rint() : 가까운 쪽의 정수값을 선택, 중간일 때는 짝수를 선택
		
		System.out.println(Math.rint(1.5)); // 2.0
		System.out.println(Math.rint(2.5)); // 2.0
		System.out.println(Math.rint(3.5)); // 4.0
		System.out.println(Math.rint(4.5)); // 4.0
		System.out.println(Math.rint(5.5)); // 6.0
		System.out.println(Math.rint(6.5)); // 6.0
		System.out.println(Math.rint(7.5)); // 8.0
		System.out.println(Math.rint(8.5)); // 8.0
		System.out.println(Math.rint(9.5)); // 10.0
	}
}
