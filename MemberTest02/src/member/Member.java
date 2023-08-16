package member;

public class Member {
	
	private String name;
	private int no;
	private int age;
	
	public Member(String name, int no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getNo() {
		return no;
	}
	
	public int getAge() {
		return age;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showInfo() {
		System.out.printf("회원이름 : %s 회원번호 : %d 회원나이 : %d\n", name, no, age);
	}
	
	public String toString() {
		return String.format("회원이름 : %s 회원번호 : %d 회원나이 : %d", name, no, age);
	}
	
}
