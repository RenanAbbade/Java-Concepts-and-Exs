import java.util.Scanner;

public class Dinheiro {
		ListaDeCompras lista = new ListaDeCompras(); //Instancia da classe ListaDeCompras
		private double dinheiro = 20000; //Dinheiro da Loja
		Scanner sc = new Scanner(System.in);

		public void pagamentoDinheiro() {
			System.out.println("Valor a pagar:"+ String.format("%.2f", lista.getValor_total()));
			double total_pagar = lista.getValor_total();
			System.out.println(" \n \n ---------------------- NOTAS ------------------------- \n "
					+ "1. 5 \n"
					+ "2. 10 \n"
					+ "3. 20 \n"
					+ "4. 50 \n"
					+ "5. 100 \n"
					+ " Escolha as notas com que deseja pagar \n");
			int notas = 0;
			int escolhe = sc.nextInt();
			while (notas <= total_pagar) {
				switch(escolhe) {
				case 1:
					notas = notas + 5;
					System.out.println(notas);
					if(notas > total_pagar) {
						System.out.println("Troco: "+ (notas - total_pagar)+ "R$");
						dinheiro = dinheiro + notas;
						break;
					}if(notas == total_pagar) {
						System.out.println("Sem troco, está certinho!");
						dinheiro = dinheiro + notas;
						break;
					}
					else  {
						continue;
					}
			
				case 2:
					notas = notas + 10;
					System.out.println(notas);
					if(notas > total_pagar) {
						System.out.println("Troco: "+ (notas - total_pagar)+ "R$");
						dinheiro = dinheiro + notas;
						break;
					} if(notas == total_pagar) {
						System.out.println("Sem troco, está certinho!");
						dinheiro = dinheiro + notas;
						break;
					}
					else {
						continue;
					}

				case 3:
					notas = notas + 20;
					System.out.println(notas);
					if(notas > total_pagar) {
						System.out.println("Troco: "+ (notas - total_pagar)+ "R$");
						dinheiro = dinheiro + notas;
						break;
					} if(notas == total_pagar) {
						System.out.println("Sem troco, está certinho!");
						dinheiro = dinheiro + notas;
						break;
					}
					else {
						continue;
					}
				
				case 4:
					notas = notas + 50;
					System.out.println(notas);
					if(notas > total_pagar) {
						System.out.println("Troco: "+ (notas - total_pagar)+ "R$");
						dinheiro = dinheiro + notas;
						break;
					} if(notas == total_pagar) {
						System.out.println("Sem troco, está certinho!");
						dinheiro = dinheiro + notas;
						break;
					}
					else {
						continue;
					}
				
				case 5:
					notas = notas + 100;
					System.out.println(notas);
					if(notas > total_pagar) {
						System.out.println("Troco: "+ (notas - total_pagar)+ "R$");
						dinheiro = dinheiro + notas;
						break;
					} if(notas == total_pagar) {
						System.out.println("Sem troco, está certinho!");
						dinheiro = dinheiro + notas;
						break;
					}
					else {
						continue;
					}
				
				}
			}
			
				
		
		
			// troco = pagamento - valor da compra 
	}
		




	}
	/*a)  O atendente registra a quantia recebida em dinheiro. 
	 * b)  O sistema mostra o troco, caso haja. 
	 * c)  O atendente deposita o dinheiro em seu caixa e devolve o troco ao cliente */

