package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o valor de X: "); double x = sc.nextDouble();
		System.out.print("Entre com o valor de Y: "); double y = sc.nextDouble();
		if (x > 0 && y > 0) {
			System.out.println("Quadrante Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Quadrante Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Quadrante Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Quadrante Q4");
		}
		else if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		else if (x == 0) {
			System.out.println("Eixo X");
		}
		else {
			System.out.println("Eixo Y!");
		}
	}
}
