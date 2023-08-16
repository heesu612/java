// 문제3) 가위 바위 보 게임을 계속할 것인지를 물어보고, 게임을 마친 후에는 승패의 수를 출력하도록 하시오.
// 계속 유무에서 'n'을 입력하면 게임을 마치도록 하시오.
// 출력 -> 5전 3승 1패 1무, 승률 60%
// 문제3) 가위 바위 보 게임을 계속할 것은지를 물어보고, 게임을 마친 후에는 승패의 수를 출력하도록 하시오.

import java.util.Scanner;

public class LoopTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char anwer;
		int tot = 0, win = 0, lost = 0, same = 0;
		double ratio = 0.0;
		
		
		do {
			// 사용자 입력
			System.out.print("0(가위), 1(바위), 2(보) 입력: ");
			int n = sc.nextInt();
			
			
			// 컴퓨터 난수 셍성
			int rn = (int)(Math.random() * 3);
			int result = ((n - rn)+3) % 3;
			
			// 승리 여부
			switch(result) {
			case 1:
				System.out.println("당신이 이겼습니다");
				++ win;
				break;
			case 2:
				System.out.println("당신이 졌습니다");
				++lost;
				break;
			case 0:
				System.out.println("비겼습니다.");
				++same;
				break;
				
			}
			System.out.printf("사용자: %d, 컴퓨터: %d\n", n, rn);
			
			// 게임 유무 확인
			System.out.print("게임을 다시 하시겠습니까? (y/s): ");
			anwer = sc.next().charAt(0);
			
			
		} while (anwer == 'y');
		
		// 승리확률계산
		ratio = ((double)win / (double)tot) * 100;
		
		System.out.println("가위 바위 보 게임을 종료합니다.");
		System.out.print("당신의 전적은 %d전 %d승 %d패 %d무 입니다\n");
		System.out.println("");
		sc.close();
		
	}
}
