package courseJava;

public class Program {

	public static void main(String[] args) {
		
		/*Sincronização é o ato de coordenar as atividades de duas ou mais threads.
				Motivo: Quando duas ou mais Threads precisam acessar recursos compartilhados, ou somente 1 thread pode acessar o recurso por vez.
	No java se utiliza a palavra syncronized, para garantir que somente uma Thread irá acessar aquele recurso por vez
	Ou seja, definimos qual o recurso que pode ser compartilhado e acessado pelas Threads.
	*/
		int[] array = {1,2,3,4,5};
		//Utilizando interface Runnable 
		MinhaThreadSoma thread1 = new MinhaThreadSoma("#1", array);
		MinhaThreadSoma thread2= new MinhaThreadSoma("#2", array);
		MinhaThreadSoma thread3 = new MinhaThreadSoma("#3", array);
		
		
		System.out.println("Chegar aqui, significa que as 3 threads pararam de executar");
	
		
		
	}

}
