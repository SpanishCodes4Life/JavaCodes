package MeusCódigos;

import java.util.Scanner;

public class scannertypeshit {
	
	public static void main(String[]args) {
		
		Scanner myObj = new Scanner(System.in);
		String userName;
		
		System.out.println("Enter Username");
		userName = myObj.nextLine();
		
		System.out.println("Username is: " + userName); 
		
	}
	
}