import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// 데이터 추가
		set.add(88);set.add(98);set.add(75);set.add(95);set.add(80);
		System.out.println(set);
		
		System.out.println("가장 작은 정수 : " + set.first()); // 가장 작은게 젤 왼쪽에 있기때문에 first를 사용
		System.out.println("가장 큰 정수 : " + set.last()); // 가장 큰게 젤 오른쪽에 있기 떄문에 last를 사용
		
		System.out.println("95점 바로 아래 점수 : " + set.lower(95));
		System.out.println("95점 바로 위 점수 : " + set.higher(95)); 
		
		System.out.println("95점이거나 바로 아래 점수: " + set.floor(90));
		System.out.println("95점이거나 바로 위 점수: " + set.ceiling(90));

		
		// 출력 1 - 확장 for문
		for(int i : set) {
			System.out.println(i);
		}
		System.out.println("---------");
		
		// 출력 2 - Iterator 사용
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------");
		
		// 출력 3 - isEmpty() 사용
		// pollFirst() : 데이터를 앞에서 꺼내고, 데이터를 삭제 -> 오름차순 출력
		// pollLast() : 데이터를 뒤에서 꺼내고, 데이터를 삭제 -> 내림차순 출력
		while(!set.isEmpty()) {
			//System.out.println(set.pollFirst()); // 오름차순
			System.out.println(set.pollLast()); // 내림차순
		}
		System.out.println("--------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
