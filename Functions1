package course;

import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int maior = max(n1, n2, n3);
		
		showResult(maior);
		sc.close();
	}
	
	public static int max(int x, int y, int z) { //public static int, pois a função retorna um valor inteiro
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y; 
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) { // void significa que a função não retorna valor algum
		System.out.println("Maior = "+value);
	}
}
