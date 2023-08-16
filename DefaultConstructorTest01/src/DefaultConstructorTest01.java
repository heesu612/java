// import java.lang.Object;

/*
 Object
 - 자바의 모든 클래스의 부모가 되는 최상위 클래스
 - equals(), toString(), hasCode(), notify(), notifyAll(), wait() ...
 
 super()
 - 모든 디폴트 생성자에 존재함.
 - 부모 클래스의 생성자를 호출함.
 */

class A /* extends Object */ {
	private int a;
	
	public A() {
		super();
		a = 50;
	}
	
	public int getA() {
		return a;
	}
}

class B extends A {
	public B() {
		super();
	}
}
public class DefaultConstructorTest01 {
	public static void main(String[] args) {
		B x = new B();
		
		System.out.println(x.getA());
		
	}
}
