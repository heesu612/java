
// 공유 프린터(네트워크 프린터)
class SharedPrinter {
	
	public void print(String t) {
		for(int i=0; i<t.length(); i++) {
			System.out.print(t.charAt(i));
			Thread.yield();
		}
		System.out.println();
	}
}


class WorkerThread extends Thread {
	private SharedPrinter p;
	private String[] text;
	
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}
	
	@Override
	public void run() {
		for(int i=0; i<text.length; i++) {
			p.print(text[i]);
		}
	}
}
public class ThreadTest07 {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		
		String[] eng = {
				"Wise men say Only fools rush in",
				"But I can't help falling in love with you",
				"Wise men say Only fools rush in",
				"But I can't help falling in love with you",
				"Shall I stay Would it be a sin",
				"But I can't help falling in love with you",
				"As the river flows Gently to the sea",
				"Darling so we go Some things were meant to be"
				
		};
		
		String[] kor = {
				"동해물과 백두산이 마르고 닳도록",
				"하느님이 보우하사 우리나라 만세",
				"무궁화 삼천리 화려강산",
				"대한사람 대한으로 길이 보전하세",
				"남산 위에 저 소나무 철갑을 두른 듯",
				"바람 서리 불변함은 우리 기상일세",
				"무궁화 삼천리 화려강산",
				"대한사람 대한으로 길이 보전하세",
				
		};
		
		WorkerThread t1 = new WorkerThread(p, eng);
		WorkerThread t2 = new WorkerThread(p, kor);
		
		t1.start();
		t2.start();
		

	}
}
