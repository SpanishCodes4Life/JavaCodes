  package methodsjava;
  
  public class javamethods {
	  static void myMethod() {
		   System.out.println("I Just got executed!");
	  }
	  
	  public static void main(String[]args) {
		  myMethod();
		  myMethod();
		  
		  secondMethod("Liam");
		  secondMethod("Jenny");
		  secondMethod("Anja");
		  
		  thirdMethod("Joel", 20);
		  thirdMethod("Miguelina",34);
		  thirdMethod("Willy",40);
		  
		  checkAge(20);
		  checkAge(14);
	  }
	  
	  static void secondMethod(String fname) {
		  System.out.println(fname + " Refsnes");
	  }
	  
	  static void thirdMethod(String gname, int age) {
		  System.out.println(gname + " is " + age);
	  }
	  
	  static void checkAge(int age) {
		  
		  if (age < 18) {
			  System.out.println("Acess Denied- You are not old enough!");
		  } else {
			  System.out.println("Access granted - You are old enough!");
		  }
	  }
	  
  }