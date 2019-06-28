package treeSet;

import java.util.Set;
import java.util.TreeSet;

import set.Product;

public class treesetProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product p: set) {
			System.out.println(p);
		}//Nesse caso produto tem que ter a interface Comparable para comparar o nome dos objetos deixando em ordem alfabetica

	}

}
