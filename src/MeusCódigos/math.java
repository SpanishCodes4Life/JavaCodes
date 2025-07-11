package MeusCódigos;

public class math {
	
	public static void main(String[] args) {
		
		int randomNum1 = (int)(Math.random() *101);
		int randomNum2 = (int)(Math.random() *101);
		
		System.out.println("Math Method.");
		System.out.println(Math.max(5,10));
		System.out.println(Math.min(0,20));
		
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-8.60));
		
		System.out.println(Math.random());
		
		System.out.println(randomNum1);
		System.out.println(randomNum2);
		
	}
}