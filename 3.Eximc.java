import java.util.Locale;
import java.util.Scanner;

public class ex {
	/*Fazer um programa para ler o peso e altura e gerar o IMC*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu pego em kg. Ex: '74.75' ");
		double peso = sc.nextDouble();
		
		System.out.println("Digite sua altura. Ex: '1.77' ");
		double altura = sc.nextDouble();
		
		double imc = (peso/(altura*altura));
		
		if(imc<18.5) {
			System.out.println("Indice de massa corporal"+imc+"Procure um médico, está abaixo do peso");
		}else if(imc>=18.5 && imc<=24.99 ) {
			System.out.println("Peso dentro da normalidade");
			
		}else if(imc>=25 && imc<=29.99 ) {
			System.out.println("Indice de massa corporal"+imc+"Está um pouco acima do peso!Cuidado!");
		}else if(imc>=30 && imc<=34.99) {
			System.out.println("Indice de massa corporal"+imc+"Está um pouco obeso nivel 1!Se cuide!");
		}else if(imc>=35 && imc<=39.99) {
			System.out.println("Indice de massa corporal"+imc+"Está um pouco obeso nivel 2!Faça uma dieta pesada se quiser viver!");
		}
		else {
			System.out.println("Indice de massa corporal"+imc+"WHAT");
			}
		sc.close();
		}
		
		
		
		
		}
	
