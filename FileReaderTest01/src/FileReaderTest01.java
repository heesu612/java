import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileInputStream fis = null;
		
		try {
			// 문자 단위 입력 - 한글이 깨지지 않고 출력
			fr = new FileReader("C:/temp/test01.txt");
			
			int data = 0;
			while((data=fr.read()) != -1) {
				System.out.print((char)data);
			}
			
			fr.close();
			
			// 바이트 단위 입력 - 한글이 깨져서 출력
			fis = new FileInputStream("C:/temp/test01.txt");
			
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
			
			fis.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
