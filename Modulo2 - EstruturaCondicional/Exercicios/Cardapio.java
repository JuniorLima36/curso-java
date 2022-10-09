package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Cardapio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o codigo do item: "); int x = sc.nextInt();
		System.out.print("Digite a quantidade: "); int qte = sc.nextInt();
		double soma = 0;
		if (x == 1) {
			System.out.print("Cachorro Quente: ");
			double dog = 4.00;
			soma = dog * qte;
			System.out.printf("%.2f", soma);
		}
		else if (x == 2) {
			System.out.print("X-Salada: ");
			double salada = 4.50;
			soma = salada * qte;
			System.out.printf("%.2f", soma);
		}
		else if (x == 3) {
			System.out.print("X-Bacon: ");
			double bacon = 5.00;
			soma = bacon * qte;
			System.out.printf("%.2f", soma);
		}
		else if (x == 4) {
			System.out.print("Torrada simples: ");
			double torrada = 2.00;
			soma = torrada * qte;
			System.out.printf("%.2f", soma);
		}
		else if (x == 5) {
			System.out.print("Refrigerante: ");
			double refri = 1.50;
			soma = refri * qte;
			System.out.printf("%.2f", soma);
		}
		else {
			System.out.println("Codigo Invalido!");
		}
	}
}
