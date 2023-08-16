import javax.swing.JOptionPane;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i>=0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest04 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		
		String input = JOptionPane.showInputDialog("이름을 입력하세요.");
		System.out.println("당신의 이름은 " + input + "입니다.");
	}
}
