package teste;

import java.util.Locale;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int idade = 20;
		double salario = 5800.5; 
		double altura = 1.63;
		char genero = 'F';
		String nome = "Maria Silva";
		
		System.out.println("Idade = " + idade);
		System.out.println("Salario = " + String.format("%.2f", salario));
		System.out.println("Altura = " + String.format("%.2f", altura));
		System.out.println("Genero = " + genero);
		System.out.println("Nome = " + nome);
	}
}
