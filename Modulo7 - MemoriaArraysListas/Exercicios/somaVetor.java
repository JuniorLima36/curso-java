package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros ? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		double soma = 0;
		for (int i=0; i<vet.length; i++) {
			soma += vet[i];
		}
		
		System.out.println();
		double media = soma / n;
		System.out.print("Valores = ");
		for (int i=0; i<vet.length; i++) {
			System.out.printf("%.1f ",vet[i]);
		}
		System.out.printf("\nSoma = %.2f\n", soma);
		System.out.printf("Media = %.2f%n", media);
		
		sc.close();
	}

}
