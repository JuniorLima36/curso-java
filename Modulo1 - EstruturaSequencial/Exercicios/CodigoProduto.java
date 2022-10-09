package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CodigoProduto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Codigo do Produto: "); int codigo1 = sc.nextInt(); sc.nextLine();
		System.out.print("Quantidade: "); int qte1 = sc.nextInt(); sc.nextLine();
		System.out.print("Valor do Produto: "); double valorPeca1 = sc.nextDouble(); sc.nextLine();
		System.out.println();
		System.out.print("Codigo do Produto: "); int codigo2 = sc.nextInt(); sc.nextLine();
		System.out.print("Quantidade: "); int qte2 = sc.nextInt(); sc.nextLine();
		System.out.print("Valor do Produto: "); double valorPeca2 = sc.nextDouble(); sc.nextLine();
		
		double pagar = qte1 * valorPeca1 + qte2 * valorPeca2;
		System.out.println();
		System.out.printf("Valor a pagar: R$ %.2f", pagar);
	}
}
