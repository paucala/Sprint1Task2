package n1exercici1;

import java.util.ArrayList;

public class Venda {
	
	private ArrayList<Producte> productes;
	private double totalPrice;
	
	public Venda () {
		this.productes = new ArrayList<Producte>();
		totalPrice = 0;		
	}

	public ArrayList<Producte> getProductes() {
		return productes;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	
	public void calcularTotal() {
		
		try {
			if (productes.isEmpty()) {
				throw new VendaBuidaException();
			} else {
				for (Producte producte : this.productes) {
					this.totalPrice += producte.getPrice();
				}

				System.out.println(this.totalPrice);
			}
			
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
