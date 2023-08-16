
public class StringTest08 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length() : 문자열의 길이를 알려주는 메소드
		System.out.println(s1.length());
		
		// 9. replace() : 문자열에서 찾은 모든 문자(열)을 변경하는 메소드
		s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java","Android");
		System.out.println(s1);
		s1 = s1.replace("l", "L"); // 찾은 모든 문자를 변경
		System.out.println(s1);
		
		// 10. replaceFirst() :  문자열에서 처음으로 찾은 문자(열)을 변경하는 메소드
		s1 = s1.replaceFirst("o", "O");
		System.out.println(s1);
		
		// 11. toUpperCase() : 문자열을 모두 대문자로 변경하는 메소드
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		// 12. toLowerCase() : 문자열을 모두 소문자로 변경하는 메소드
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		// 13. trim() : 문자열의 앞뒤 공백을 제거하는 메소드
		String s2 = "              Hello        Java           ";
		System.out.println(s2 + "@");
		s2 = s2.trim();
		System.out.println(s2 + "@");
	}
}
