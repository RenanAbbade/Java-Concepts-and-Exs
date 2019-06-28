package map;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Product, Double> stock = new HashMap<>();
		//No caso é um map no qual a chave é do tipo Product, e o valor Double
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		//Para comparar o elemento de chave, a classe Product usa o Equals e o HashCode
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
