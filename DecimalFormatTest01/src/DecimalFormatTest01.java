import java.text.DecimalFormat;

// DecimalFormat : 숫자를 다양한 형식으로 만들어주는 클래스
public class DecimalFormatTest01 {
	public static void main(String[] args) {
		double n = 1234567.89;
		
		// DecimalFormat 클래스의 숫자 출력 형식 지정
		// #
		// 0
		DecimalFormat df1 = new DecimalFormat("#,###.####");
		DecimalFormat df2 = new DecimalFormat("0,000.0000");
		DecimalFormat df3 = new DecimalFormat("#,###,###,###");
		DecimalFormat df4 = new DecimalFormat("0,000,000,000");
		DecimalFormat df5 = new DecimalFormat("#,###.##"); // 자주 사용하는 방법
		DecimalFormat df6 = new DecimalFormat("#.#E0"); // 지수승
		DecimalFormat df7 = new DecimalFormat("0.0E0");
		DecimalFormat df8 = new DecimalFormat("#E0");
		DecimalFormat df9 = new DecimalFormat("0E0");
		
		// 출력
		System.out.println(df1.format(n)); // 1,234,567.89
		System.out.println(df2.format(n)); // 1,234,567.8900
		System.out.println(df3.format(n)); // 1,234,568
		System.out.println(df4.format(n)); // 0,001,234,568
		System.out.println(df5.format(n)); // 1,234,567.89
		System.out.println(df6.format(n)); // 1.2E6
		System.out.println(df7.format(n)); // 1.2E6
		System.out.println(df8.format(n)); // .1E7
		System.out.println(df9.format(n)); // 1E6
	}
}
