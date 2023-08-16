import javax.swing.JOptionPane;

// interrupt(인터럽트) : 프로세스 우선순위에서 최우선으로 처리해야하는 상황
public class ThreadTest03 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("이름을 입력하시오. ");
		System.out.println("당신의 이름은 " + input + "입니다.");
		
		// 메인 스레드
		for(int i=10; i>=0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 지연시간 : 1000 millisecond, 1초
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
