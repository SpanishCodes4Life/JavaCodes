package thiskeyword;

public class Main {
	
	int modelYear;
	String modelName;
	
	public Main(String modelName) {
		
		this(2020, modelName);
	}
	
	public Main(int modelYear, String modelName) {
		
		this.modelYear = modelYear;
		this.modelName = modelName;
	}
	
	public void printInfo() {
		System.out.println(modelYear + " " + modelName);
		
	}
	
	public static void main(String[]args) {
		Main car1 = new Main("Corvette");
		
		Main car2 = new Main(1969, "Mustang");
		
		car1.printInfo();
		car2.printInfo();
	}
	
	//When to use this?
	//When a constructor or method has a parameter with the same name as a class variable, use this to update the class variable correctly.
	//To call another constructor in the same class and reuse code.

}
