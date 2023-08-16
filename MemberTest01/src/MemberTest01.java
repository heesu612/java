// 문제 1) 아래의 조건을 부합하는 Member 클래스를 생성하고, 인스턴스를 만들어 사용
// 1. 멤버변수 : 이름(name), 회원번호(no), 나이(age)
// 2. 생성자 : 멤버변수를 초기화
// 3. 멤버 메소드 : getter, setter, 멤버변수의 정보를 출력 메소드
// 4. 인스턴스 : 회원을  3명 만들어 출력

class Member {
	// 멤버변수
	private String name;
	private String no;
	private int age;
	
	// 기본 생성자
	public Member() {
		
	}
	
	// 생성자
	public Member (String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return this.name;
	}
	
	public String getNo() {
		return this.no;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// setter 
	public void setName(String name) {
		this.name = name;
	}
		
	public void setNo(String no) {
		this.no = no;
	}
		
	public void setAge(int age) {
		this.age = age;
	}
	
	// 출력 메소드
	public void showInfo() {
		System.out.println("회원명 : " + name + ", 번호 : "+ no + ", 나이 : " + age);
	}
}

public class MemberTest01 {
	public static void main(String[] args) {
		Member john = new Member("John", "123", 20);
		Member mary = new Member("mary", "456", 21);
		Member mark = new Member("mark", "789", 25);
		
		john.showInfo();
		mary.showInfo();
		mark.showInfo();
		
		// setter쓰기위함(기본생성자public Member() {},Member sam = new Member(); 를 써줘야 쓸수 있다.)
		Member sam = new Member();// 기본생성자
		sam.setName("sam");
		sam.setNo("32151");
		sam.setAge(26);
		
		// getter 메소드
		System.out.println("회원명 : " + sam.getName());
		System.out.println("회원번호 : " + sam.getNo());
		System.out.println("회원나이 : " + sam.getAge());
		

	}
}
