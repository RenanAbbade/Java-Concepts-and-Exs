package course;

import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		/* Condição ternaria é uma condional abreviada, quase como uma recursão */
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco*0.1 : preco *0.5;
		/* O IF está implicito, interrogação seria o then, e : seria o else */
		System.out.println(desconto);
	}
}
