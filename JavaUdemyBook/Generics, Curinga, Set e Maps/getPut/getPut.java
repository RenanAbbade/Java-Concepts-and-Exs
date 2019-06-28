package getPut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getPut {
//Static serve para referenciar atributos/metodos de classe que podem ser acessados diretamente da mesma classe sem necessidade de instancia
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GET & PUT: Covariancia */
		
		List <Object> myObjs = new ArrayList<Object>();
		List <Double> myDoubles = new ArrayList<Double>();
		List <Integer> myInts = new ArrayList <Integer>();
		myInts = Arrays.asList(1,2,34,5);
		myDoubles = Arrays.asList(11.0,22.5,34.2,5.0);
		
		List<? super Number> myNums = myObjs; 
//		A lista myNumbs, de qualquer tipo(Coringa) super number 
//		Pode ser uma lista de Number, ou qualquer super tipo de Number(Object)
// 		Porém nesse caso a lista não tem a função .add 
		
		//Para isso, iremos criar uma função que copia uma lista numa outra supertipada
		
		copy (myInts, myObjs);
		printList(myObjs);
		copy (myDoubles, myObjs);
		printList(myObjs);

	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		//Este método copia os valores de uma lista não genérica em outra genérica, copia de uma lista que herda de Number, e cola numa lista Destino de tipo mais generico ou tanto quanto de Number
		for (Number number : source) {//foreach variavel do tipo Number percorre a lista não tão generica
			destiny.add(number);//Adiciono os elementos da primeira lista, na lista generica destino
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj: list) {
			System.out.print(obj + " ");//Printo os elementos da list que veio como argumento
		}
		
		System.out.println();
	}

}
