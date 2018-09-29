___________________________________________________________________________________________________________________

package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;

}
____________________________________________________________________________________________________________________


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	/*Programa que recebe os tres lados de dois triangulos, e depois compara e diz qual o maior */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		//Para que eu possa usar o objeto, para que ele exista, preciso instanciar com o comando new
		x = new Triangle();
		y = new Triangle(); 
		
		System.out.println("Entre com os tamanhos dos lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os tamanhos dos lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Area do triangulo
		double p = ((x.a + x.b + x.c)/2);
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = ((y.a + y.b + y.c)/2);
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
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
