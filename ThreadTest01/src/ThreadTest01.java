
// 프로세스(process) : 하나의 프로그램에서 동작하는 작업 단위
// 스레드(Thread) : 하나의 프로세스에서 동작하는 세부적인 작업 단위(일꾼)

// 스레드를 생성하는 방법 1 - Thread 클래스를 상속하는 방법
class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println(getName());
		}
	}
}

// 스레드를 생성하는 방법 2 - Runnable 인터페이스를 구현하는 방법
class MyThread2 implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i<10 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class ThreadTest01 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.run();
		
		//MyThread2 mt = new MyThread2();
		//Thread t2 = new Thread(mt);
		Thread t2 = new Thread(new MyThread2());
		t2.start();
		
	}
}
