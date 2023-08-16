import java.util.Arrays;
import java.util.Collections;

public class ArraysTest03 {
	public static void main(String[] args) {
		Integer[] a1 = {87, 92, 68, 57, 85};
		
		// 6. Arrays.sort() : 배열을 오름차수능로 정렬하여 저장.
		// 1-1. int형
		// 오름차순
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
		
		// 내림차순 - 배열이 Wrapper 클래스이어야 함.
		Integer[] a2 = {87, 92, 68, 57, 85};
		Arrays.sort(a2, Collections.reverseOrder());
		System.out.println(Arrays.toString(a2));
		System.out.println("----------");
		
		// 1-2. 문자열
		String[] s1 = {"ㄴㄴㄴ","ㅇㅇㅇ","ㅎㅎㅎ","ㅂㅂㅂ","ㅍㅍ"};
		// 오름차순
		Arrays.sort(s1);
		System.out.println(Arrays.toString(s1));
	
		// 내림차순
		Arrays.sort(s1, Collections.reverseOrder());
		System.out.println(Arrays.toString(s1));
		
	}
}
