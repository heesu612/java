// StringBuilder 클래스는 StringBuffer 클래스와 기능이 거의 동일함.
// StringBuilder 클래스는 쓰레드 기능이 있어서 성능의 저하가 발생함.
// StringBuilder 클래스는 StringBuffer 클래스의 쓰레드 기능을 제거하여 성능을 향상시킴
public class StringBuilderTest01 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append("Hello").append("Java").append("World");
		System.out.println(sb1);
	}
}
