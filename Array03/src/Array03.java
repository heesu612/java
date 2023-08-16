
public class Array03 {
	public static void main(String[] args) {
		// 1차원 배열 생성
		// 3번 방법 - 배열의 생성과 초기화를 동시에 함.
		
		//int[] a = new int[] {10, 20, 30, 40, 50};
		//int[] a = {10, 20, 30, 40, 50}; // 배열의 생성과 초기화를 동시에 할때만 new int[]을 생략할 수 있음.
		
		//int[] a;
		// a = new int[] {10, 20, 30, 40, 50};
		
		// net int[]을 생략하면 에러 발생.
		//int[] a;
		//a = {10, 20, 30, 40, 50}; // 에러발생
		
 		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
