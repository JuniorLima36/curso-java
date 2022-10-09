package notas.entities;

public class Notas {
	public String nome;
	public double a;
	public double b;
	public double c;
	
	public double media() {
		return a + b + c;
	}
	
	public double pontos () {
		if (media() < 60){
			return 60.0 - media();
		}
		else {
			return 0.0;
		}
	}
}
