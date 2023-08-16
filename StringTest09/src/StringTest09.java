
public class StringTest09 {
	public static void main(String[] args) {
		// 14. split() : 문자열을 구분자로 나누어 배열로 저장하는 메소드
		String animals = "lion,tiger,bear,eagle,monkey,elephant";
		String[] a = animals.split(",");
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		// 15. substring() : 문자열에서 특정 문자(열)을 추출하는 메소드
		String s2 = "Hello Java World!";
		String s3 = s2.substring(6,10); // 6번에서 10번 앞까지 추출
		System.out.println(s3);
		String s4 = s2.substring(11); // 11번에서 끝까지 추출
		System.out.println(s4);
		String s5 = s2.substring(11, 17); // 11번에서 17번 앞까지 추출
		System.out.println(s5);
		
		// 16. hashCode() : 문자열의 해시코드를 확인하는 메소드
		String str1 = "ABC";
		String str2 = "XYZ";
		String str3 = "ABC";
		String str4 = "abc";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		// 17. equals() : 문자열의 값이 같은지 비교하는 메소드
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
		// 18. equalsIgnoreCase() : 문자열을 대소문자 구분없이 같은지 비교하는 메소드
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str4));
		
	}
}
