package Exercicios;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o inicio do jogo: "); int inicio = sc.nextInt();
		System.out.print("Digite o fim do jogo: "); int fim = sc.nextInt();
		
		int durou;
		if (inicio < fim) {
			durou = fim - inicio;
		}
		else {
			durou = 24 - inicio + fim;
		}
		System.out.printf("O Jogo durou " + durou + " horas");
	}
}
