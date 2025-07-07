package MeusCódigos;

public class RealLifeexample {

	public static void main(String[] args) {
		
		// Create variables of different data types
		int items = 30;
		float costPerItem = 9.99f;
		float totalCost = items * costPerItem;
		char currency ='$';
		
		//Print Variables
		
		System.out.println("Every Item cost "+costPerItem+currency+" For Us.");
		System.out.println("We have a total of "+items+" Items.");
		System.out.println("The Total of cost is "+ totalCost + currency);
	}
}