import java.io.File;

//File 클래스
// - 파일과 디렉토리(폴더)에 대한 정보를 가지는 클래스
// - 파일 삭제, 복사, 이동 등에 대한 제어를 하는 기능을 가진 클래스
public class FileTest01 {
	public static void main(String[] args) {
		File file = new File("C:/temp/jdk.exe");
		String fileName = file.getName();
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("경로를 포함한 파일이름 : " + file.getPath());
		System.out.println("파일이 있는 디렉토리 이름 : " + file.getParent());
		System.out.println("경로를 제외한 파일 이름 : " + file.getName());
		System.out.println("확장자를 제외한 파일 이름 : " + fileName.substring(0, pos));
		System.out.println("파일의 확장자(종류) : " + fileName.substring(pos+1));
		System.out.println("파일 크기 : " + file.length()+"Byte");
		
	}
}
