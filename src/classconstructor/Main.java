package classconstructor;

public class Main {
	int modelYear;
	String modelName;
	
	
	
	public static void main(String[]args) {
		Main mycar = new Main(1969,"Mustang");
		
		System.out.println(mycar.modelYear + " " + mycar.modelName);
		
	}
	public Main(int year, String name) {
		modelYear = year;
		modelName = name;
		
	}
}