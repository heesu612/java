package pet;

public class RobotPet extends Pet {

	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// 자기 소개 메소드
	// overriding
	
	// 애노테이션(Annotation) : 자바 컴파일러에게 알려주는 주석
	@Override
	public void introduce() {
		System.out.println("저는 로봇입니다. 이름은 " + getName() + "입니다.");
		System.out.println("주인님의 이름은 " + getMasterName() + "입니다.");
		
	}
	
	// 일을 하는 메소드 - 추가
	public void work(int w) {
		switch(w) {
		case 1: System.out.println("청소를 합니다."); break;
		case 2: System.out.println("빨래를 합니다."); break;
		case 3: System.out.println("저녁식사를 만듭니다."); break;
		
		}
	}
	
}