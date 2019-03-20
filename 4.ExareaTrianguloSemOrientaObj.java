package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*Programa que recebe os tres lados de dois triangulos, e depois compara e diz qual o maior */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com os tamanhos dos lados do triangulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		System.out.println("Entre com os tamanhos dos lados do triangulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		//Area do triangulo
		double p = ((xA + xB + xC)/2);
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = ((yA + yB + yC)/2);
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Area do triangulo X:  %.4f%n",areaX);
		System.out.printf("Area do triangulo Y:  %.4f%n",areaY);	
		
		if (areaX > areaY) {
			System.out.printf("Maior área:X, com %.4f%n",areaX);
		}else {
			System.out.printf("Maior área:Y, com %.4f%n",areaY);
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
