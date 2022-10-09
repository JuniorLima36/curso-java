package retangulo.applicatiom;

import java.util.Locale;
import java.util.Scanner;

import retangulo.entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retan = new Retangulo();
		
		System.out.print("Digite a Largura: ");
		retan.largura = sc.nextDouble();
		System.out.print("Digite a Altura: ");
		retan.altura = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Area = %.2f%n", retan.area());
		System.out.printf("Perimetro = %.2f%n", retan.perimetro());
		System.out.printf("Diagonal = %.2f%n", retan.diagonal());
		sc.close();
	}
}
