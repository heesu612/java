// 문제 2) 0(가위), 1(바위), 2(보)의 숫자를 입력하여, 가위, 바위, 보 게임을 작성하시오.
// 컴퓨터하고 게임을 하고, 컴퓨터는 0, 1, 2의 난수를 생성하여 내가 입력한 숫자와 비교를 한다.

// 문제 3)
import java.util.Random;
import java.util.Scanner;

public class LoopText02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		// 난수 생성
		//System.out.println(Math.random()); // 0~ 1미만의 실수형 난수, 0~0.999...
		//System.out.println(Math.random()*10); // 0~ 10미만의 실수형 난수, 0~9.999....
		//System.out.println((int)(Math.random()*10)); // 0~ 10미만의 정수형 난수
		//System.out.println((int)(Math.random()*10)+1); // 1 ~ 10 사이의 난수.
		
		do {
		
			// 사용자 입력 = 0, 1, 2
			System.out.print("\n--- 가위 바위 보 게임 시작(0 : 가위, 1 : 바위, 2: 보, 8 : 게임 종료) ---");
			System.out.print("\n사용자 선택 : ");
			n = sc.nextInt();
			
			// 컴퓨터가 난수 생성 - 0, 1, 2
			int rn = (int)(Math.random() * 3); // 0, 1, 2의 난수를 발생
			System.out.printf("컴퓨터의 결과 : %d\n", rn);
			
			// 강사님
			// 계산식
			int result = n - rn;
			
			// 결과
			switch(result) {
			case 1: case -2:
				System.out.println("당신이 이겼습니다");
				break;
			case 2: case -1:
				System.out.println("당신이 졌습니다");
				break;
			case 0:
				System.out.println("비겼습니다.");
				
			}
			System.out.printf("사용자: %d, 컴퓨터: %d\n", n, rn);
			/*
			if (n == 0) {
				if(rn == 0) {
					System.out.println("둘다 가위를 내서 비겼습니다.");
				} else if(rn == 1) {
					System.out.println("컴퓨터가 바위를 내 당신이 패배하였습니다.");
				} else {
					System.out.println("컴퓨터가 보를 내 당신이 승리하였습니다.");
				}
			} else if (n == 1) {
				if(rn == 0) {
					System.out.println("컴퓨터가 가위를 내 당신이 승리하였습니다.");
				} else if(rn == 1) {
					System.out.println("둘다 바위를 내서 비겼습니다.");
				} else {
					System.out.println("컴퓨터가 보를 내 당신이 패배하였습니다.");
				}
			} else if (n == 2) {
				if(rn == 0) {
					System.out.println("컴퓨터가 가위를 내 당신이 패배하였습니다.");
				} else if(rn == 1) {
					System.out.println("컴퓨터가 바위를 내 당신이 승리하였습니다.");
				} else {
					System.out.println("둘다 보를 내서 비겼습니다.");
				}
			*/
		} while(n != 8);
		System.out.print("게임이 종료됩니다.");
		
		/*
		do {
			System.out.print("--- 가위 바위 보 게임 시작(0 : 가위, 1 : 바위, 2: 보, 8 : 게임 종료) ---");
			int a = sc.nextInt();
			Random rand = new Random();
			System.out.println("컴퓨터의 결과 : " + rand.nextInt(3));
			if(a == 0) {
				if (rand == 1) {
					
				}
			}
		
		} while();
		 */
		sc.close();
	}
	

}
