import java.util.StringTokenizer;

//StringTokenizer 클래스 : 문자열을 구분자로 분리하여 문자열의 토큰으로 나눠 처리하는 클래스
public class StringTokenizerTest01 {
	public static void main(String[] args) {
		String animals = "lion,cheetah,leopard,hyena,elephant,hippo,giraffe";
		
		// 1. split() : 문자열을 구분자로 잘라서 문자열의 배열로 저장하는 메소드
		String[] a =  animals.split(",");
		
		for(int i=0; i<a.length;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("-------");
		
		// 2. StringTokenizer 클래스를 사용
		StringTokenizer st = new StringTokenizer(animals);
		System.out.println("토큰의 수 : " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("----------");
		
		String animals2 = "lion,cheetah,leopard,hyena,elephant,hippo,giraffe";
		
		
		// 2. StringTokenizer클래스를 사용
		StringTokenizer st2 = new StringTokenizer(animals2, ",./");
		System.out.println("토큰의 수 : " + st2.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println("-------");
		
		// 문제 1) animals2 문자열의 동물을 구분하여 배열로 저장하고, 출력, 동물의 수 도
		System.out.println("******");
		/*
		String[] a2 = animals2.split(",");
		int sum = 0;
		for(int i=0; i<a2.length;i++) {
			System.out.println("a2[" + i + "] = " + a2[i]);
			++sum;
		}
		System.out.printf("동물의 수 : %d", sum);
		System.out.println("\n-------");
		*/
		animals2 = animals2.replace(".", ",");
		animals2 = animals2.replace("/", ",");
		String[] a2 = animals.split(",");
		System.out.println(animals2);
		
		for(String s : a2) {
			System.out.println(s2);
		}
		
	}
}
