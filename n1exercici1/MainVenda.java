package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainVenda {

	public static void main(String[] args) {
		
		Venda venda1 = new Venda();
		Venda venda2 = new Venda();
		Producte champu = new Producte ("champu", 12);
		Producte patates = new Producte ("patates", 1.5);
		Producte arros = new Producte ("arros", 1);
		
		venda1.getProductes().addAll(Arrays.asList(champu, patates, arros));
		venda1.calcularTotal();
		venda2.calcularTotal();
		}

}
