import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
 
 < Map >
 1. 데이터가 키(key)와 값(value)의 쌍으로 구성됨.
 2. 맵은 순서가 없다.
 3. 키는 중복을 허용하지 않는다. 값은 중복을 허용한다.
 4. 인터페이스
 5. 구현체 : HashMap, TreeMap ...
 6. Hashtable : HashMap의 구버전, 쓰레드의 동기화 부분이 있어서 성능 저하
  -> HashMap은 쓰레드의 동기화 부분을 제거하여 성능 개선
 
 < HashMap >
 1. 해싱 기법으로 데이터를 저장하는 Map
 2. Map 인터페이스를 구현하고 있음
 
*/
public class HashMapTest01 {
	public static void main(String[] args) {
		// 키 : 학번, 값 : 이름
		// 1. 맵 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// 2. 데이터 추가 - 순서가 없다.
		map.put(123456, "이익준");
		map.put(112233, "김준완");
		map.put(223344, "채송화");
		map.put(556677, "양석형");
		map.put(987654, "안정원");
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 3-1. 중복 키의 삽입 - 중복 키를 허용 불가, 나중에 추가한 값으로 변경
		//  -> 맵에서 데이터를 변경하는 작업
		map.put(223344, "장겨울");
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 3-2. 중복 값의 삽입
		map.put(114477, "김준완");
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 4. 데이터를 삭제
		// 4-1. 키만으로 데이터를 삭제
		map.remove(556677);
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 4-2. 존재하지 않는 키로 삭제 - 에러 발생하지 않음 -> 안정적으로 사용
		map.remove(111111);
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 4-3. 키와 값을 모두 확인하여 삭제
		map.remove(987654,"안정원");
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 4-4. 키는 같고, 값이 다를 때 - 에러 발생하지 않음 -> 안정적으로 사용
		map.remove(123456,"도재학");
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 4-5. 키는 다르고, 값이 같을 때 - 에러 발생하지 않음 -> 안정적으로 사용
		map.remove(111111,"이익준");
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		System.out.println("-----------");
		
		// 5. 출력 - 키를 통해 값을 출력
		System.out.println(map.get(123456));
		System.out.println(map.get(223344));
		System.out.println(map.get(112233));
		System.out.println(map.get(114477));
		System.out.println("-------------");
		
		// 5-1. 출력1 - Iterator 사용
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext()) {
			int no = it.next(); // key
			String name = map.get(no); // name
			System.out.println(no + "(" + name + ")");
		}
		System.out.println("--------------------");
		
		// 5-2. 출력2 - entrySet, Iterator 사용
		// Entry - 키와 값을 하나로 취급하는 인터페이스
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<Integer, String> entry = it2.next();
			int no = entry.getKey();
			String name = entry.getValue();
			System.out.println(no + "(" + name + ")");
		}
		
		// 5-3. 출력3 - entrySet, 확장 for문
		Set<Entry<Integer, String>> entrySet2 = map.entrySet();
		for(Entry<Integer, String> e : entrySet2) {
			int no = e.getKey();
			String name = e.getValue();
			System.out.println(no + "(" + name + ")");
		}
		System.out.println("---------");
		
		
		
		
		
		
		
	}
}
