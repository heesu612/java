import java.util.Vector;

public class VectorTest04 {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		Vector<Integer> v3 = new Vector<>();
		
		v1.add(10); v1.add(20); v1.add(30);
		v1.add(40); v1.add(50); v1.add(60);
		v1.add(30); v1.add(40); v1.add(50);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		System.out.println("——");
		
		System.out.println("—— 벡터에 따른 벡터의 모든 값을 추가 ——");
		//v1.addAll(v2); // 순차적 추가
		v1.addAll(1, v2); // 중간에서 추가, 비순차적 추가
		System.out.println("v1 : " + v1);
		
		System.out.println("- 벡터에서 값의 존재 유무 -");
		System.out.println(v1.indexOf(50)); // 2 -> 존재하는 값
		System.out.println(v1.indexOf(90)); // -1 -> 존재하지 않는 값
		
		System.out.println(v1.contains(50)); // true
		System.out.println(v1.contains(90)); // false
		
		System.out.println("- 벡터에서 다른 벡터의 모든 데이터의 존재 유무 -");
		System.out.println(v1.containsAll(v2)); // true
		System.out.println(v1.containsAll(v3)); // false
		
		System.out.println("- 벡터를 복제 -");
		Object v4 = v1.clone();
	}

}