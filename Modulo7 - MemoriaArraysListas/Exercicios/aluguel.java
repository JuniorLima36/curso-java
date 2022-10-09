package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aluguel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		classAluguel[] vet = new classAluguel[10]; 
		System.out.print("Quantos quartos ? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("\naluguel #%d\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vet[quarto]  = new classAluguel(nome, email);
		}
		System.out.println("\nQuartos ocupados:\n");
		for(int i=0; i<10; i++) {
			if(vet[i] != null) {
				System.out.println(i + ": " + vet[i]);
			}
		}
		sc.close();
	}
}
