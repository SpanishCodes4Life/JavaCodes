package MeusCódigos;

public class breakloop {
	
	public static void main(String[]args) {
		
		for( int i = 0; i <10; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Another Loop.");
		
		for (int i = 0; i <10; i++) {
			if (i == 4) {
				break;
			} else if (i > 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("New Loop!!!");
		
		int i = 0;
		while (i < 10 ) {
			if ( i == 4) {
				i++;
				continue;
			} i++;
			if ( i > 5) {
				System.out.println(i);
				System.out.println("i is bigger than 6");
				break;
			}
		}
	}
}