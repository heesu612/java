import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:/temp/test01.txt");
			fos = new FileOutputStream("C:/temp/test01_copy.txt");
			
			int data = 0;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("파일을 읽고, 썼습니다.");
			fis.close();
			fos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
