package Exercicios;

import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma das opções: (1.Alcool 2.Gasolina 3.Diesel 4.Sair)");
		int alcool = 0; 
		int gasolina = 0; 
		int diesel = 0;
		System.out.print("Codigo: "); 
		int x = sc.nextInt();
		while (x != 4) {
			System.out.print("Codigo: "); 
			x = sc.nextInt();
			if (x == 1) {
				alcool += 1; 
			}
			else if (x == 2) {
				gasolina += 1;
			}
			else if (x == 3) {
				diesel += 1;
			}
			else {
			}
		}
		System.out.println();
		System.out.println("Muito Obrigado");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
	}
}
