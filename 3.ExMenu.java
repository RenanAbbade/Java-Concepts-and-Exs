/*(utilize Scanner, while, if) Escreva um programa em Java que receba dois números inteiros.
Execute e mostre o resultado das operações listadas, a seguir, de acordo com a escolha do usuário.
O menu deve ser apresentado enquanto o usuário não escolher a opção 4 (Sair).
Opção Operação
1 Média entre os números digitados
2 Produto entre os números digitados
3 Diferença do maior pelo menor
4 Sair
Se a opção digitada for inválida, mostrar uma mensagem de erro e encerrar a execução do programa. */
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		int n1;
		int n2;
		double media;
		double produto;
		double dif;
		int menu;
		menu = 0;
		do {
		
		System.out.println("Digite um número qualquer \n");
		Scanner entrada = new Scanner(System.in);
		n1 = entrada.nextInt();
		
		System.out.println("Digite um segundo número qualquer \n");
		Scanner ent = new Scanner(System.in);
		n2 = ent.nextInt();
		
		System.out.println("------------------ MENU ----------------- "
				+ "\n Digite de 1 a 4 para: 1 - Média entre os dois números "
				+ "\n 2 - Produto entre os dois núemros "
				+ "\n 3 - Diferença do maior para o menor "
				+ "\n 4 - SAIR");
		Scanner m = new Scanner(System.in);
		menu = m.nextInt();
		while(menu<1 || menu>4) {
			System.out.println("------------------ MENU -----------------  \n DIGITE UM NÚMERO VÁLIDO!"
					+ "\n Digite de 1 a 4 para: 1 - Média entre os dois números "
					+ "\n 2 - Produto entre os dois núemros "
					+ "\n 3 - Diferença do maior para o menor "
					+ "\n 4 - SAIR");
			Scanner me = new Scanner(System.in);
			menu = me.nextInt();
		}
		
		
			switch(menu) {
			
			case 1:
				media =	(n1+n2)/2;
				System.out.println("A média dos dois números dados é "+media);
				break;
			
			case 2:
				produto = n1*n2;
				System.out.println("O produto entre os dois números digitados é "+produto);
			
				break;
			
			case 3:
				if(n1>n2) {
					dif = n1-n2;
					System.out.println("A diferença do maior para o menor é "+dif);
					break;
				}
				else {
					System.out.println("A diferença do maior para o menor é "+(n2-n1));
					break;
				
			}
		}
		} while(menu!=4);
	}
}

		
		



