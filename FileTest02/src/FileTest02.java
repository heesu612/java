import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) {
		File f1 = new File("C:/temp/test01.txt"); // 파일
		File f2 = new File("C:/temp/sample");     // 디렉토리(폴더)
		File f3 = new File("C:/temp");            // 디렉토리
		
		// 1. 파일인지의 여부 
		String result = null;
		
		if(f1.isFile()) result = "파일";
		else result = "디렉토리";
		System.out.println(f1.getPath() + "은 " + result + "입니다.");
		
		if(f3.isFile()) result = "파일";
		else result = "디렉토리";
		System.out.println(f3.getPath() + "은 " + result + "입니다.");
		
		// 2. 디렉토리인지의 여부 
		if(f1.isDirectory()) result = "디렉토리";
		else result = "파일";
		System.out.println(f1.getPath() + "은 " + result + "입니다.");
		
		if(f3.isDirectory()) result = "디렉토리";
		else result = "파일";
		System.out.println(f3.getPath() + "은 " + result + "입니다.");
		System.out.println("-----------");
		
		// 3. 존재여부를 확인
		System.out.println(f1.exists()); // 존재하면 true 존재하지않으면 false
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		
		// 4. 디렉토리 생성
		if(!f2.exists()) {
			f2.mkdir();
			System.out.println(f2.getName() + "디렉토리가 생성되었습니다.");	
		} else {
			System.out.println(f2.getName() + "디렉토리는 이미 존재합니다.");
		}
		
		// 5. 파일 생성
		File f4 = new File("C:/temp/hello.txt");
		try {
			f4.createNewFile();
			System.out.println("파일 생성에 성공하였습니다.");
		} catch(IOException e) {
			System.err.println("파일 생성에 실패하였습니다.");
		}
		
		// 6. 파일명 변경, numbers.txt -> figures.txt
		/*
		File f5 = new File("C:/temp/number.txt");
		if(f5.renameTo(new File("C:/temp/figures.txt"))) {
			System.out.println("파일명이 변경되었습니다.");
		} else {
			System.out.println("파일명 변경에 실패하였습니다.");
		}
		*/
		
		// 7. 파일 이동
		File f6 = new File("C:/tmp/figures.txt");
		if(f6.renameTo(new File("C:/tmp/numbers.txt"))) {
			System.out.println("파일 이동에 성공하였습니다.");
		} else {
			System.out.println("파일 이동에 실패하였습니다.");
		}
		
		// 8. 파일 삭제
		File f7 = new File("C:/temp/test02.txt");
		if(f7.delete()) {
			System.out.println("파일 삭제에 성공하였습니다.");
		} else {
			System.out.println("파일 삭제에 실패하였습니다.");
		}
		
		// 9. 파일 크기, 수정 시간 정보
		System.out.println("------ File List ---------");
		
		String[] fileList = f3.list();
		for(String s : fileList) {
			File f = new File(f3, s);
			long t = f.lastModified(); // 수정 시간 정보
			System.out.printf("%s : %ty년 %tb월 %td일 %ta요일 %tT\n", s, t, t, t, t, t);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
