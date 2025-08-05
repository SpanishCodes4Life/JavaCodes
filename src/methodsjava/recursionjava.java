package methodsjava;

public class recursionjava {
	public static void main(String[]args) {
		int result = sum(10);
		System.out.println(result);
		
		System.out.println();
		
		System.out.println(sum2(9,12));
	}
	
	public static int sum(int k) {
		if (k > 0) {
			return k + sum (k - 1);
		} else {
			return 0;
		}
	}
	
	public static int sum2(int start, int end) {
		if (end > start) {
			return end + sum2(start,end - 1);
		} else {
			return end;
		}
	}
	
	
	
}