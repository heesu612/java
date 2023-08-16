import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
< 입출력 >
1. 콘솔 입출력
2. 파일 입출력
3. 네트워크 입출력
4. 데이터베이스 입출력


< 파일 입출력 >
1. 문자 단위 입출력
 - 문자 단위로 입출력하는 것
 - ex) 메모장(txt, ini ...)
 - FileReader, FileWriter

2. 바이트 단위 입출력
 - 바이트 단위로 입출력하는 것
 - ex) 이미지, 동영상, 음악,
 - FileInputStream, FileOutputStream
 
3. 버퍼 입출력
 - 파일 입출력 효율을 높이기 위해 사용하는 것.
 - BufferedReader, BufferedWriter
 - BufferedInputStream, BufferedOutputStream

 */
public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:/temp/test01.txt");
			
			int data = 0;
			while((data = fis.read()) != -1) { // EOF(End Of File)
				char c = (char)data;
				System.out.print(c);
			}
			
			fis.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
