package test;

import calc.Calc; // 단일형 import
// import calc.*;// 주문형 import

public class PackageTest01 {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		
		System.out.println("덧셈 : " + c1.add(10,20));
		System.out.println("뺄셈 : " + c1.subtract(30,10));
		System.out.println("곱셈 : " + c1.multiply(10,20));
		System.out.println("나누기(몫) : " + c1.divide(10,3));
	}
}
