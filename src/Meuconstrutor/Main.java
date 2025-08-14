package Meuconstrutor;

public class Main {
	
	String nomealuno;
	int idadealuno;
	String cursoaluno;
	
	public void Informação() {
		System.out.println("Nome do Aluno: " + nomealuno + "\nIdade do Aluno: " + idadealuno + "\nCurso do Formando: " + cursoaluno);
		
	}
	
	public static void main(String[]args) {
		Main meuobjeto = new Main(20,"João","Ciência da Computação");
		meuobjeto.Informação();
		
	}
	
	public Main(int idade, String nome, String curso) {
		idadealuno = idade;
		nomealuno = nome;
		cursoaluno = curso;
		
	}
}