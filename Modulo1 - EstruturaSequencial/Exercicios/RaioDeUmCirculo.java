package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RaioDeUmCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Raio do Circulo: "); double raio = sc.nextDouble(); sc.nextLine();
		double pi = 3.14159;
		double soma = pi * Math.pow(raio, 2);
		System.out.printf("Valor da Area do Circulo = %.4f", soma);
	}
}
