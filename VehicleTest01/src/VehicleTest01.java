//문제 2) 아래의 조건을 부합하는 Vehicle 클래스를 생성하고, 인스턴스를 만들어 사용
// 1. 멤버변수 : 회사(company), 모델명(model), 색상(color), 최고속도(maxSpeed)
// 2. 생성자 : 기본 생성자, 매개변수로 초기화 생성자
// 3. 멤버메소드 : getter, setter, 정보출력 메소드
// 4. 인스턴스를 5개 만들어 사용(1개는 getter, setter사용)
// 5. 4번의 5개의 인스턴스를 배열로 만들어 활용.


/*
 퀴즈 1) 주변의 사물들 중에서 1개의 클래스를 설정하고 사용
 1. 멤버변수 : 3개이상
 2. 생성자 : 기본생성자, 매개변수로 초기화하는 생성자 모두 생성하고 사용
 3. 멤버메소드 : getter, setter, 출력 메소드
 4. 인스턴스 5개 생성(1개는 getter, setter를 사용)
 5. 4번이 완료되면 인스턴스를 배열로 만들어 사용
 */
class Vehicle {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	//기본
	public Vehicle() {
		
	}
	// 생성
	public Vehicle(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	// getter
	public String getCompany() {
		return this.company;
	}
	
	public String getModle() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	//setter
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	// 정보 출력 메소드
	public void showInfo() {
		System.out.println("회사명 : " + company + ", 모델명 : "+ model + ", 색 : " + color + ", 최고속도 : " + maxSpeed);
	}
}

public class VehicleTest01 {
	public static void main(String[] args) {
		/*
		Vehicle v1 = new Vehicle("벤츠", "C클래스", "Black", 201);
		Vehicle v2 = new Vehicle("지프", "랭글러 4XE","Blue",183);
		Vehicle v3 = new Vehicle("지프", "그랜드 체로키 L", "Black",209);
		Vehicle v4 = new Vehicle("지프", "랭글러 2도어", "Green",272);
		
		v1.showInfo();
		v2.showInfo();
		v3.showInfo();
		v4.showInfo();
		
		// setter, getter
		Vehicle v5 = new Vehicle();
		v5.setCompany("지프");
		v5.setModel("랭글러");
		v5.setColor("Red");
		v5.setMaxSpeed(250);
		
		
		System.out.println("회사명 : " + v5.getCompany());
		System.out.println("모델명 : " + v5.getModle());
		System.out.println("색상 : " + v5.getColor());
		System.out.println("최고 속도 : " + v5.getMaxSpeed());
		*/
		
		// 인스턴스 배열
		Vehicle[] vehicles = new Vehicle[] {
				new Vehicle("벤츠", "C클래스", "Black", 201),
				new Vehicle("지프", "랭글러 4XE","Blue",183),
				new Vehicle("지프", "그랜드 체로키 L", "Black",209),
				new Vehicle("지프", "랭글러 2도어", "Green",272),
				new Vehicle("지프", "랭글러", "Red",250),
		};
		
		// 1번 - 기본 for문
		for(int i = 0; i<vehicles.length; i++) {
			vehicles[i].showInfo();
		}
		System.out.println("--------");
		
		// 2번 - 확장 for문
		for(Vehicle v : vehicles) {
			v.showInfo();
		}
	}

}
