import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("C:/temp/number.txt");
			bos = new BufferedOutputStream(fos, 5);
			
			for(int i='1';i<='9';i++) {
				bos.write(i);
			}
			bos.flush(); // 메모리에 남아있는 데이터를 출력하도록 함.
			
			// bos.close(); // 버퍼를 닫기 전에 flush() 호출함. 버퍼를 닫으면 출력스트림도 닫힌다.
			System.out.println("파일에 쓰기가 완료되었습니다.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
