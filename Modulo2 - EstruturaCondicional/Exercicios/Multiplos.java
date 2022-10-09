package Exercicios;

import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: "); int a = sc.nextInt();
		System.out.print("Digite outro numero: "); int b = sc.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
	}
}
