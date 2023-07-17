
public class Operator02 {
	public static void main(String[] args) {
		// 5. 비트 연산자 - &(비트 AND), |(비트 OR), ^(Exclusive OR, XOR, 베타적 OR), ~(비트 NOT)
		// - 2진수로 연산하는 연산자
		// &(비트 AND) : 두 개 모두다 1일 때 결과가 1
		// |(비트 OR) : 둘 중에 하나라도 1이 있으면 결과가 1이 된다.
		// ^(XOR) : 둘의 값이 다를 때 1, 같으면 0
		// ~(비트 NOT) : 1을 0으로, 0을 1로 변환함.
		
		System.out.println(47 & 73); // 9
		System.out.println(47 | 73); // 111
		System.out.println(47 ^ 73); // 102
		System.out.println(~47); // -48
		
		// 6. 쉬프트 연산자 - <<(레프트 쉬프트), >>(라이트 쉬프트)
		int a = 2, b = 64;
		System.out.println(a << 4); // 32
		System.out.println(b >> 3); // 8
		
		// 7. 조건 선택 연산자 - ? :
		// 조건 ? 참 : 거짓
		a = 10;
		b = 5;
		int c;
		c = a < b ? a : b;
		System.out.println(c);
		
		// 8. 대입 연산자(=), 복합 대입 연산자(+=, -=, *=, /=, %=, &=, |=, ^=,)
	}
}
