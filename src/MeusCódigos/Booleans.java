package MeusCódigos;

public class Booleans {
	
	public static void main(String[] args) {
		
		Boolean isJavaFun = true;
		Boolean iAmSmart = false;
		
		System.out.println(isJavaFun);
		System.out.println(iAmSmart);
		
		int x = 10;
		int y = 9;
		
		System.out.println();
		System.out.println("Is x bigger than y? \nTrue or False:");
		System.out.println( x > y );
		System.out.println();
		System.out.println("Is x equal to 10?");
		System.out.println( x == 10);
		
		int myAge = 25;
		int votingAge = 18;
		/*System.out.println(myAge >= votingAge);*/
		
		System.out.println();
		
		if (myAge >= votingAge) {
			System.out.println("Old Enough to Vote!");
		} else {
			System.out.println("Not Enough to Vote!");
		}
		
		
	}
	
}