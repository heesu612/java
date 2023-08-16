package test;

import account.Account;
import account.TimeAccount;

public class AccountTest05 {
	public static void main(String[] args) {
		Account a1 = new Account("ddd","123456",1000); // 부모 클래스
		TimeAccount a2 = new TimeAccount("aaa","654321", 3000, 100); // 자식 클래스
		
		// 다형성 구현의 기본 원리?
		Account x;
		x = a1;
		x = a2;// 가능 : 부모의 참조변수는 자식의 인스턴스를 참조할 수 있다.
		
		TimeAccount y;
		//y = a1; // 불가능 : 자식의 참조변수는 부모의 인스턴스를 참조할 수 없다.
		y = a2;
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println();
		
		a1.showInfo();
		a2.showInfo();
		
		
	}
}
