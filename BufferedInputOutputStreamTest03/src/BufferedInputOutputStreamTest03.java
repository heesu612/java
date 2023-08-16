import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamTest03 {
	public static void main(String[] args) {
		// 예외 처리에서 추가된 방법
		// try-with-resource
		// - java 7버전에서 추가됨.
		// - 코드가 간결, 리소스를 관리(파일 닫는 구문을 생략할 수 있음.)
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/temp/npp.exe"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:/temp/npp_copy.exe"));) {
			
			int data = 0;
			long sTime = System.currentTimeMillis();
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			long eTime = System.currentTimeMillis();
			
			System.out.println("파일 복사가 종료되었습니다.");
			System.out.println("복사 시간 : " + (eTime-sTime)/1000.0 + "s");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}