// 2차원 배열 - 행과 열의 구조를 가지는 배열
//
public class Array2D01 {
	public static void main(String[] args) {
		// 2차원 배열 생성
		// 1번 방법
		/*
		int[][] a; // int형의 2차원 배열을 참조하는 참조변수 a
		a = new int[3][]; // 행의 개수
		a[0] = new int[4]; // 0번 행의 열의 개수
		a[1] = new int[4]; // 1번 행의 열의 개수
		a[2] = new int[4]; // 2번 행의 열의 개수 = int[4]개
		*/
		
		// 2번 방법
		int[][] a= new int[3][4];
		
		/*
		a[0][0] = 10;
		a[2][3] = 50;
//		a[3][4] = 70; //예외,  에러: java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(a[0][0]);
		System.out.println(a[2][3]);
		*/
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}

}
