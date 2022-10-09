package notas.application;

import java.util.Locale;
import java.util.Scanner;

import notas.entities.Notas;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Notas nota = new Notas();

		nota.nome = sc.nextLine();
		nota.a = sc.nextDouble();
		nota.b = sc.nextDouble();
		nota.c = sc.nextDouble();
		
		System.out.printf("Grade Final: %.2f%n", nota.media());
		
		if (nota.media() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f Pontos%n", nota.pontos());
		}
		else {
			System.out.println("Aprovado");
		}
		sc.close();
	}
}
