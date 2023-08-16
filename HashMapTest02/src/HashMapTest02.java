import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTest02 {
	public static void main(String[] args) {
		// 한영사전, 키 : 한글단어, 값: 영어단어
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// 데이터 삽입
		map.put("사과", "apple");
		map.put("호랑이", "tiger");
		map.put("학생", "student");
		map.put("학교", "school");
		map.put("비행기", "airplane");
		map.put("코끼리", "elephant");
		map.put("고양이","cat");
		map.put("수박", "watermelon");
		map.put("고래", "whale");
		map.put("고귀함", "dignity");
		System.out.println(map);
		
		// 1. 키보드에서 한글단어를 입력하여 해당하는 영어단어를 출력하도록 하시오
		// 해당하는 영어단어가 없을 때는 단어가 존재하지 않는다는 출력 메세지를 출력하도록 하시오.
		/*
		System.out.println("- 한글단어를 입력하면 영어단어를 출력합니다. ");
		System.out.print("한글 단어를 입력하시오 : ");
		String kor = sc.next();
		String eng = map.get(kor); // 단어를 찾지 못하면 null을 리턴함.
		
		if(eng == null) { // 키가 없을 때
			System.out.println(kor + "에 해당하는 영어단어가 없습니다.");
		} else { // 키가 있을 때
			System.out.println(kor + " : " + eng);
		}
		*/
		/*
		System.out.println(map.remove("학교"));
		System.out.println(map);
		System.out.println(map.remove("선생님"));
		System.out.println(map);
		*/
		
		// 2. 키보드에서 한글단어를 입력하여 해당하는 단어를 삭제하도록 하시오.
		// 해당하는 한글단어가 없을 때는 단어가 존재하지않느다는 메시지를 출력
		/*
		System.out.println("삭제할 한글단어 입력 : ");
		String kor = sc.next();
		if(map.remove(kor) == null) {
			System.out.println(kor + "에 해당하는 단어는 없습니다.");
		} else {
			System.out.println(kor + " 단어를 삭제하였습니다.");
		}
		System.out.println(map);
		*/
		
		// 3-1. 출력1 - keySet, Iterator
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String kor = it.next(); // key
			String eng = map.get(kor); // name
			System.out.println(kor + " : " + eng);
		}
		System.out.println("--------------------");
		
		// 3-2. 출력2 - entrySet, Iterator
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + " : " + eng);
		}
		System.out.println("---------------");
		
		// 3-3. 출력3 - entrySet, 확장 for문
		Set<Entry<String, String>> entrySet2 = map.entrySet();
		for(Entry<String, String> e : entrySet2) {
			String kor = e.getKey();
			String eng = e.getValue();
			System.out.println(kor + " : " + eng);
		}
		System.out.println("---------");
		
		
		sc.close();
	}
}
