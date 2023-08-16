/*
 객체 지향 프로그래밍(Object Oriented Programming), OOP
 1. 절차 지향(순서대로 진행하는 것) 언어의 문제점을 보완하여 확장시킨 언어.
 2. 객체(Object) : 사물, 회사, 은행 ...
 3. 속성(변수) + 기능(행위, 메소드) -> 한꺼번에 처리할 필요가 늘어남. -> 객체
 
 객체 지향의 3대요소
  -> 캡슐화(클래스), 상속, 다형성
 */

class Car {
	// 멤버 변수
	// 인스턴스 변수 - 인스턴스에 포함되는 변수
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	// 매개변수를 갖는 생성자
	public Car(String name, int width, int height, int length, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	// 멤버 메소드
	// 인스턴스 메소드 - 인스턴스에 포함되는 메소드
	//getter
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	// setter
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	// 차의 제원 출력
	public void putSpec() {
		System.out.println("차 이름 : " + name);
		System.out.println("차 너비 : " + width);
		System.out.println("차 높이 : " + height);
		System.out.println("차 길이 : " + length);
	}
}
public class CarTest01 {
	public static void main(String[] args) {
		Car car1 = new Car("Morning", 1595, 1485, 3595, 100);
		Car car2 = new Car("Casper", 1595, 1575, 3595, 150);
		
		car1.putSpec();
		System.out.println("------");
		car2.putSpec();
	}
}
