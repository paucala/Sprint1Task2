package n1exercici1;

public class Producte {
	private String name;
	private double price;
	
	public Producte (String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
