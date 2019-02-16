public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um núemro inteiro: ");
		int num = sc.nextInt();
		
		
		if(num%2==0) {
			System.out.println("O número é par ");
		}
		else {
			System.out.println("O número é impar");
		}
		
		
		
		sc.close();
		

	}

}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String name = sc.nextLine();
		System.out.println("Entre com as horas ");
		double num = sc.nextDouble();
		
		if(num<12 && num>=5) {
			System.out.println("Bom dia senhor "+name);
		}
		else if(num>=12 && num<18) {
			System.out.println("Boa tarde!senhor "+name);
		}
		else if(num>=18 && num<=24) {
			System.out.println("Boa noite!senhor "+name);
		}
		else if(num>24) {
			System.out.println("Digite um número válido!senhor "+name);
		}
		else if(num<5)
			System.out.println("Está de madrugada, volte a dormir seu velho "+name);
		sc.close();
		

	}

}
