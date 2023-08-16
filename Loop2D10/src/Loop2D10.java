/*
 퀴즈 1번) 구구단을 가로로 출력
 퀴즈 2번) 정수 1개를 입력하여 별표로 정삼각형을 출력하시오.
    *
   ***
  *****
 *******
 */

public class Loop2D10 {
	public static void main(String[] args) {
		
		// 1번 - printf() 메소드
		/*
		for(int i = 1; i<=9 ; i++) {
			for(int j=2; j<=9; j++) {
				System.out.printf("%d * %d = %d", j, i, j*i);
			}
			System.out.println();
		}
		*/
		 
		// 2번 - if문
		for(int i = 1; i<= 9;i++) {
			for(int j = 2; j <= 9; j ++) {
				if(j*i <10) { // 단*수 -> 1자리일 때
					System.out.print(j + "*" + i + "=" + (j*i) + " ");
				} else { // 단*수 -> 2자리일 때
					System.out.print(j + "*" + i + "=" + (j*i) + " ");
				}
			}
			System.out.println();
		}
	}

}
