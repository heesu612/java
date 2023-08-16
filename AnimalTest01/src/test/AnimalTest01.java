package test;

import animal.Animal;
import animal.Cat;
import animal.Dog;

public class AnimalTest01 {
	public static void main(String[] args) {
		// 추상 클래스를 인스턴스를 생성할 수 없다.
		// Animal ani = new Animal("사자");
		
		
		// 인스턴스 배열 1번
		/*
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("해피","푸들");
		animals[1] = new Cat("나비", 3);
		animals[2] = new Dog("행복","리트리버");
		animals[3] = new Cat("별이", 2);
		*/
		
		Animal[] animals = new Animal[] {
				new Dog("해피","푸들"),
				new Cat("나비", 3),
				new Dog("행복","리트리버"),
				new Cat("별이", 2),
				
		};
		
		// 출력 1번 -기본 for문
		/*
		for (int i=0; i<animals.length; i++) {
			animals[i].introduce();
			System.out.println();
		}
		*/
		
		// 출력 2번 - 확장 for 문
		for(Animal a : animals) {
			a.introduce();
			System.out.println();
		}
		
	
	}
}
