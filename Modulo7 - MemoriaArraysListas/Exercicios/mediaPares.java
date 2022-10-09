package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class mediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Quantos elementos ? ");
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int impar = 0;
		int soma = 0;
		for(int i=0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				soma += vet[i];
				impar++;
			}
		}
		if (impar == 0) {
			System.out.printf("Nenhum numero par");
		} else {
			double media = soma / impar;
			System.out.printf("Media dos pares = %.1f", media);
		}
		sc.close();
	}
}
