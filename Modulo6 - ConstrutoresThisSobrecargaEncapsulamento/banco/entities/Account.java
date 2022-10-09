package banco.entities;

public class Account {
	private String name;
	private double price;
	private int quantity;
	
	// # Construtures / Sobrecarga
	public Account() {
	
	}
	public Account(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Account(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// # Encapsulamento
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	
    // # metodos
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
