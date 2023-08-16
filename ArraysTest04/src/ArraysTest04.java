import java.util.Arrays;

public class ArraysTest04 {
	public static void main(String[] args) {
		int[] x = new int[10];
		
		System.out.println(Arrays.toString(x));
		
		// 7. Arrays.fill() : 배열의 값을 특정값을 채우는 메소드
		Arrays.fill(x, 3); // 전체를 3으로 채울 때
		System.out.println(Arrays.toString(x));
		
		Arrays.fill(x,  2, 5, 10); // 2번에서 5번 앞까지 10으로 채움
		System.out.println(Arrays.toString(x));
		
		
		
		int[] a = {98, 87, 58, 86, 68, 72};
		
		// 8. Arrays.binarySearch() : 배열에서값에 대한 인덱스를 검색하는 메소드
		// 
		System.out.println(Arrays.binarySearch(a, 68)); // 3
		System.out.println(Arrays.binarySearch(a, 58)); // 2
		System.out.println(Arrays.binarySearch(a, 87)); // 
		System.out.println(Arrays.binarySearch(a, 85)); // -6, 음수값-> 찾지 못함.
		
		// 문자열에서는 이상현상
		String[] s = {"ddd","fff","ggg","sss","aaa"};
		System.out.println(Arrays.binarySearch(s,"fff"));
		*/
		
	}
}
