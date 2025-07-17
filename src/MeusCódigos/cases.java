package MeusCódigos;

public class cases {
	public static void main(String[]args) {
		
		System.out.println("Cases of Java.");
		
		int day = 8;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No data found.");
			break;
		}
		
		int myAge = 15;
		switch (myAge) {
		case 16:
			System.out.println("Your age is 16.");
			break;
		case 17:
			System.out.println("Your Age is 17.");
			break; 
		default:
			System.out.println("You are a minor");
			break;
		}
		
	}
}