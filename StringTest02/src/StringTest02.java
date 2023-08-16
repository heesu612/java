
public class StringTest02 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("XYZ");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("-----");
		// s1과 s3가 각각의 인스턴스를 생성하므로 해시코드가 달라야 하지만, 똑같은 해시코드가 출력된다.
		// 이유는 String 클래스에서 값이 같으면 같은 해시코드가 나오도록  hashcode()를 오버라이딩하였기 때문. 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("-----");
		// System.identityHashCode() 메소드를 사용하여 정확한 해시코드를 파악할 수 있다.
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}
}
