package exs;

public class Rectangle {
	public double widht;
	public double height;
	
	public double Area() {
		return widht * height;
	}
	public double perimetro() {
		return 2*(widht * height);
		
	}
	public double diagonal() {
		return Math.pow(height, 2) + Math.pow(widht, 2);
		
	}

}
-------------------------------------------------------------



package exs;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle a;
		a = new Rectangle();
		
		System.out.println("Digite o valor da largura do retângulo ");
		a.widht = sc.nextDouble();
		System.out.println("Digite o valor da altura do retângulo ");
		a.height = sc.nextDouble();
		
		double area = a.Area();
		double perimetro = a.perimetro();
		double diagonal = a.diagonal();
		
		System.out.println("A área do retangulo é "+area+", com perimetro de: "+perimetro+", e diagonal de "+diagonal);

	}

}
