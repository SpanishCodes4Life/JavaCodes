package MeusCódigos;

public class nestedLoop {
	
	public static void main(String[]args) {
		
		for (int i = 1;i <=2; i++) {
			System.out.println("Outer: "+ i);
			
			for (int j = 1; j<= 3;j++) {
				System.out.println(" Inner: "+ j);
			}
		}
		
		for (int x = 1; x<= 3;x++) {
			for (int g = 1; g <= 3; g++) {
				System.out.print(x * g + " ");
			}
			System.out.println(); 
		}
		
		for (int i = 1; i <= 2; i++) {
			  for (int j = 1; j <= 3; j++) {
			    System.out.print(i + "," + j + " ");
			  }
			}
		
	}
	
}