import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:/temp/slack.exe");
			fos = new FileOutputStream("C:/temp/slack.exe");
			
			int data = 0;
			while((data=fis.read()) != -1) {
				fos.write(data);
			}
			
			System.out.println("복사가 완료되었습니다.");
			fis.close();
			fos.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
