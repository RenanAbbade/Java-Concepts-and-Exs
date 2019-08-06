import java.util.Scanner;

public class CartaoDebito {
	//vars debito
	ListaDeCompras lista = new ListaDeCompras();
	private static String banco;
	private static String agencia;
	private static String contaCorrente;
	
	
		public void pagaDebito(){
			System.out.println(  " \n Você escolheu pagar com cartão de débito! \n");
			Scanner sc = new Scanner(System.in);
			System.out.println(" \n Digite o número correspondente ao seu banco a seguir.Necessita ter exatos 4 digitos! \n");
			banco = sc.next();
			while (banco.length() != 4) {
				System.out.println(" \n Digite o número correspondente ao seu banco a seguir.Necessita ter exatos 4 digitos! \n");
				banco = sc.next();
			}
			System.out.println(" \n Agora digite o número da agência!Necessita ter exatos 6 digitos! \n");
			agencia = sc.next();
			while (agencia.length() != 6) {
				System.out.println(" \n Agora digite o número da agência!Necessita ter exatos 6 digitos! \n");
				agencia = sc.next();
			}
			System.out.println(" \n Agora digite o número da conta corrente!Necessita ter exatos 8 digitos! \n");
			contaCorrente = sc.next();
			while (contaCorrente.length() != 8) {
				System.out.println(" \n Agora digite o número da conta corrente!Necessita ter exatos 8 digitos! \n");
				contaCorrente = sc.next();
			}
			System.out.println("Valor a pagar:"+ String.format("%.2f", lista.getValor_total()));
			System.out.println(" \n \n Agora digite a senha do cartão! (6 digitos) \n");
			String senha = sc.next();
			while (senha.length() != 6) {
				System.out.println("  \n Agora digite a senha do cartão! (6 digitos) Corretamente \n");
				senha = sc.next();
			}
			System.out.println(" \n Carregando.. \n Aprovando.. \n  Compra aprovada! \n  ");
			
			
				
			}


		public String getBanco() {
			return banco;
		}



		public String getAgencia() {
			return agencia;
		}


	


		public String getContaCorrente() {
			return contaCorrente;
		}


	
		}