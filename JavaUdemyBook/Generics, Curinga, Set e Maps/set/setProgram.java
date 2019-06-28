package set;

import java.util.HashSet;
import java.util.Set;

public class setProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//É um tipo generico igual a lista, e representa um conjunto de elementos
		//Os elementos não possuem uma posição
		//Acesso, inserção e remoção de elementos são rapidos
		//Oferece Inseterseção, união, diferença
		//Implementações: HashSet, TreeSet, LinkedHashSet
		//HashSet: Mais rapido, e não ordenado
		//TreeSet: Mais lento, e ordenado pelo compareTo
		//Velocidade mediana e elementos na ordem que são adiconados
		//-------------Métodos-------------
		//clear(), size(), removeif(predicate)
		//addAll(other) ->União:Adiciona num conjunto, elementos de outro
		//retainAll(other) -> interseção: remove do conjunto os elementos não contidos em other
		//removeAll(other) -> diferença: remove do conjunto os elementos contidos em other
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.removeIf(x -> x.length() >= 3);
		// -> significa "tal que"
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
		
	}

}
