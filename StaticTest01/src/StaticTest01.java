/*
 <인스턴스 메소드와 클래스 메소드에서의 접근 여부>
 1. 인스턴스 메소드에서는 인스턴스 변수, 인스턴스 메소드, 클래스 변수, 클래스 메소드 모두 사용 가능
 2. 클래스 메소드에서는 클래스 변수, 클래스 메소드는 사용 가능하지만, 인스턴스 변수, 인스턴스 메소드 사용 불가
 3. 
 */
class Static {
	private static int s; // 클래스 변수
	private int i; // 인스턴스 변수
	
	public static void sm1() { } // 클래스 메소드
	public void im1() { } // 인스턴스 메소드
	
	// 클래스 메소드
	public static void sm2(int x) {
		s = x;
		//i = x; // static에서는 인스턴스 변수와 인스턴스 메소드를 사용할 수 없다.
		sm1();
		//im1(); // static에서는 인스턴스 변수와 인스턴스 메소드를 사용할 수 없다.
	}
	
	// 인스턴스 메소드
	public void im2(int x) {
		
	}
	
	// getter - 클래스 메소드
	public static int getS() {
		return s;
	}
	
	// getter - 인스턴스 메소드
	public int getI() {
		return i;
	}
	

}
public class StaticTest01 {
	
	static int add(int x, int y) { // static main에서는 인스턴스 메소드, 인스턴스 변수를 사용할 수 없기때문에 static을 붙여야한다.
		return x + y;
	}
	
	public static void main(String[] args) { // main은 무조건 하나. main 앞에 static 꼭붙여줘야함
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		
		System.out.println("s1's i : " +s1.getI());
		System.out.println("s2's i : " +s2.getI());
		System.out.println("s3's i : " +s3.getI());
		
		//System.out.println("Static's : " + s1.getS()); // 권장하지 않는 방법. 안되는건 아님.
		System.out.println("Static's : " + Static.getS()); // 권장.
	}
}
