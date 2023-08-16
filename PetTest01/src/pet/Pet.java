package pet;

// 애완 동물 클래스 -> 부모 클래스
// 이름, 주인이름
public class Pet {
	private String name;
	private String masterName;
	
	public Pet(String name, String masterName) {
		this.name = name;
		this.masterName = masterName;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMasterName() {
		return masterName;
	}
	
	// 자기소개 메소드
	public void introduce() {
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("주인 이름은 " + masterName + "입니다.");
		
	}
}
