package animalezoo;
public class animal {
	
	String animalname;
	int ageanimal;
	
	public void animalInfo() {
		System.out.println("My Age is: "+ ageanimal);
		System.out.println("My Name is "+ animalname);
	}
	
	public animal(String nomeanimal, int idadeanimal) {
		animalname = nomeanimal;
		ageanimal = idadeanimal;
	}
	
	public static void main(String[]args) {
				System.out.println("I am a Zebra");
				animal myZebra = new animal("Ignacio",5);
				myZebra.animalInfo();
				
			}
		}
	
	
