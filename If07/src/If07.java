// 문제 7번) 출생년도를 입력하여, 세대와 특징을 출력
//

import java.util.Scanner;

public class If07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int year = sc.nextInt();
		
		if(year>=1955 && year <=1964) {
			System.out.println(year +"에 태어났다면 1차 베이비 부머(57~66) 고령자편입 본격화");
		} else if(year>=1965 && year <=1974) {
			System.out.println(year +"에 태어났다면 2차 베이비 부머(47~56) 정년 연장 혜택 누려");
		} else if(year>=1975 && year <=1984) {
			System.out.println(year +"에 태어났다면 X세대(37~46) 중간관리자, 윗 세대 관행 거부");
		} else if(year>=1985 && year <=1996) {
			System.out.println(year +"에 태어났다면 밀레니얼세대(Y세대)(25~36) 대학진학률 최정점 사회진출 가속");
		} else if(year>=1997 && year <=2016) {
			System.out.println(year +"에 태어났다면 Z세대(~24) 초저출산 시기");
		} else if(year>=2017) {
			System.out.println(year +"에 태어났다면 골드베이비 세대(4~)");
		}

		sc.close();
		
	}


}
