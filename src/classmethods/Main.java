package classmethods;

public class Main {
	
	public static void main(String[]args) {
		myMethod();
		myStaticMethod();
		
		Main myObj = new Main();
		myObj.myPublicMethod();
		
		Main mycar = new Main();
		
		mycar.fullThrottle();
		mycar.speed(50);
		
		
		
		
	}
	
	public void fullThrottle() {
		System.out.println("The car is going as fast, as it can!");
	}
	
	public void speed(int maxSpeed) {
		System.out.println("Max speed is: " + maxSpeed);
	}
	
	static void myMethod() {
		System.out.println("Hello World!");
	}
	
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects!");
		
	}
	static void myStaticMethod() {
		System.out.println("Static methods must be called whithout creating objects!");
	}
}