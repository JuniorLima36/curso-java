package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListasExercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ListClass> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.print("Id já tomadas. Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new ListClass(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Informe o Id do funcionário que terá aumento salarial:");
		int id = sc.nextInt();
		ListClass emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null){
			System.out.println("Esta Id não existe!");
		}
		else {
			System.out.print("Entre com a porcentagem: ");
			double porc = sc.nextDouble();
			emp.increSalario(porc);
		}
		
		System.out.println();
		System.out.println("Lista de empregados ");
		for(ListClass obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
	private static boolean hasId(List<ListClass> list, int id) {
		ListClass emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}