import java.util.Scanner;

public class Caixa {
	private static String CPF_CNPJ;
	ListaDeCompras lista = new ListaDeCompras();
	CartaoDebito debt = new CartaoDebito();
	Cheque check = new Cheque();
	CartaoCredito credit = new CartaoCredito();
	
	
	
	public void gerarNF1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Deseja inserir CPF ou CNPJ na sua nota fiscal? \n"
				+ "1.SIM \n"
				+ "2.NÃO \n");
		int opcao = sc.nextInt();
		if (opcao==1) {
			System.out.println("REGISTRO NA NOTA \n"
				+ "1.CPF \n"
				+ "2.CNPJ \n");
			int escolha = sc.nextInt();
			while (escolha <1 || escolha >2) {
				System.out.println("REGISTRO NA NOTA \n"
					+ "1.CPF \n"
					+ "2.CNPJ \n");
				}
			if(escolha == 1) {
				System.out.println("Digite seu CPF, com 11 digitos \n");
				CPF_CNPJ = sc.next();
				while (CPF_CNPJ.length() > 11 || CPF_CNPJ.length() < 11) {
					System.out.println("Digite um CPF com 11 digitos! \n");
					CPF_CNPJ = sc.next();
				}
			}else if(escolha == 2) {
				System.out.println("\n Digite um CNPJ com 11 digitos!(/0001 já inserido) \n");
				CPF_CNPJ = sc.next();
				while (CPF_CNPJ.length() > 11 || CPF_CNPJ.length() < 11) {
					System.out.println("\n Digite um CNPJ COM 11 digitos!(/0001 já inserido) \n");
					CPF_CNPJ = sc.next();
				}
				CPF_CNPJ = CPF_CNPJ.substring(0, 9)+"/0001-"+CPF_CNPJ.substring(9,11);
			}
				
				System.out.println("\n CUPOM FISCAL "
						+ "\n Marinos Comércio LTDA."
						+ "\n Rua dos Milagres, 391 – Vila Grande – CEP: 03921-036 – Ubirajara"
						+ "\n CNPJ: 11.341.667/0001-21 "
						+ "\n CPF|CNPJ: "+CPF_CNPJ
						+ "\n Banco: "+ debt.getBanco()
						+ "C/C: "+debt.getContaCorrente()
						+ "\n Valor da compra: "+String.format("%.2f", lista.getValor_total()));
				
				
			 
			
		}else {
			System.out.println("\n CUPOM FISCAL "
					+ "\n Marinos Comércio LTDA."
					+ "\n Rua dos Milagres, 391 – Vila Grande – CEP: 03921-036 – Ubirajara"
					+ "\n CNPJ: 11.341.667/0001-21 "
					+ "\n Banco: "+ debt.getBanco()
					+ "\n C/C: "+debt.getContaCorrente()
					+ "\n Valor da compra: "+String.format("%.2f", lista.getValor_total()));
			
		}
		
		System.out.println("\n Marinho's agradece! Volte sempre! ");
			}
		
		
	
	
	public void gerarNF2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Deseja inserir CPF ou CNPJ na sua nota fiscal? \n"
				+ "1.SIM \n"
				+ "2.NÃO \n");
		int opcao = sc.nextInt();
		if (opcao==1) {
			System.out.println("REGISTRO NA NOTA \n"
				+ "1.CPF \n"
				+ "2.CNPJ \n");
			int escolha = sc.nextInt();
			while (escolha <1 || escolha >2) {
				System.out.println("REGISTRO NA NOTA \n"
					+ "1.CPF \n"
					+ "2.CNPJ \n");
			}
			if(escolha == 1) {
				System.out.println("Digite seu CPF, até 11 digitos \n");
				CPF_CNPJ = sc.next();
				while (CPF_CNPJ.length() > 11 || CPF_CNPJ.length() < 11) {
					System.out.println("Digite um CPF até 11 digitos! \n");
					CPF_CNPJ = sc.next();
				}
			}else if(escolha == 2) {
				System.out.println("Digite um CNPJ até 11 digitos!(/0001 já inserido) \n");
				CPF_CNPJ = sc.next();
				while (CPF_CNPJ.length() > 11 || CPF_CNPJ.length() < 11) {
					System.out.println("Digite um CNPJ até 11 digitos!(/0001 já inserido) \n");
					CPF_CNPJ = sc.next();
				}
				CPF_CNPJ = CPF_CNPJ.substring(0, 9)+"/0001-"+CPF_CNPJ.substring(9,11);
			}
				System.out.println("\n CUPOM FISCAL "
						+ "\n Marinos Comércio LTDA."
						+ "\n Rua dos Milagres, 391 – Vila Grande – CEP: 03921-036 – Ubirajara"
						+ "\n CNPJ: 11.341.667/0001-21 "
						+ "\n CPF|CNPJ: "+CPF_CNPJ
						+ "\n Administradora: "+ credit.getAdministradora()
						+ "\n Núm.Cartão: "+credit.getNumCredito()
						+ "\n Núm. de parcelas: "+credit.getNumParcelas()
						+ "\n Valor da compra: "+String.format("%.2f", lista.getValor_total()));
				
			 
			
		}else {
			System.out.println("\n CUPOM FISCAL "
					+ "\n Marinos Comércio LTDA."
					+ "\n Rua dos Milagres, 391 – Vila Grande – CEP: 03921-036 – Ubirajara"
					+ "\n CNPJ: 11.341.667/0001-21 "
					+ "\n Administradora: "+ credit.getAdministradora()
					+ "\n Núm.Cartão: "+credit.getNumCredito()
					+ "\n Núm. de parcelas: "+credit.getNumParcelas()
					+ "\n Valor da compra: "+String.format("%.2f", lista.getValor_total()));
			
			
			
			
		}
		
		System.out.println("\n Marinho's agradece! Volte sempre! ");
		}
	
	public void gerarNFsimples() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Deseja inserir CPF ou CNPJ na sua nota fiscal? \n"
				+ "1.SIM \n"
				+ "2.NÃO \n");
		int opcao = sc.nextInt();
		if (opcao==1) {
			System.out.println("REGISTRO NA NOTA \n"
				+ "1.CPF \n"
				+ "2.CNPJ \n");
			int escolha = sc.nextInt();
			while (escolha <1 || escolha >2) {
				System.out.println("REGISTRO NA NOTA \n"
					+ "1.CPF \n"
					+ "2.CNPJ \n");
				}
			if(escolha == 1) {
				System.out.println("Digite seu CPF, até 11 digitos \n");
				CPF_CNPJ = sc.next();
				while (CPF_CNPJ.length() > 11 || CPF_CNPJ.length() < 11) {
					System.out.println("Digite um CPF até 11 digitos! \n");
					CPF_CNPJ = sc.next();
				}
			}else if(escolha == 2) {
				System.out.println("\n Digite um CNPJ até 11 digitos!(/0001 já inserido) \n");
				CPF_CNPJ = sc.next();
				while (CPF_CNPJ.length() > 11 || CPF_CNPJ.length() < 11) {
					System.out.println("\n Digite um CNPJ até 11 digitos!(/0001 já inserido) \n");
					CPF_CNPJ = sc.next();
				}
				CPF_CNPJ = CPF_CNPJ.substring(0, 9)+"/0001-"+CPF_CNPJ.substring(9,11);
			}
				
				System.out.println("\n CUPOM FISCAL "
						+ "\n Marinos Comércio LTDA."
						+ "\n Rua dos Milagres, 391 – Vila Grande – CEP: 03921-036 – Ubirajara"
						+ "\n CNPJ: 11.341.667/0001-21 "
						+ "\n CPF|CNPJ: "+CPF_CNPJ
						+ "\n Valor da compra: "+String.format("%.2f", lista.getValor_total()));
				
				
			 
			
		}else {
			System.out.println("\n CUPOM FISCAL "
					+ "\n Marinos Comércio LTDA."
					+ "\n Rua dos Milagres, 391 – Vila Grande – CEP: 03921-036 – Ubirajara"
					+ "\n CNPJ: 11.341.667/0001-21 "
					+ "\n Valor da compra: "+String.format("%.2f", lista.getValor_total()));
			
			
		}
		
		System.out.println("\n Marinho's agradece! Volte sempre! ");
		
		
	}
			}
		
		
		
		
		
		
	

