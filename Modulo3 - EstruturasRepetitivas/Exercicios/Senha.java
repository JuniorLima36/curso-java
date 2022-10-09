package Exercicios;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a Senha: "); 
		int senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("Senha Invalida!");
			System.out.println();
			System.out.print("Digite a Senha: "); 
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
	}
}
