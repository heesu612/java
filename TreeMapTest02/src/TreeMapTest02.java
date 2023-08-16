import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
문제2) 아래의 조건에 부합하는 TreeMap인 map을 생성하고, 활용
1. 키는 학생이름, 값은 점수를 저장하는 map을 생성
2. 맵에 학생 데이터 5개를 추가
3. map에 대해 중복 키와 값에 대한 검증
4. map의 데이터를 3가지 방법으로 출력

 */

public class TreeMapTest02 {
	public static void main(String[] args) {
		// 1. map 생성
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		// 2. 맵에 데이터 추가
		map.put("이익준", 95);
		map.put("김준완", 88);
		map.put("채송화", 85);
		map.put("양석형", 77);
		map.put("안정원", 68);
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 3. 중복 키 검증 - 허용 불가, 나중에 넣은 값으로 덮어쓰기를 함.
		map.put("이익준", 25);
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 4. 중복 값 검증 - 허용.
		map.put("장겨울", 95);
		System.out.println(map);
		System.out.println("크기 : " + map.size());
		
		// 5. 데이터 출력
		// 5-1. 출력1 keySet, Iterator
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			int score = map.get(s);
			System.out.println("학생정보 : " + s + ", 점수 : " + score);
			
		}
		System.out.println("------------");
		
		// 5-2. 출력2 entrySet, Iterator
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> e = it2.next();
			String s = e.getKey();
			int score = e.getValue();
			System.out.println("학생정보 : " + s + ", 점수 : " + score);
		}
		System.out.println("----------");
		
		// 5-3. 출력3 entrySet, 확장 for문
		Set<Entry<String, Integer>> entrySet2 = map.entrySet();
		for(Entry<String, Integer> e : entrySet2) {
			String s =e.getKey();
			int score = e.getValue();
			System.out.println("학생정보 : " + s + ", 점수 : " + score);
		}
		System.out.println("-------------");
	}
}
