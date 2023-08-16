import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
	public static void main(String[] args) {
		// 키 : 점수, 값 : 학생이름
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		
		// 데이터 추가 - 키를 기준으로 오름차순 정렬
		map.put(87, "이익준");
		map.put(98, "김준완");
		map.put(75, "채송화");
		map.put(95, "양석형");
		map.put(80, "안정원");
		System.out.println(map);
		
		// 내림차순
		NavigableMap<Integer, String> map2 = map.descendingMap();
		System.out.println("내림차순 정렬 : " + map2);
		
		// 95점보다 작은 값을 가진 맵 - 95점 미포함
		SortedMap<Integer, String> map3 = map.headMap(95);
		System.out.println("95점보다 작은 값(미포함) : " + map3);
		
		// 95점보다 작은 값을 가진 맵 - 95점 포함
		SortedMap<Integer, String> map4 = map.headMap(95,true); // 기본값 : false
		System.out.println("95점보다 작은 값(포함) : " + map4);
		
		// 95점보다 큰 값을 가진 맵 - 95점 포함
		SortedMap<Integer, String> map5 = map.tailMap(95);
		System.out.println("95점보다 큰 값(포함) : " + map5);
		
		// 95점보다 큰 값을 가진 맵 - 95점 미포함
		SortedMap<Integer, String> map6 = map.tailMap(95,false); // 기본값 :true
		System.out.println("95점보다 큰 값(미포함) : " + map6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
