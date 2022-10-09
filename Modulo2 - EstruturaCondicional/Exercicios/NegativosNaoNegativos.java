package Exercicios;

import java.util.Scanner;

public class NegativosNaoNegativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: "); int x = sc.nextInt();
		if (x >= 0) {
			System.out.println("Não Negativo");
		}
		else {
			System.out.println("Negativo");
		}
	}
}
