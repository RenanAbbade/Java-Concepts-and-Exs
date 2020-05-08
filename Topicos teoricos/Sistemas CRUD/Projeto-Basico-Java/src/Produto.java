import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	public static List<String> produtos = new ArrayList<>();
	public static List<Double> preco = new ArrayList<>();
	public static List<Integer> qtde = new ArrayList<>();
	
	public void catalogo() {
		produtos.add("GARRAFA DE ÁGUA 1L BONAFONTE");
		preco.add(2.00);
		qtde.add(50);
		
		produtos.add("BARRA DE CHOCOLATE SHOT");
		preco.add(5.50);
		qtde.add(10);
		

		produtos.add("REFRIGERANTE COCA-COLA 2L");
		preco.add(8.0);
		qtde.add(15);
		
		produtos.add("Cookie's da Bauduco");
		preco.add(3.50);
		qtde.add(20);
		
		produtos.add("Leite integral 2L");
		preco.add(4.00);
		qtde.add(18);
	}
	
	public void catalogoShow() {
		System.out.println("\n --------------------- CATALOGO ---------------------- \n");

		for ( int x = 0; x < produtos.size(); x++) {
			System.out.println(x+1 +" - "+produtos.get(x) + "\n    preço: "+ String.format("%.2f", preco.get(x)) + " R$ | quantidade: " + qtde.get(x));
				

	}}
	
		
		
		
	
	 public List<String> getProd(){
	      return produtos; 

}
	 public List<Double> getPreco(){
	      return preco; 

}
	 public List<Integer> getQtde(){
	      return qtde; 

}
}