package course;
import java.util.Locale;
import java.util.Scanner;

public class Udemy {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Enter your full name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house? ");
		int bedrooms = sc.nextInt();
		
		System.out.println("Enter your product price: ");
		double prodprice = sc.nextDouble();
		
		System.out.println("Enter your last name. age and height in the same line: ");
		String last_name, age, height;
		last_name = sc.next();
		age = sc.next();
		height = sc.next();
		double heg;
		heg = Double.parseDouble(height);
		
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.println("---");
		System.out.printf("%.2f%n", prodprice);
		System.out.println(last_name);
		System.out.println(age);
		System.out.println("---");
		System.out.printf("%.2f%n",heg);
		
		
		
		
		
		

	}

}
