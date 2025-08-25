package codescocoshampoo;

public class exampleperson {
	
	String personname;
	String jobperson;
	int ageperson;
	int yearbirthp;
	
	public static void main(String[]args) {
		exampleperson Reginaldo = new exampleperson(29,1996,"Reginaldo Luiz da Silva Telles","Carpinteiro");
		exampleperson Gabriel = new exampleperson(18,2007,"Gabriel Eduardo da Silva Pinto","Programador");
		
		placa pareplaca = new placa("Interditação");
		car bibicarro = new car("BYD",2010,200);
		
		if (bibicarro.speedCar >= 200) {
			pareplaca.Parar();
		}
		
		/*
		System.out.println("Nome: "+ Reginaldo.personname);
		System.out.println("Idade: "+ Reginaldo.ageperson);
		System.out.println("Profissão: "+ Reginaldo.jobperson);
		System.out.println("Ano de Nascimento: "+ Reginaldo.yearbirthp);
		*/
		
		//placa pareplaca = new placa("Interditação");
		
		//pareplaca.Parar();
		
		/*
		if (Gabriel.personname == "Reginaldo Luiz da Silva Telles") {
			System.out.println("Parabéns!!! Seu Nome é Reginaldo");
		} else if(Gabriel.personname == "Gabriel Eduardo da Silva Pinto" && Gabriel.jobperson == "Programador") {
			System.out.println("Seu Nome é Gabriel!!! e você é Programador uau!!!");
		} else {
			System.out.println("Seu Nome não está na Base de Dados :( ");
		}
		*/
		
		/*
		if (Gabriel.ageperson <= 20) {
			pareplaca.Parar();
			
			if (Reginaldo.ageperson <= 20 ) {
				pareplaca.Parar();
			} else {
				System.out.println("Pode Atravessar Adulto !!!");
			}
		}
		*/
		
	}
	
	public exampleperson(int idade, int nascimento, String nome, String trabaio) {
		personname = nome  ;
		jobperson = trabaio;
		ageperson = idade ;
		yearbirthp = nascimento;
	}
}