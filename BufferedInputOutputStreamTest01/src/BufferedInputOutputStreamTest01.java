import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("C:/temp/npp.exe");
			fos = new FileOutputStream("C:/temp/npp_copy.exe");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int data = 0;
			long sTime = System.currentTimeMillis();
			while((data=bis.read()) != -1) {
				bos.write(data);
			}
			long eTime = System.currentTimeMillis();
			
			System.out.println("파일 복사가 종료되었습니다.");
			System.out.println("복사 시간 : " + (eTime-sTime)/1000.0 + "s");
				
			//fis.close();
			//fos.close();
				
				
			bis.close();
			bos.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
