package meu_codigo;

public class tercercodigo {

	public static void main(String[] args) {
		byte MeuByte = 100;
		short NumeroShort = 2000;
		int NumeroInt = 2043;
		long NumeroLargo = 2039495903;
		
		float NumeroFlutuante = 203.52223333444f;
		double NumeroFracional = 2.4534344d;
		
		float f1 = 35e3f;
		double d1 = 12E4d;
		
		
		System.out.println("Testando tipos de Data Númericos.");
		System.out.println(MeuByte + " Tipo Byte");
		System.out.println(NumeroShort + " Tipo Short");
		System.out.println(NumeroInt + " Número Inteiro.");
		System.out.println(NumeroLargo + " Número do Tipo Largo.");
		System.out.println(NumeroFlutuante + " Número do Tipo Float.");
		System.out.println(NumeroFracional + " Número do Tipo Double.");
		
		System.out.println(f1);
		System.out.println(d1);
		
		System.out.println();
		
		System.out.println("Boolean Types Data.");
		
		boolean JoelIsGoat = true;
		boolean JoelIsAlreadyRich = false;
		
		System.out.println("Joel é o GOAT? " + JoelIsGoat);
		System.out.println("Joel já é Rico. " + JoelIsAlreadyRich);
		
		System.out.println();
		
		System.out.println("Characters Data Type.");
		
		char UnicoCharacter = 'c';
		char primeiroAscii = 65, segundoAscii = 66, terceiroAscii = 67;
		
		System.out.println(UnicoCharacter);
		System.out.println(primeiroAscii);
		System.out.println(segundoAscii);
		System.out.println(terceiroAscii);
		
		System.out.println();
		
		System.out.println("Tipo String.");
		
		String MeuNome = "Joel Quispe.";
		
		System.out.println("Meu Nome é: "+MeuNome);
		
	}
}