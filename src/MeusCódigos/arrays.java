package MeusCódigos;

public class arrays {
	public static void main(String[]args) {
		
		String[] cars = {"Volvo","BMW","Ford","Manza"};
		int[] numbers = {21,32,45};
		
		System.out.println(cars[0]);
		
		cars[0] = "Opel";
		
		System.out.println(cars[0]);
		System.out.print("The cars array has : ");
		System.out.print(cars.length+" Elements.");
		
		System.out.println();
		
		for (int i = 0; i < cars.length;i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println();
		System.out.println("For Each Loop in Array");
		System.out.println();
		
		for(String p : cars) {
			System.out.println(p);
		}
		
	}
}