package Exercicios;

import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: "); int x = sc.nextInt(); sc.nextLine();
		System.out.print("Digite outro numero: "); int y = sc.nextInt(); sc.nextLine();
		
		int soma = x + y;
		System.out.printf("Soma = %d", soma);
	}
}
