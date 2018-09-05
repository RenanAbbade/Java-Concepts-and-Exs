package course;

import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números inteiros na mesma linha, separados por espaço");
		String numeros = sc.nextLine();
		String[] vect = numeros.split(" ");
		String num1 = vect[0];
		String num2 = vect[1];
		String num3 = vect[2];
		
		int numero1 = Integer.parseInt(num1);
		int numero2 = Integer.parseInt(num2);
		int numero3 = Integer.parseInt(num3);
		
		if(numero1>numero2 && numero1>numero3) {
			System.out.println("O "+numero1 +" é o maior");
		}
		else if(numero2>numero1 && numero2>numero3) {
			System.out.println("O "+numero2 +" é o maior");
		}
		else if(numero3>numero1 && numero3>numero2) {
			System.out.println("O "+numero3 +" é o maior");
		}
		else if(numero1>numero2 && numero3 == numero1 ||  numero1>numero3 && numero1 == numero2  ) {
			System.out.println("Números maiores empatados o maior é "+numero1);
		}
		else if( numero2>numero1 && numero3 == numero2 ||  numero2>numero3 && numero2 == numero1) {
			System.out.println("Números maiores  empatados, o maior é "+numero2);
		}
		else if( numero3>numero1 && numero3 == numero2 ||  numero3>numero2 && numero3==numero1 ) {
			System.out.println("Números maiores empatados o maior é "+numero3);
		}
		else if(numero1==numero2 && numero1==numero3) {
			System.out.println("Todos empatados em "+numero1);
		}
		
		sc.close();
		
}
}
