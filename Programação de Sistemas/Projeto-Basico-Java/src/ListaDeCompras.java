import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
	
	Produto p = new Produto(); //Instancia do catalogo (Classe produto)

	
	//Criação dos produtos do catalogo
	
	List<String> produtos_ = new ArrayList<>();
	List<Double> preco_ = new ArrayList<>();
	List<Integer> qtde_ = new ArrayList<>();
	private static double  valor_total;
	
	
public void adcProd(){
	// Usando get para pegar info de atributo lista privado

	Scanner to = new Scanner(System.in);
	p.catalogoShow();
	System.out.println("\n Digite o número do produto que gostaria de adquirir!");
	
	int escolha  = to.nextInt(); // Pego o número da escolha e recolho o indice das tres listas
	
	if (escolha> 0 && escolha<= p.getProd().size()) {
	
		String nprod = p.getProd().get(escolha-1);
		produtos_.add(nprod);
	
		double npreco = p.getPreco().get(escolha-1);
		preco_.add(npreco);
		
		int nqtde = p.getQtde().get(escolha-1);
		System.out.println("Digite a quantidade desse produto que gostaria de adquirir, quantidade total de "+nprod+" é:"+nqtde);
		int quantidade = to.nextInt();
		while(quantidade > nqtde) {
			System.out.println("Infelizmente só temos "+nqtde + " de "+nprod+", portanto digite um número de quantidade válido");
			quantidade = to.nextInt();
		}
		if ( nqtde == quantidade) {
			p.getProd().remove(escolha-1);	
			p.getPreco().remove(escolha-1);
			p.getQtde().remove(escolha-1);
			qtde_.add(quantidade);
		}if ( nqtde > quantidade ) {
			int resto =  nqtde - quantidade;
			qtde_.add(quantidade);
			p.getProd().remove(escolha-1);	
			p.getPreco().remove(escolha-1);
			p.getQtde().remove(escolha-1);
			p.getProd().add(nprod);	
			p.getPreco().add(npreco);
			p.getQtde().add(resto);
			
		}
		
		System.out.println(quantidade+" unidades de "+nprod+" adicionado ao carrinho! ");
		
		
		
	
	}
	


	
	

	
}

public void removeProd(){
	Scanner fo = new Scanner(System.in);
	
	System.out.println("Meu Carrinho");
	for ( int x = 0; x < produtos_.size(); x++) {
		System.out.println(x+1 +" - "+produtos_.get(x) + "\n    preço: "+ String.format("%.2f", preco_.get(x)) + " R$ | quantidade: " + qtde_.get(x));
	}
	
	System.out.println("\n Digite o número do produto que gostaria de excluir!");
	
	int escolha  = fo.nextInt();
	
	if (escolha> 0 && escolha<= produtos_.size()) {
		//Renomeio o indice para facilitar
		String nprod = produtos_.get(escolha-1);
		double npreco = preco_.get(escolha-1);
	
		int nqtde = qtde_.get(escolha-1);
		System.out.println("Digite a quantidade desse produto que gostaria de remover, quantidade total de "+nprod+" é:"+nqtde);
		int quantidade = fo.nextInt();
		while(quantidade > nqtde) {
			
			System.out.println("Infelizmente só temos "+nqtde + " de "+nprod+" para remover, portanto digite um número de quantidade válido");
			quantidade = fo.nextInt();
		}
		if (nqtde > quantidade) {
			int resto =  nqtde - quantidade;
			//Removo o produto
			produtos_.remove(escolha-1);
			preco_.remove(escolha-1);
			qtde_.remove(escolha-1); 
			// E adiciono o mesmo no final da lista com a nova quantidade
			produtos_.add(nprod);
			preco_.add(npreco);
			qtde_.add(resto);
			
			//Produtos deletados da lista de compras voltam pro catalogo
			p.getProd().add(nprod);	
			p.getPreco().add(npreco);
			p.getQtde().add(quantidade);
			
		}if ( nqtde == quantidade) {
			
			produtos_.remove(escolha-1);
			preco_.remove(escolha-1);
			qtde_.remove(escolha-1);
			
			p.getProd().add(nprod);
			p.getPreco().add(npreco);
			p.getQtde().add(quantidade);
		}
	
		System.out.println(quantidade + "unidades de "+ nprod+" excluidos do carrinho! ");
		

	}
	

	
}

public void carrinho() {
	System.out.println("\n --------------------- Meu Carrinho ---------------------- \n");
	valor_total = 0;
	for ( int x = 0; x < produtos_.size(); x++) {
		System.out.println(x+1 +" - "+produtos_.get(x) + "\n    preço: "+ String.format("%.2f", preco_.get(x)) + " R$ | quantidade: " + qtde_.get(x));
		double preco_total = preco_.get(x) * qtde_.get(x);
		valor_total = valor_total + preco_total;
	
	
	}
	System.out.print("Valor total da compra: "+ String.format("%.2f", valor_total));		
}



public double getValor_total() {
	return valor_total;
}


		
}
	

