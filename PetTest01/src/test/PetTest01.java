package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("해피", "ㅇㅇㅇ");
		RobotPet mark = new RobotPet("마크", "ㄴㅇㄹ");
		
		happy.introduce();
		System.out.println();
		mark.introduce();
		System.out.println();
		
		// 동적 바인딩(Dynamic Binding)
		// 부모(를..?) 자식을 잠조해도 자식의 데이터(실제 데이터)를 출력한다.
		Pet star = mark; // 가능
		star.introduce();
	}
}
