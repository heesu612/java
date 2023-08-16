// 문제1) 원의 반지름을 입력하여, 원의 둘레와 원의 면적을 구하시오.
// 원의 둘레와 원의 면적은 메소드로 생성하여 사용하시오.
// 메소드명: calcPerimeter(), calcArea()
// 원주율: Math.PI

import java.util.Scanner;

public class Method03 {
	/*
	static double calcPerimeter(double x, double y) {
		double z = (2*x) * y;
		return z;
	}
	
	static double calcArea(double x, double y) {
		double z = (x * x) * y;
		return z;
	}
	*/
	
	static double calcPerimeter(double r) {
		double perimeter = 2 * Math.PI * r;
		return perimeter;
	}
	static double calcArea(double r) {
		double area = Math.PI * r * r;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		/*
		double calcP = calcPerimeter(radius, Math.PI);
		
		double calcA = calcArea(radius, Math.PI);
		*/
		
		double perimeter = calcPerimeter(radius);
		
		double area = calcArea(radius);
		System.out.println("원의 둘레: " + perimeter);
		System.out.println("원의 면적: " + area);	
				
	}

}
