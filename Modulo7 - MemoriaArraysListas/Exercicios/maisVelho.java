package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class maisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas ? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa\n", i+1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		int soma = 0;
		String pessoa = null;
		for(int i=0; i<n; i++) {
			if(idade[i] > soma) {
				soma = idade[i];
				pessoa = nome[i];
			}
		}
		System.out.printf("Pessoas mais velha: "+ pessoa);
		sc.close();
	}
}
