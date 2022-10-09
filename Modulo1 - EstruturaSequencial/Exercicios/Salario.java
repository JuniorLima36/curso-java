package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite as horas: "); int num = sc.nextInt(); sc.nextLine();
		System.out.print("Digite as horas: "); int hora = sc.nextInt(); sc.nextLine();
		System.out.print("Digite as horas: "); double valorHora = sc.nextDouble(); sc.nextLine();
		double salario = hora * valorHora;
		
		System.out.println();
		System.out.printf("Number = %d%n", num);
		System.out.printf("Salary = U$ %.2f", salario);
	}
}
