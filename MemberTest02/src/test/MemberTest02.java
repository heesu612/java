package test;

import member.Member;
import member.SpecialMember;

/*
 문제 1) 아래의 조건에 따라 상속 관계를 구현하여, 활용
 1. 부모 클래스 
 - 클래스명 : Member
 - 인스턴스 변수 : name(회원이름), no(회원번호), age(회원나이)
 - 생성자, getter/setter, 출력메소드(showInfo), toString()
  
 2. 자식 클래스 
 - Member의 모든 자산을 상속받는 클래스
 - 클래스명 : SpecialMember
 - 인스턴스 변수 : privilege(특별혜택)
 - 생성자, getter/setter, 출력메소드(showInfo), toString()
 
 3. 인스턴스를 생성
 - 부모2개, 자식2개 -> 총 4개의 인스턴스를 생성
 - showInfo로 출력, toString()으로 출력
 
 4. 3번문제를 인스턴스 배열로 만들어서 처리.
 */

// 다형성(Polymorphism)
// - 상속의 관계를 만들어서 한꺼번에 처리할 수 있도록 하는 것

public class MemberTest02 {
	public static void main(String[] args) {
		// 배열
		Member[] members = new Member[] {
				new Member("ddd", 123456, 35),
				new SpecialMember("fff", 123457, 19, "10%할인"),
				new Member("ggg", 123458, 30),
				new SpecialMember("dadf", 123459, 42, "1일 무료")
		};
		
		// 1번 - 기본 for 문
		for(int i=0; i<members.length;i++) {
			System.out.println(members[i].toString());
		}
		System.out.println("---------------------");
		
		// 2번 - 확장 for문
		for(Member m : members) {
			System.out.println(m.toString());
		}
		
		/*
		//배열x
		// 인스턴스 생성
		
		Member person1 = new Member("yun", 123, 26);
		Member person2 = new Member("na", 456, 35);
		
		SpecialMember person3 = new SpecialMember("jung", 789, 41, "10%");
		SpecialMember person4 = new SpecialMember("park", 777, 21, "5%");
		
		
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		System.out.println(person4.toString());
		System.out.println("----------");
		
		person1.showInfo();
		person2.showInfo();
		person3.showInfo();
		person4.showInfo();
		*/
	}
}
