
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancias 
		Produto p = new Produto(); 
		ListaDeCompras lista = new ListaDeCompras(); 
		Cliente c = new Cliente();
		Dinheiro din = new Dinheiro();
		CartaoCredito credit = new CartaoCredito();
		CartaoDebito debt = new CartaoDebito();
		Cheque check = new Cheque();
		Caixa caixa = new Caixa();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo a loja Marinos! \n");
		System.out.println("Qual o nome do cliente? \n" );
		String nome  = sc.nextLine();
		c.setNome(nome);
		System.out.println(c.getNome() + ", que tal dar uma olhada no nosso catalogo de produtos! ");
		
		
		p.catalogo(); //Criação dos produtos do catalogo
		p.catalogoShow();

		menu();
		
		while (true){
		int opcao = sc.nextInt();
		if (opcao == 0)
		break;
		switch (opcao) {
			case 1:
				lista.adcProd();
				menu();
			break;
			case 2:
				lista.removeProd();
				menu();
			break;
			case 3:
				lista.carrinho();
				menu();
			break;
			case 4:
				lista.carrinho();
				System.out.println(" \n \n --------------- ESCOLHA SUA OPÇÃO DE PAGAMENTO ----------------- \n"
						+ "1. Dinheiro \n"
						+ "2. Cartão Débito/Crédito \n"
						+ "3. Cheque \n"
						+ "0. SAIR \n");
				while (true) {
				int pagamento = sc.nextInt();
				if (pagamento ==0)
					break;
					switch (pagamento) {
					case 1:
						din.pagamentoDinheiro();
						caixa.gerarNFsimples();
						System.exit(0);
					break;
					case 2://cartao
						System.out.println(" \n \n --------------- ESCOLHA OPÇÃO DE PAGAMENTO DO CARTÃO  ----------------- \n"	
						+ "1. Cartão Débito \n"
						+ "2. Cartão Crédito \n"
						);
						int cartao = sc.nextInt();
						while(cartao < 1 || cartao > 2) {
							System.out.println(" \n \n --------------- ESCOLHA OPÇÃO DE PAGAMENTO DO CARTÃO  ----------------- \n"	
						+ "1. Cartão Débito \n"
						+ "2. Cartão Crédito \n"
						);
						cartao = sc.nextInt();
						
						}
						
						if(cartao == 1) {
							debt.pagaDebito();
							caixa.gerarNF1();
							break;
						}else if(cartao == 2) {
							credit.pagaCredito();
							caixa.gerarNF2();
							break;
						}
						System.exit(0);
					break;
					case 3:
						check.pagaCheque();
						caixa.gerarNFsimples();
						System.exit(0);
					break;
					default:
						System.out.println("\n Forma de pagamento invalida!!");
						System.exit(0);
					break;
									}
									}
			break;
								
			
			default:
			System.out.println("\n Escolha errada!!");
			break;
			}}
		
		}
		// fim do switch e do While do Switch
		
public static void menu() {
	System.out.println(" \n \n ---------------------- MENU ------------------------- \n "
			+ "Escolha a opção de acordo com o que deseja! \n"
			+ "1. Comprar um produto \n"
			+ "2. Remover produto da lista de compras \n"
			+ "3. Visualizar lista de compras \n"
			+ "4. Efetuar pagamento \n"
			+ "0. SAIR");
}
		
		
	}




