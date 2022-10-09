package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros ? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		double soma = vet[0];
		int maior = 0;
		for(int i=0; i<n; i++) {
			if(vet[i] > soma) {
				soma = vet[i];
				maior = i;
			}
		}
		System.out.println();
		System.out.printf("Maior valor = %.1f\n", soma);
		System.out.printf("Posição do maior = %d", maior);
		sc.close();
	}
}
