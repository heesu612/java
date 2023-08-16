import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest05 {
	public static void main(String[] args) {
		// 키 : 과일이름, 값 : 과일가격
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		// 데이터 추가
		map.put("grape", 3000);
		map.put("pineapple", 10000);
		map.put("cherry", 5000);
		map.put("apple", 3500);
		map.put("blueberry", 4500);
		map.put("melon", 8000);
		map.put("mango", 9000);
		map.put("watermelon", 15000);
		map.put("strawberry", 12000);
		map.put("banana", 7000);
		System.out.println(map);
		
		// b에서 g 앞까지 부분 맵 - g는 미포함
		
		SortedMap<String, Integer> map2 = map.subMap("b", "g");
		System.out.println(map2);
		
		// b에서 g까지 부분 맵 - g 포함
		SortedMap<String, Integer> map3 = map.subMap("b", true, "g", true);
		System.out.println(map3);
	}
}
