import java.util.Scanner;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CartaoCredito {
	//vars credito
		ListaDeCompras lista = new ListaDeCompras();
		private static String administradora;
		private static String NumCredito;
		private static int NumParcelas; 




	public void pagaCredito() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" \n \n ---------------------- Digite o número correspondente  a administradora do seu cartão! ------------------------- \n "
				+ "Escolha a opção de acordo com o que deseja! \n"
				+ "1. VISA \n"
				+ "2. MASTERCARD \n"
				+ "3. DINERS CLUB \n"
				+ "4. AMERICAN EXPRESS \n"
				+ "5. PORTO SEGURO \n");
		int opcao = sc.nextInt();
		while(opcao < 1 || opcao >5) {
			System.out.println(" \n \n ---------------------- Digite o número correspondente  a administradora do seu cartão CORRETAMENTE! ------------------------- ");
			opcao = sc.nextInt();
		}
			
		if (opcao ==1) {
			administradora = "VISA";
		}else if(opcao == 2) {
			administradora = "MASTERCARD";
		}else if(opcao == 3) {
			administradora = "DINERS CLUB";
		}else if(opcao == 4) {
			administradora = "AMERICAN EXPRESS";
		}else if(opcao == 5) {
			administradora = "PORTO SEGURO";
		}
		
		System.out.println("\n Digite o número correspondente ao seu cartão de crédito! Necessários exatos 10 digitos! \n");
		NumCredito = sc.next();
		while (NumCredito.length() != 10) {
			System.out.println(" \n Digite o número correspondente ao seu cartão de crédito! Necessários exatos 10 digitos! \n");
			NumCredito = sc.next();
		}
		System.out.println("\n Digite o número de parcelas que deseja para efetuar a compra, no minimo uma, e no máximo até 3 parcelas! \n");
		NumParcelas = sc.nextInt();
		while (NumParcelas <1 || NumParcelas>3) {
			System.out.println("\n Digite o número de parcelas que deseja para efetuar a compra, no minimo uma, e no máximo até 3 parcelas! \n");
			NumParcelas = sc.nextInt();
		}
		if(NumParcelas == 1) {
			System.out.println("Valor a pagar: 1x de "+ String.format("%.2f", lista.getValor_total()));
		}else if(NumParcelas == 2) {
			System.out.println("Valor a pagar: 2x de "+ String.format("%.2f", (lista.getValor_total()/2)));
		}else if(NumParcelas == 3) {
			System.out.println("Valor a pagar: 3x de "+ String.format("%.2f", (lista.getValor_total()/3)));
		}
		System.out.println(" \n \n Agora digite a senha do cartão! (6 digitos) \n");
		String senha = sc.next();
		while (senha.length() != 6) {
			System.out.println(" \n Agora digite a senha do cartão! (6 digitos) Corretamente \n");
			senha = sc.next();
		}
		System.out.println(" \n Carregando.. \n Aprovando.. \n  Compra aprovada! \n  ");
		}




	public  String getAdministradora() {
		return administradora;
	}








	public  String getNumCredito() {
		return NumCredito;
	}







	public int getNumParcelas() {
		return NumParcelas;
	}




	
	
	}