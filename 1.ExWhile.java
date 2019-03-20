package course;

import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número maior que 0 para obter raíz ");
		double num = sc.nextDouble();
		
		while(num>=0) {
			double raiz = Math.sqrt(num);
			System.out.println(raiz);
			System.out.println("Digite o proximo número ");
			num = sc.nextDouble();
	}
		System.out.println("Digite um número válido");
		num = sc.nextDouble();
		
		}
	}
