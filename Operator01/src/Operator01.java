
public class Operator01 {
	public static void main(String[] args) {
		// 1. 산술 연산자 - +, -, *, /(몫), %(나머지)
		System.out.println(3 + 5);
		System.out.println(10 - 3);
		System.out.println(3 * 5);
		System.out.println(10 / 3); // 3 -> 나누기의 몫
		System.out.println(10 % 3); // 1 -> 나누기의 나머지
		
		// 2. 증감 연산자 - ++, --
		// 항에 대한 위치 : 앞에 붙으면 전위, 뒤에 붙으면 후위
		// 전위 증가 연산자, 후위 증가 연산자, 전위 감소 연산자, 후위 감소 연산자
		int a = 10, b;
		b = ++a; // 전위 증가, a= 11 ,b= 11
		//b = a++; // 후위 증가 , a= 11,b= 10
		//b = --a; // 전위 감소, a= 9,b= 9
		//b = a--; // 후위 감소, a= 9,b= 10
		System.out.println("a = " + a + " b = " + b);
		
		// 3. 비교 연산자 : - >, <, >=, <=, ==, !=, instanceof(다형성)
		// 비교 연산의 결과는 논리값(true, false)
		int c = 10, d = 20;
		System.out.println(c > d); // false
		System.out.println(c >= d);
		System.out.println(c < d);
		System.out.println(c <= d);
		System.out.println(c == d);
		System.out.println(c != d);
		
		// 4. 논리 연산자 - &&(논리 AND, 논리곱), ||(논리 OR, 논리합), !(논리 NOT, 논리부정)
		// 논리 연산의 결과는 논리값(true, false)
		// && : 모두 참일 때, 전체 결과가 참이 됨
		// || : 하나라도 참이 있다면, 전체 결과가 참이 됨.
		a = 10;
		b = 20;
		c = 30;
		d = 40;
		System.out.println(a<b && c<d); // true && true -> true
		System.out.println(a<b && c>d); // true && false -> false
		System.out.println(a<b || c<d); // true || true -> true
		System.out.println(a<b || c>d); // true || false -> true
		
	}
}
