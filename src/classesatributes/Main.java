package classesatributes;

public class Main {
	int x = 5;
	int y = 3;
	int age = 25;
	
	String fname = "John";
	String lname = "Doe";
	
	public static void main(String[]args) {
		
		Main myObj = new Main();
		Main myObj2 = new Main();
		
		
		myObj2.y = 25;
		
		System.out.println(myObj2.y);
		
		System.out.println(myObj.x);
		myObj.x = 40;
		
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		
		System.out.println("Name: " + myObj.fname + " " + myObj.lname);
		System.out.println("Age: " + myObj.age);  
		
	}
}