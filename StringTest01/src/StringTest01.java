
public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "XYZ";
		String s3 = "ABC"; // s1과 같은 곳을 참조, 기존에 있던 문자열을 참조
		String s4 = "ABC";
		s4 = s1; // s1과 같은 곳을 참조,  s4가 참조하던 값을 Garbage Data가 됨, JVM이 회수해서 재활용함.
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("--------");
		// 해시코드(hashcode) - 각 인스턴스가 가지는 고유한 아이다.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("-------");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
	}

}
