package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas ? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.printf("Nome: ");
			nome[i] = sc.next();
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			System.out.printf("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		int menor = 0;
		double aMedia = 0;
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				menor++;
			}
			aMedia += altura[i];
		}
		
		double media = aMedia / n;
		double porc = ((double)menor / n) * 100;
		System.out.println();
		System.out.printf("Altura Media = %.2f\n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porc);
		
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		sc.close();
	}
}
