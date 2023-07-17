
public class Variable01 {
	public static void main(String[] args) {
		// 1번 방법
		/*
		int a; // 변수 선언, 정수형의 데이터를 저장할 수 있는 4Byte의 공간을 마련하고 이름을 a라고 붙임.
		int b;
		a = 10; // 변수에 값을 대입, 초기화 : 변수에 최초로 값을 대입하는 것
		b = 20;
		*/
		
		// 2번 방법
		/*
		 int a, b; // 같은 데이터 타입일 때 변수선언
		 a =10;
		 b = 20;
		 */
		
		//3번 방법 - 변수를 선언하고 바로 값을 대입하여 초기화
		int a = 10, b = 20;
		
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
	}
}
