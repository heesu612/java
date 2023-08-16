import java.util.StringTokenizer;

public class StringTokenizerTest02 {
	public static void main(String[] args) {
		String birds = "송골매/황조롱이/대머리독수리/산까치,까마귀,부엉이,올빼미,참수리";
		// StringTokenizer st = new StringTokenizer(birds,"/,");
		StringTokenizer st = new StringTokenizer(birds,"/,", false); // 문자열, 구분자, 구분자의 토큰 포함 여부(기본값 : false)
		System.out.println("토큰의 수 : " + st.countTokens());
		
		while(st.hasMoreTokens()) { // st.hasMoreElements()
			String s = st.nextToken();
			System.out.println(s);
		}
		
		System.out.println("출력 후 토큰의 수 : " + st.countTokens());
		
	}
}
