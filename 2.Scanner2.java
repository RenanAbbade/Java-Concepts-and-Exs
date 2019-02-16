package course;
import java.util.Locale;
import java.util.Scanner;

public class Udemy {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		System.out.println("Diga seu ID");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("Diga seu nome");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.println("Responda F para feminino ou M para masculino");
		char gender = sc.next().charAt(0);
		System.out.println("Digite uma letra e um número junto");
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		
		System.out.println("Digite um número float");
		
		double n2 = sc.nextDouble();
		System.out.println("Digite outro nome");
		String name2 = sc.next();
		System.out.println("Digite F OU M");
		char ch = sc.next().charAt(0);
		System.out.println("Digite a idade");
		int age = sc.nextInt();
		System.out.println("Digite a altura");
		double height = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		
		
		sc.close();
		

	}

}
