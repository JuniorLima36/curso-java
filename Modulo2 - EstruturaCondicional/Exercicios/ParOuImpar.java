package Exercicios;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: "); int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("Par");
		}	
		else {
			System.out.println("Impar");	
		}
	}
}
