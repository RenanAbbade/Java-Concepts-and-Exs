import java.util.Scanner;

/*8. Se forma de pagamento = “cheque”: 
a)  O atendente registra a quantia recebida. b)  O cliente preenche e assina o cheque.
 c)   Atendente recebe e confere o cheque. 
  c)  O atendente registra no sistema os dados do cheque contendo: Banco: número composto de 4 dígitos numéricos. Série: composto de 2 dígitos.
   Conta corrente: composta de 8 dígitos numéricos. Número do cheque: composto de 8 dígitos numéricos.
    Nome do comprador: sequência de caracteres de até 40 caracteres.  
f)  O atendente armazena o cheque em seu caixa para futuro depósito. */
public class Cheque { 
	
	private static String banco;
	private static String serie;
	private static String num_cheque;
	private static String nome_cheque;
	private static String contaCorrente;
	ListaDeCompras lista = new ListaDeCompras();
	
	public void pagaCheque() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor a pagar: "+ String.format("%.2f", lista.getValor_total()));
		System.out.println(" \n Digite o número correspondente ao seu banco a seguir.Necessita ter exatos 4 digitos! \n");
		banco = sc.next();
		while (banco.length() != 4) {
			System.out.println(" \n Digite o número correspondente ao seu banco a seguir.Necessita ter exatos 4 digitos! \n");
			banco = sc.next();
		}
		System.out.println(" \n Digite o número da serie agora.Necessita ter exatos 2 digitos! \n");
		serie = sc.next();
		while (serie.length() != 2) {
			System.out.println(" \n Digite o número da serie  a seguir.Necessita ter exatos 2 digitos! \n");
			serie = sc.next();
		}
		System.out.println(" \n Agora digite o número da conta corrente!Necessita ter exatos 8 digitos! \n");
		contaCorrente = sc.next();
		while (contaCorrente.length() != 8) {
			System.out.println(" \n Agora digite o número da conta corrente!Necessita ter exatos 8 digitos! \n");
			contaCorrente = sc.next();
		}
		System.out.println(" \n Agora digite o número do cheque!Necessita ter exatos 8 digitos! \n");
		num_cheque = sc.next();
		while (num_cheque.length() != 8) {
			System.out.println(" \n Agora digite o número do cheque!Necessita ter exatos 8 digitos! \n");
			num_cheque = sc.next();
		}
		System.out.println(" \n Digite o nome do comprador! \n");
		nome_cheque = sc.next();
		while (nome_cheque.length() > 40) {
			System.out.println("\\n Digite o nome do comprador! Menos de 40 carateres por favor. \\n");
			nome_cheque = sc.next();
		}
		
		System.out.println(" \n"
				+ " \n |____________________________________________________________| \n "
				+ " \n | --------------------------- CHEQUE ------------------------ \n "
				+ " \n | --------------Valor: "+String.format("%.2f", lista.getValor_total())+"R$  \n "
				+ " \n | ------------- Nome: "+nome_cheque+"  \n"
				+ " \n | ------------- Banco: "+banco+"  \n"
				+ " \n | ------------- Série: "+serie+"  \n"
				+ " \n | ------------- C/C: "+contaCorrente+"  \n"
				+ " \n | ------------- Número: "+num_cheque+"  \n"
				+ " \n | ------------- Beneficiado: Marinho's  \n"
				+ " \n |____________________________________________________________| \n "
				);
		
		System.out.println("Cheque armazenado!");
		
		
	}

}
