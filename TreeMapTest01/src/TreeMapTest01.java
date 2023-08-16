import java.util.TreeMap;

// TreeMap : Tree 구조로 저장하는 Map
// - 키를 기준으로 오름차순 정렬
public class TreeMapTest01 {
	public static void main(String[] args) {
		// 키 : 사번(Integer), 값 : 사원이름(String)
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		// 데이터 추가 - 순서가 없다, 오름차순으로 정렬
		map.put(555555, "안정원");
		map.put(333333, "채송화");
		map.put(111111, "이익준");
		map.put(444444, "양석형");
		map.put(222222, "김준완");
		System.out.println(map);
		System.out.println("크기  : " + map.size());
		
		// 중복 키 확인 - 허용 불가, 나중에 넣은 값으로 덮어쓰기를 함. - 값을 변경
		map.put(444444, "장겨울");
		System.out.println(map);
		System.out.println("크기  : " + map.size());
		
		// 중복 값 확인 - 허용함. 
		map.put(666666, "채송화");
		System.out.println(map);
		System.out.println("크기  : " + map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
