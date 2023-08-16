
public class StringBufferTest04 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		
		// 5. append() : 문자열을 뒤에서 추가하는 메소드
		sb1.append("Hello Java World!");
		sb1.append("Android");
		System.out.println(sb1);
		
		// 6. charAt() :  인덱스에 해당하는 한 문자를 리턴하는 메소드
		char c1 = sb1.charAt(6);
		System.out.println(c1);
		char c2 = sb1.charAt(11);
		System.out.println(c2);
		
		// 7. deleteCharAt() : 인덱스에 해당하는 한 문자를 삭제하는 메소드
		sb1.deleteCharAt(11);
		System.out.println(sb1);
		
		// 8. delete() : 범위에 해당하는 문자열을 삭제하는 메소드
		sb1.delete(6, 10); // 6번에서 10번 앞까지 삭제
		System.out.println(sb1);
		
		// 9. insert() : 특정 위치에 해당문자(열)를 추가하는 메소드
		sb1.insert(7, "W");
		System.out.println(sb1);
		sb1.insert(6, "Java");
		System.out.println(sb1);
		
		// 10. replace() : 특정 위치의 문자(열)을 해당 문자(열)로 변경하는 메소드
		sb1.replace(6,  10, "Spring");
		System.out.println(sb1);
		sb1.replace(0,  5, "Hi");
		System.out.println(sb1);
		sb1.replace(15,  16, "?");
		System.out.println(sb1);
		
		// 11. reverse() : 문자열을 거꾸로 뒤집어 주는 메소드
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		// 12. setCharAt() : 특정위치의 1문자를 변경하는 메소드
		sb1.setCharAt(15, "@");
		System.out.println(sb1);
		
		// 13. length() : 문자열의 길이를 반환하는 메소드
		System.out.println("문자열 길이 : " + sb1.length());
		System.out.println("용량 : " + sb1.capacity());
		
		// 14. setLength() : 문자열의 길이를 변경하는 메소드, 용량은 변경되지 않음.
		sb1.setLength(15);
		System.out.println("문자열 길이 : " + sb1.length());
		System.out.println("용량 : " + sb1.capacity());
		System.out.println(sb1);
		
		//15. trimToSize() : 문자열의 크기(length)만큼 용량(capacity)을 줄이는 메소드
		sb1.trimToSize();
		System.out.println("문자열 길이 : ");
		// 16. substring() : 문자열에서 특정 문자(열)을 추출하는 메소드
		String s1 = sb1.substring(0, 2); //0부터 2번 앞까지
		System.out.println(s1);
		String s2 = sb1.substring(3, 9);// 3번부터 9번 앞까지
		System.out.println(s2);
		//String s3 = sb1.substring(10, 15);
		String s3 = sb1.substring(10); // 10번부터 끝까지
		System.out.println(s3);
		
	}
}
