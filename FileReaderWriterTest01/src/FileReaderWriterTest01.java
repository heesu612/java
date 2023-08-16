import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("C:/Windows/system.ini"));
			bw = new BufferedWriter(new FileWriter("C:/temp/system.txt"));
			
			int data = 0;
			while((data=br.read()) != -1) {
				bw.write(data);
			}
			
			br.close();
			bw.close();
			
			System.out.println();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
