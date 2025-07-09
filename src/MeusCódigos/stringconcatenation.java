package MeusCódigos;

public class stringconcatenation {
	
	public static void main(String[] args) {
		
		String concatenation = "String Concatenation.";
		String name = "Joel";
		String lastname = "Tambo";
		
		System.out.println(concatenation);
		System.out.println();
		System.out.println(name.concat(lastname));
		System.out.println();
		System.out.println("Java Numbers and Strings.");
		
		int x = 10;
		int y = 20;
		int z = x + y;
		
		System.out.println(z);
		
		String x1 = "10";
		String y1 = "20";
		String z1 = x1 + y1;
		
		System.out.println(z1);
		
		String x2 = "10";
		int y2 = 20;
		String z2 = x2 + y2;
		
		System.out.println(z2);
		
		System.out.println("Java Special Characters.");
		
		String txt = "We are the \n\"people\" from the North.";
		String txt2 = "Soy Boliviano y \r\'blanco\' \nde La Paz. ";
		String txt3 = "Soy Moreno de los \tojos azules.";
		System.out.println(txt3);
		System.out.println(txt2);
		System.out.println(txt);
		
	}
}