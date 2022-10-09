package salario.application;

import java.util.Locale;
import java.util.Scanner;

import salario.entities.Salario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salario sl = new Salario();
		
		System.out.print("Name: ");
		sl.nome = sc.next();
		System.out.print("Gross Salary: ");
		sl.sala = sc.nextDouble();
		System.out.print("Imposto: ");
		sl.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Empregado: " + sl);
		System.out.println();
		System.out.print("Qual porcentagem aumentar o salário? ");
		double porc = sc.nextDouble();
		sl.porcSalario(porc);
		
		System.out.println();
		System.out.printf("Dados atualizados: " + sl);
		sc.close();
	}
}
