import java.util.Vector;

/*
 * 문제 1)
 1. 문자열을 저장하는 벡터 v를 생성
 2. 벡터 v에 배열 names의 값을 추가하고, 확인
 3. 이승엽 다음에 손흥민을 추가하고 확인
 4. 박찬호를 삭제하고 확인
 5. 김연경을  양효진으로 변경하고 확인
 6. 벡터 v의 내용을 출력(기본 for문, 확장 for문
 */
public class VectorTest07 {
	public static void main(String[] args) {
		String[] names = {"김연아", "박찬호", "이승엽", "김연경", "김성근"};
		
		// 1. 벡터 생성
		Vector<String> v = new Vector<String>();
		
		// 2. 벡터에 배열 데이터 추가
		for(int i = 0; i < names.length;i++) {
			v.add(names[i]);
		}
		System.out.println(v);
		// 3. 중간에 추가 - 비순차적 데이터 추가
		v.add(3, "손흥민");
		System.out.println(v);
		
		// 4. 삭제
		v.remove("박찬호");
		System.out.println(v);
		// 5. 변경
		v.set(3,  "양효진");
		System.out.println(v);
		// 6-1. 출력1 - 기본 for문
		for(int i =0;i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		// 6-2. 출력2 - 확장 for문
	}
}
