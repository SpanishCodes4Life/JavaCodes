package methodsjava;

public class javamethodsreturn {
	
	public static void main(String[]args) {
		System.out.println(myMethod(3));
		System.out.println(SecondMethod(5,10));
		
		int valuez = SecondMethod(20,10);
		
		System.out.println("valuez is "+ valuez);
	}
	
	static int myMethod(int x) {
		return 5 + x;
	}
	
	static int SecondMethod(int x, int y) {
		return x + y;
	}
	
	
	
}