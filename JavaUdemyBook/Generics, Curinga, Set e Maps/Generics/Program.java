package generics;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Generics permitem que classes, interfaces e metodos possam ser parametrizados
		 * por tipo
		 */

		/* Uso comum nas coleções */

		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>(); /*Como Print Service é uma classe generica, posso colocar qualquer tipo */
		
		System.out.println("Quantos valores? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		
		System.out.println("First: "+ ps.first());
		
		sc.close();
		
	

	}

}
