package salario.entities;

public class Salario {
	public String nome;
	public double sala;
	public double imposto;
	 
	public double salaResu() {
		return sala - imposto;
	}
	
	public void porcSalario(double porc) {
		sala += sala * porc / 100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salaResu());
	}
}
