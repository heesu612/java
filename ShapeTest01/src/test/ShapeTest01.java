package test;

import shape.HorizontalLine;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;

// 문제 1) Shape의 자식 클래스 4가지 도형을 배열에 담아서, 다형성을 구현하여 출력
public class ShapeTest01 {
	public static void main(String[] args) {
		// 인스턴스 배열 1번
		/*
		Shape[] shapes = new Shape[4];
		shapes[0] = new HorizontalLine(10);
		shapes[1] = new Rectangle(5,7);
		shapes[2] = new VerticalLine(6);
		shapes[3] = new Point();
		*/

		// 인스턴스 배열 2번
		
		Shape[] shapes = new Shape[] {
				new HorizontalLine(10),
				new Rectangle(5,7),
				new VerticalLine(6),
				new Point(),	
		};
		
		// 출력 1번 - 기본 for문
		/*
		for(int i=0; i <= shapes.length ; i++) {
			shapes[i].print();
			System.out.println();
		}
		*/
		// 출력 2번 - 확장 for문
		for(Shape s : shapes) {
			s.print();
			System.out.println();
		}
		
	}
}
