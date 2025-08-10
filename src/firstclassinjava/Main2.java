package firstclassinjava;

public class Main2 {
	
	int x = 5;
	String meuAmordeMãe = "Miguelina Tambo Garcia";
	
	public static void main(String[]args) {
		
		Main2 myObj = new Main2(); //Object 1
		Main2 myObj2 = new Main2(); //Object 2
		
		System.out.println(myObj.x);
		System.out.println(myObj2.x);
		
		Main2 mom = new Main2();
		
		System.out.println(mom.meuAmordeMãe);
		
	}
	
}