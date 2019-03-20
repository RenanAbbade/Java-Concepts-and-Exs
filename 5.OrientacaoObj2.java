package entities;
/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidadenoestoque).
 * Emseguida: • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque) 
 * • Realizar uma entrada no estoque  mostrar novamente os dados do produto 
 * • Realizar uma saída no estoque e mostrar novamente os dados do produto
 */
/* Como fazer:
 * Criar primeiro a classe com suas funções
 */

public class Product {
	public String nome;
	public double preco;
	public double qtde;
	
	public double totalValue() {
		return preco * qtde;
	}
	
	public void addProducts(int qtde) {
		this.qtde = this.qtde + qtde;
		// palavra this = autoreferencia, quero acessar o atributo da classe e não o parametro quando ambos tem o mesmo nome, usando this me refiro ao atributo, sem this, me refiro ao parametro da função
	}
	
	public void remove(int qtde){
		this.qtde = this.qtde - qtde;
		
	}
	
	public String toString() {
		return nome + " preço, $"+ String.format("%.2f", preco)+ ", quantidade:  "+ String.format("%.0f",qtde) +
	"| valor total: $"+String.format("%.2f",totalValue());
	}
	
}
_________________________________________________________________________________________________________________________________________
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programa {
	/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidadenoestoque).
	 * Emseguida: • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque) 
	 * • Realizar uma entrada no estoque  mostrar novamente os dados do produto 
	 * • Realizar uma saída no estoque e mostrar novamente os dados do produto
	 */


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Declaro a variavel objeto da classe Product que é minha entidade
		Product product = new Product();
		
		
		System.out.println("Entre com o nome do produto ");
		product.nome = sc.nextLine();
		
		System.out.println("Entre com o preço do produto ");
		product.preco = sc.nextDouble();
		
		System.out.println("Entre com a quantidade em estoque do produto ");
		product.qtde = sc.nextInt();
		
		/*função .equals = retorna se um obj é igual a outro
		 * getClass- Retorna o tipo da classe
		 * hashCode - retorna um código hash do obj
		 * toString converte o objeto para String
		 * Cada um desses tipos é do tipo Object
		 */
		
	
		System.out.println(product.toString());
		
		//ADC PRODUTOS NO ESTOQUE
		System.out.println("Entre com o número de produtos para ser adc no estoque ");
		int qtde = sc.nextInt();
		product.addProducts(qtde);
		System.out.println("Dados atualizados: "+product.toString());
		
		//EXC PRODUTOS DO ESTOQUE
		System.out.println("Entre com o número de produtos para ser excluidos do estoque ");
		qtde = sc.nextInt();
		product.remove(qtde);
		System.out.println("Dados atualizados: "+product.toString());
		
		
		sc.close();

	}

}
