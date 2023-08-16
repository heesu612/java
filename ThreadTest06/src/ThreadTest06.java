
// 공유 집계판
class SyncBoard {
	private int sum = 0;
	
	// 임계 영역 (critical section) -> 동기화 영역으로 변경해야 함.
	public synchronized void add() {
		int n = sum;
		for(int i=0; i<10;i++) {
			Thread.yield();
		}
		
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
		
	}
	
	public int getSum() {
		return sum;
	}
}

class WorkerThread extends Thread {
	private SyncBoard sb;
	
	public WorkerThread(String name, SyncBoard sb) {
		super(name);
		this.sb = sb;
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i<10) {
			sb.add();
			i++;
		}
	}
}

public class ThreadTest06 {
	public static void main(String[] args) {
		SyncBoard sb = new SyncBoard();
		
		WorkerThread t1 = new WorkerThread("John", sb);
		WorkerThread t2 = new WorkerThread("Mary", sb);
		
		t1.start();
		t2.start();
	}
	
}
