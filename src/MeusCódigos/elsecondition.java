package MeusCódigos;

public class elsecondition {
	
	public static void main(String[]args) {
		
		System.out.println("Else Conditions and More+");
		
		int time = 20;
		
		if (time<18) {
			System.out.println("Good Day!");
		} else {
			System.out.println("Good Evening!");
		}
		
		System.out.println();
		
		System.out.println("Else If Condition.");
		
		int ageCoder = 19;
		
		if (ageCoder > 20){
			System.out.println("The Programmer has 20 years.");
		} else if (ageCoder >30) {
			System.out.println("The Programmer has more than 30 years");
		} else {
			System.out.println("The Programmer is younger.");
		}
		
		System.out.println();
		
		System.out.println("Short Hand-If-Else");
		int time2 = 30;
		String result = (time2<18) ? "Good day." : "Good Evening";
		System.out.println(result);
		
		System.out.println();
		System.out.println("Real Life Example.");
		
		int mommaAge = 40;
		int papaAge = 41;
		if (papaAge > 40 && mommaAge>=40) {
			System.out.println("My Parents has more than 40 years.");
		} else if (mommaAge <40 && papaAge <40) {
			System.out.println("My Parents has less than 40 years.");
		}
	}

}