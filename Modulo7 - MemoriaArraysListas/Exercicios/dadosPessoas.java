package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas ? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
		}
		
		double menor = altura[0];
		double maior = altura[0];
		for(int i=0; i<n; i++) {
			if(altura[i] < menor) {
				menor = altura[i];
			}
			if(altura[i] > maior) {
				maior = altura[i];
			}
		}
		int f = 0;
		int h = 0;
		double media = 0;
		for(int i=0; i<n; i++) {
			if(genero[i] == 'm') {
				h++;
			} 
			else {
				f++;
				media += altura[i];
			}
		}
		double result = media / f;
		System.out.printf("Menor altura = %.2f\n",menor);
		System.out.printf("maior altura = %.2f\n",maior);
		System.out.printf("Media das altura mulher = %.2f\n",result);
		System.out.printf("Numero de homens = %d\n",h);
		sc.close();
	}

}
