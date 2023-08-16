import java.util.HashSet;

class Student {
	private String sno; // 학번
	private String sname; // 학생이름
	
	// 생성자
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	// getter
	public String getSno() {
		return sno;
	}
	
	public String getSname() {
		return sname;
	}
	
	// setter
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String toString() {
		return sno + " ( " + sname + ")";
	}
	
	// hashCode() 오버라이딩
	@Override
	public int hashCode() {
		return (sno + sname).hashCode();
	}
	
	// equals() 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student) obj;
			return this.sno.equals(s.sno) && this.sname.equals(s.sname); // 문자열이 같은지 비교하려면, equals메소드사용해야함(꼭 기억)
		}
		
		return false;
	}
	
}
/*
문제1) 아래의 조건에 따라, Student 클래스를 완성하고, Student의 인스턴스를 저장하는 HashSet인 set을 만들어 활용
1. Student 클래스를 완성
- 생성자, getter/setter, toString()
2. Student의 인스턴스를 저장하는 HashSet인 set을 생성
3. 셋에 5명의 학생을 추가
4. 중복 데이터의 허용 여부를 단계별로 확인
 */

public class HashSetTest05 {
	public static void main(String[] args) {
		// set 생성
		HashSet<Student> set = new HashSet<Student>();
		
		// 데이터 추가
		set.add(new Student("123", "aaa"));
		set.add(new Student("456", "bbb"));
		set.add(new Student("789", "ccc"));
		set.add(new Student("111", "ddd"));
		set.add(new Student("222", "eee"));
		System.out.println(set);
		System.out.println("-----------------");
		
		// 중복 데이터 허용 여부
		// 1. 번호만 중복
		set.add(new Student("123", "ggg"));
		System.out.println(set);
		System.out.println(" 크기 : " + set.size());
		System.out.println("----------");
		
		// 2. 이름만 중복
		set.add(new Student("555", "bbb"));
		System.out.println(set);
		System.out.println(" 크기 : " + set.size());
		System.out.println("----------");
		
		// 3. 둘다 중복 - hashcode사용해서 중복 금지시킴 사용하지않으면 허용됨.
		set.add(new Student("123", "aaa"));
		System.out.println(set);
		System.out.println(" 크기 : " + set.size());
		System.out.println("----------");
		
	}
}
