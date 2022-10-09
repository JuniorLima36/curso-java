package Exercicios;

import java.util.Scanner;

public class Diferença {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: "); int a = sc.nextInt(); sc.nextLine();
		System.out.print("Digite outro numero: "); int b = sc.nextInt(); sc.nextLine();
		System.out.print("Digite outro numero: "); int c = sc.nextInt(); sc.nextLine();
		System.out.print("Digite outro numero: "); int d = sc.nextInt(); sc.nextLine();
		
		int dif = (a * b - c * d);
		System.out.printf("Diferença = %d", dif);
	}
}
