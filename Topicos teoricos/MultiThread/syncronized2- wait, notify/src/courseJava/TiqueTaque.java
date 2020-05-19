package courseJava;

public class TiqueTaque {
	/*
	 * Keywords: Notify, wait e notifyAll
	 * Para evitar deadlock, ou seja que os processos fiquem paralizados
	 * pelo uso de determinado recurso estar paralizado em alguma Thread
	 * se cria a opção de liberar temporariamente o controle do objeto
	 * permitindo que outra thread seja executada neste tempo, após a outra 
	 * thread terminar de utilizar tal recurso, a mesma notifica a thread anterior
	 * informando que o recurso foi liberado, como num revezamento entre as threads.
	 * 
	 * wait(): Bloqueia a execução da thread temporariamente.
	 * notify():Notifica uma thread que estava esperando, para que a mesma retorne sua execução
	 * notifyAll():assim como o notify, porem notifica todas as threads, e a que tem prioridade mais alta é executada antes.
	 * Todas estas keywords necessitam estar dentro de um bloco syncronized para surtirem efeito
	 */
	
	boolean tique;
	
	synchronized void tique(boolean estaExec) {
		
		if(!estaExec) {
			tique = true;
			notify();
			return;
		}
		System.out.println("Tique ");
		
		tique = true;
			
		notify();//A execucao do tique terminou, e notifico a Thread responsavel pelo taqui para a mesma retormar seu processo
		try {
			while(tique) {
			
				wait();
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	synchronized void taque(boolean estaExec) {
		
		if(!estaExec) {
			tique = false;
			notify();
			return;
		}
		System.out.println("Taque ");
		
		tique = false;
			
		notify();//A execucao do tique terminou, e notifico a Thread responsavel pelo taqui para a mesma retormar seu processo
		try {
			while(!tique) {
			
				wait();
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	
}
	
	

