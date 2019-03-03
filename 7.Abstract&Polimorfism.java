package application;



import java.util.ArrayList;

import java.util.List;

import java.util.Locale;

import java.util.Scanner;



import entities.Shape;

import entities.Rectangle;

import entities.Circle;

import entities.enums.Color;



public class Program {



	public static void main(String[] args) {



		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		

		List<Shape> list = new ArrayList<>();

		

		System.out.print("Enter the number of shapes: ");

		int n = sc.nextInt();

		

		for (int i=1; i<=n; i++) {

			System.out.println("Shape #" + i + " data:");

			System.out.print("Rectangle or Circle (r/c)? ");

			char ch = sc.next().charAt(0);

			System.out.print("Color (BLACK/BLUE/RED): ");

			Color color = Color.valueOf(sc.next());

			if (ch == 'r') {

				System.out.print("Width: ");

				double width = sc.nextDouble();

				System.out.print("Height: ");

				double height = sc.nextDouble();

				list.add(new Rectangle(color, width, height));

			}

			else {

				System.out.print("Radius: ");

				double radius = sc.nextDouble();

				list.add(new Circle(color, radius));

			}

		}

		

		System.out.println();

		System.out.println("SHAPE AREAS:");

		for (Shape shape : list) {

			System.out.println(String.format("%.2f", shape.area()));

		}

		

		sc.close();

	}

}


-------------------------------------------------------------------------------------------------------------------------------------
/* CLASSE ABSTRATA */

package entities;



import entities.enums.Color;



public abstract class Shape {



	private Color color;

	

	public Shape() {

	}

	

	public Shape(Color color) {

		this.color = color;

	}



	public Color getColor() {

		return color;

	}



	public void setColor(Color color) {

		this.color = color;

	}

	

	public abstract double area();

}

------------------------------------------------------------------------------------------------------------------------

package entities;



import entities.enums.Color;



public class Circle extends Shape {



	private Double radius;

	

	public Circle() {

		super();

	}

	

	public Circle(Color color, Double radius) {

		super(color);

		this.radius = radius;

	}



	public Double getRadius() {

		return radius;

	}



	public void setRadius(Double radius) {

		this.radius = radius;

	}



	@Override

	public double area() {

		return Math.PI * radius * radius;

	}

}

--------------------------------------------------------------------------------------------------------------------------------------

package entities;



import entities.enums.Color;



public class Rectangle extends Shape {



	private Double width;

	private Double height;

	

	public Rectangle() {

		super();

	}



	public Rectangle(Color color, Double width, Double height) {

		super(color);

		this.width = width;

		this.height = height;

	}



	public Double getWidth() {

		return width;

	}



	public void setWidth(Double width) {

		this.width = width;

	}



	public Double getHeight() {

		return height;

	}



	public void setHeight(Double height) {

		this.height = height;

	}



	@Override

	public double area() {

		return width * height;

	}

}
