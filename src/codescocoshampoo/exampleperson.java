package codescocoshampoo;

public class exampleperson {
	
	String personname;
	String jobperson;
	int ageperson;
	int yearbirthp;
	
	public static void main(String[]args) {
		exampleperson Reginaldo = new exampleperson(29,1996,"Reginaldo Luiz da Silva Telles","Carpinteiro");
		
		System.out.println("Nome: "+ Reginaldo.personname);
		System.out.println("Idade: "+ Reginaldo.ageperson);
		System.out.println("Profissão: "+ Reginaldo.jobperson);
		System.out.println("Ano de Nascimento: "+ Reginaldo.yearbirthp);
		
		placa pareplaca = new placa("Interditação");
		
		pareplaca.Parar();
		
	}
	
	public exampleperson(int idade, int nascimento, String nome, String trabaio) {
		personname = nome  ;
		jobperson = trabaio;
		ageperson = idade ;
		yearbirthp = nascimento;
	}
}