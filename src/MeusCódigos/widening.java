package MeusCódigos;

public class widening {
	 
	public static void main(String[] args) {
		
		int number1 = 9;
		double number2 = number1;
		
		
		System.out.println("Widening Casting.");
		System.out.print(number1);
		System.out.println(" Is number1");
		System.out.println(number2+" Is number1 in double setting.");
		
		System.out.println("Narrowing-Casting");
		
		double number3 = (double) number1;
		
		System.out.println(number3+" Is number1 using Narrowing-Casting.");
		System.out.println("Real Life Example.");
		
		int maxScore = 500;
		
		int UserScore = 423;
		
		float percentage = (float) UserScore/ maxScore *100.0f;
		
		System.out.println("User's percentage is "+ percentage);
	}
}