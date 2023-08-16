package shape;

public class Parallelogram extends Square {
	public Parallelogram(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		for(int i=1;i<=getHeight();i++) {
			for(int j =1; j<=getHeight()-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= getWidth();j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Parallelogram ( width : " + getWidth() + ", height : " + getHeight() + ")";
	}
}
