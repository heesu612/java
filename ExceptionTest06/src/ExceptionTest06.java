
public class ExceptionTest06 {
	public static void main(String[] args) {
		
		try {
			// 1번
			// 예외 생성 방법
			//Exception e = new Exception("고의로 예외를 발생시킴");
			// 예외를 던지는 방법
			//throw e;
			
			// 2번
			throw new Exception("고의로 예외를 발생시킴");
			
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
