package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos ? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] pri = new double[n];
		double[] sec = new double[n];

		for(int i=0; i<n; i++) {
			System.out.printf("Digite nome e as notas do %d° aluno\n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			pri[i] = sc.nextDouble();
			sec[i] = sc.nextDouble();
		}
		
		double media = 0;
		System.out.println("Alunos Aprovados:");
		for(int i=0; i<n; i++) {
			media = (pri[i] + sec[i]) / 2;
			if(media >= 6.0) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		sc.close();
	}
}
