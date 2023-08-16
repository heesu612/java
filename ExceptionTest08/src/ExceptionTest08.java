import java.util.Arrays;

class Member {
	private int no;
	private String name;
	
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[" + no + "]" + name;
	}
}

/*
문제2) 주어진 조건에 따라 실행하고, 예외처리를 하시오.
1. names, nos를 사용하여 members의 인스턴스를 만들어 저장
2. members의 내용을 출력
3. members를 출력하는 과정에서 발생하는 예외를 발견하고, 정상적으로 처리될수 있도록 예외처리하시오.
4. 예외처리 유무와 상관없이 회원수를 출력하도록 하시오
 
 */
public class ExceptionTest08 {
	public static void main(String[] args) {
		Member[] members = new Member[4];
		String[] names = {"이익준", "김준완", "채송화"};
		int[] nos = {123456, 123457, 123458};
		
		// 1번 - 예외발생 : java.lang.ArrayIndexOutOfBoundsException: 3
		
		try {
			for(int i=0; i<=members.length;i++) {
				members[i] = new Member(nos[i],names[i]);
				System.out.println(members[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage() + "번 인덱스는 없습니다.");
		} finally {
			System.out.println("회원수 : " + (members.length-1));
		}
		System.out.println(Arrays.toString(members));
		
		
		// 2번 - members의 데이터를 출력할 때 예외 발생.
		// 예외 : java.lang.NullPointerException
		try {
			for(int i=0; i<members.length; i++) {
				System.out.println(members[i].toString());
			}
		} catch(NullPointerException e) {
			System.err.println("\nnull인 데이터를 참조할 수 없습니다.");
		} finally {
			System.out.println("회원수 : " + (members.length-1));
		}
		
		System.out.println("프로그램이 예외를 처리하고, 정상적으로 실행되었습니다.");

	}
}
