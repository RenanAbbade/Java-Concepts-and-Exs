package courseJava;

public class Calculadora {
	
	private int soma;
	
	
	//Adicionando syncronized, eu faço com que as Threads só alterem o valor referente a eles mesmas, e não as variaveis utilizadas por as demais threads
	public synchronized int somaArray(int[] array) {
		soma = 0;
		
		for(int i = 0; i < array.length; i++) {
			soma += array[i];
			
			System.out.println("Executando a soma: "+Thread.currentThread().getName()+
					" somando o valor: "+array[i] + " com " + soma);//Quero saber qual a thread atual que esta acessando meu pool de recursos compartilhados
		}
		
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		return soma;
		
	}

}
