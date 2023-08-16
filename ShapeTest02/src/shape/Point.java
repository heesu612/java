package shape;

public class Point extends Shape{
	
	@Override
	public void draw() {
		System.out.println("*");
	}
	
	@Override
	public String toString() {
		return "point";
	}
}
