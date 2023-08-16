// 새로운 스레드
class MyThread extends Thread {
	@Override
	public void run() {
		long sTime = System.currentTimeMillis();
		for(int i=0; i< 1000; i++) {
			System.out.print("-");
			//System.out.printf("%s", new String("-"));
			if(i%100 == 0) System.out.println();
		}
		long eTime = System.currentTimeMillis();
		System.out.println("\n소요 시간1 : " + (eTime-sTime) + "ms");
	}
}
public class ThreadTest02 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		
		// main 스레드
		long sTime = System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			System.out.print("|");
			//System.out.printf("%s", new String("|"));
			if(i%100 == 0) System.out.println();
		}
		long eTime = System.currentTimeMillis();
		System.out.println("\n소요 시간: " + (eTime-sTime) + "ms");
	}
}
