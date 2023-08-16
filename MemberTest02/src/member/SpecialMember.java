package member;
/*
2. 자식 클래스 
- Member의 모든 자산을 상속받는 클래스
- 클래스명 : SpecialMember
- 인스턴스 변수 : privilege(특별혜택)
- 생성자, getter/setter, 출력메소드(showInfo), toString()
*/

public class SpecialMember extends Member {

	private String privilege;
	
	public SpecialMember(String name, int no, int age, String privilege) {
		super(name,no,age);
		this.privilege = privilege;
	}
	
	// getter
	public String getPrivilege() {
		return privilege;
	}
	// setter
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	public void showInfo() {
		System.out.printf("회원이름 : %s 회원번호 : %d 회원나이 : %d 특별혜택 : %s\n",this.getName(),this.getNo(),this.getAge(),privilege);
	}
	public String toString() {
		return super.toString() + " 특별혜택 : "+ privilege;
	}
}
