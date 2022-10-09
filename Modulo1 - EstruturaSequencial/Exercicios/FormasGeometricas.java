package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class FormasGeometricas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Valor A: "); double a = sc.nextDouble(); sc.nextLine();
		System.out.print("Digite o Valor B: "); double b = sc.nextDouble(); sc.nextLine();
		System.out.print("Digite o Valor C: "); double c = sc.nextDouble(); sc.nextLine();
		
		double triangulo = a * c / 2.0;
		double ciruclo = 3.14159 * Math.pow(c, 2);
		double trapezio = (a + b) / 2.0 * c;
		double quadrado = b * b;
		double retangulo = a * b;
		System.out.println();
		
		System.out.printf("Triangulo: %.3f%n", triangulo); 
		System.out.printf("Circulo: %.3f%n", ciruclo); 
		System.out.printf("Trapezio: %.3f%n", trapezio); 
		System.out.printf("Quadrado: %.3f%n", quadrado); 
		System.out.printf("Retangulo: %.3f%n", retangulo);
	}
}
