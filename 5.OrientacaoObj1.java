___________________________________________________________________________________________________________________

package entities;
package entities;

public class Triangle {
	//criando os atributos da classe triangulo
	public double a;
	public double b;
	public double c;
	
	/* Criando função- public para ser acessada por outras
	  classes, a segunda palavra double para indicar o retorno 
	  do valor numérico, void quando a função não retorna, em seguida
	  o nome da operação, com os parametros, no caso essa função não
	  recebe parametros */
	public  double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p-a) * (p-b) * (p-c));
	}

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
		//Para que eu possa usar o objeto, para que ele exista, preciso instanciar com o comando new, criando os objetos x e y derivados da classe triangulo
		x = new Triangle();
		y = new Triangle(); 
		
		System.out.println("Entre com os tamanhos dos lados do triangulo X: ");
		//os atributos da classe são herdados pelos objetos, assim sendo, cada objeto x e y, tem os atributos a,b e c
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com os tamanhos dos lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Area do triangulo
		
		double areaX = x.area(); //Area do triangulo x será o objeto x.(ponto) nome da função Area que indica chamada da função - ou seja, objeto x chama função da classe triangulo
		double areaY = y.area();
		
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
