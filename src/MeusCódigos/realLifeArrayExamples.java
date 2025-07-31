package MeusCódigos;
public class realLifeArrayExamples {
	public static void main(String[]args) {
		
		System.out.println("Real Life Example from W3C Schools.");
		
		int[] ages = {20,22,18,35,48,28,87,70} ;
		
		float avg,sum = 0;
		
		int length = ages.length;
		
		for(int age : ages) {
			sum+=age;
		}
		
		avg = sum / length;
		
		System.out.println("The Average age is: " + avg);
		
		System.out.println("Another Example.");
		
		int lowestAge = ages [0];
		
		for (int age : ages) {
			if (lowestAge > age) {
				lowestAge = age;
			}
		}
		
		System.out.println("The Lowest Age in this array is: "+ lowestAge);
		System.out.println("Bucket Sort");
	}
}