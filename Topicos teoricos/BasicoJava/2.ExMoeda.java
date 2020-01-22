/*2. (utilize Scanner, switch) Escreva um programa em Java que leia o custo de uma compra
internacional e o tipo de moeda (1, 2 ou 3), sendo:
1 - dólar americano
2 – euro
3 - libra esterlina
Mostre o tipo de moeda (dólar americano, euro ou libra esterlina) e
 o valor em reais da compra, conforme
as cotações a seguir:
Moeda Cotação
Dólar R$ 3,71
Euro R$ 4,31
Libra R$ 4,81 */
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		
		double custo;
		int moeda;
		double dolar,euro, libra;
		
		
		System.out.println("Digite o custo de uma compra internacional: \n" );
		Scanner entrada = new Scanner(System.in);
		custo = entrada.nextFloat();
		
		System.out.println("Em qual moeda deseja pagar? Digite 1 para Dólar americano(Dólar R$ 3,71) \n 2 para Euro(Euro R$ 4,31) \n 3 para Libra Esterlina(Libra R$ 4,81) \n ");
		Scanner ent = new Scanner(System.in);
		moeda = ent.nextInt();
		
		while(moeda<1 || moeda>3) {
			System.out.println(" Digitou um número inválido! Por favor, Em qual moeda deseja pagar? digite 1 para Dólar americano(Dólar R$ 3,71) \n 2 para Euro(Euro R$ 4,31) \n 3 para Libra Esterlina(Libra R$ 4,81) \n ");
			Scanner enta = new Scanner(System.in);
			moeda = enta.nextInt();
			
		}
		switch(moeda) {
		case 1:
			dolar = custo*3.14;
			System.out.println("O custo em reais da compra será "+String.format("%.2f", dolar)+" R$");
			break;
		case 2:
			euro = custo*4.31;
			System.out.println("O custo em reais da compra será "+String.format("%.2f", euro)+" R$");
			break;
		case 3:
			libra = custo*4.81;
			System.out.println("O custo em reais da compra será "+String.format("%.2f", libra)+" R$");
			break;
		}
		
		
		
	}

}
