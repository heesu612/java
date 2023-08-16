import java.util.HashSet;
import java.util.Iterator;

/*
 문제 1) 아래의 조건을 만족하는 HashSet인 set을 생성하고, 활용
 1. 셋에 names 배열의 값을 추가하고, 확인
 2. 중복 데이터를 삽입하여, 허용 여부를 확인 ex) 채송화
 3. 중복되지 않은 데이터를 삽입하여, 허용 여부를 확인 ex) 장겨울
 4. 김준완 데이터를 삭제하고, 확인
 5. 2가지 출력 방법으로 데이터 출력 (확장 for문, Iterator 사용)
 */
public class HashSetTest02 {
	public static void main(String[] args) {
		String[] names = {"이익준", "김준완", "채송화", "양석형", "안정원"};
		
		HashSet<String> set = new HashSet<String>();
		
		// 배열 값 추가
		/*
		for(String s : names) { // 해싱으로 저장된 애들로 나오는거라 랜덤도 아니고 오름차순도 아님.
			set.add(s);
		}
		System.out.println(set);
		*/
		for(int i=0; i<names.length; i++) {
			set.add(names[i]);
		}
		System.out.println(set);
		
		// 중복데이터 삽입
		set.add("채송화");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복되지 않은 데이터 삽입
		set.add("장겨울");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제 - 존재하는 데이터
		set.remove("김준완");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		System.out.println("---------------");
		
		// 데이터 삭제 - 존재하지 않는 데이터
		set.remove("추민하");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 출력 1 - 확장 for문
		for(String i : set) {
			System.out.println(i);
		}
		System.out.println("---------------");
		
		// 출력 2 - Iterator와 while 문 사용
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String x = it.next();
			System.out.println(x); // = System.out.println(it.next());
		}
	}
}
