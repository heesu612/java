class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println("-");
			if(i%100==0) System.out.println();
			for(int j=0; j<10000000; j++) {};
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<500;i++) {
			System.out.print("|");
			if(i%100==0) System.out.println();
			for(int j=0; j<10000000;j++) {}
		}
	}
}
// 스레드의 우선순위
// - 스레드의 우선순위 : 1 ~ 10 사이의 값
// - 스레드의 우선순위 : 기본값은 5
public class ThreadTest05 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		System.out.println("t1(-) : " + t1.getName());
		System.out.println("t2(|) : " + t2.getName());
		
		// 스레드의 우선순위 확인
		System.out.println("t1(-) : " + t1.getPriority());
		System.out.println("t2(|) : " + t2.getPriority());
		
		// 스레드의 우선순위 조정
		t1.setPriority(10);
		t2.setPriority(1);
		
		// 데몬 스레드 : 필수적으로 실행되어야 하는 스레드
		/*
		System.out.println(t1.);
		System.out.println("t2(|) : " + t2.getPriority());
		*/
		
		t1.start();
		t2.start();
		
		
	}
}
