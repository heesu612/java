
public class Sort02 {
	public static void main(String[] args) {
//		int[] a = {30, 70, 20, 10, 50};
		int[] a = {30, 70, 20, 10, 50, 99, 88, 66, 55, 33, 77, 22};
		
		for(int i=0; i<a.length-1; i++) {
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					
				}
			}
		}
		
		
		// 출력
		for(int i=0; i<a.length; i++) {			
			System.out.printf("%3d",  a[i]);
		}
		System.out.println();
	}

}
