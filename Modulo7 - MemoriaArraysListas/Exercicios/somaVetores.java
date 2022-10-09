package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class somaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto numeros ? ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B: ");
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		int result = 0;
		System.out.println("Vetor Resultante:");
		for(int i=0; i<n; i++) {
			result = a[i] + b[i];
			System.out.printf("%d\n", result);
		}
	}
}
