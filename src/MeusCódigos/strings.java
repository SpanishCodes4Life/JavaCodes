package MeusCódigos;

public class strings {
	
	public static void main(String[] args) {
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String txt2 = "Hello World";
		
		
		System.out.println("Strings.");
		System.out.println("The length of the text string is: " + txt.length());
		System.out.println();
		System.out.println(txt2 + " Is my Text Base.");
		System.out.println(txt2.toUpperCase() + " Is in Upper Case.");
		System.out.println(txt2.toLowerCase() + " Is in Lower Case.");
		
		System.out.println("Finding a Character in a String.");
		
		String txt3 = "Please locate where 'locate' occurs!";
		String txt4 = "Eu como muita Maça mesmo!!!";
		String txt5 = "I love all of my precious cats<3.";
		
		System.out.println();
		
		System.out.println(txt5.indexOf("<3") + " Is the index of '<3'.");
		System.out.println(txt4.indexOf("Maça") + " Is the index of 'Maça'.");
		System.out.println(txt3.indexOf("locate"));
	}
}