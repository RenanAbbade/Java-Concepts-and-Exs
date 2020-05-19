package courseJava;

public class Program {

	public static void main(String[] args) {
	
		//Utilizando interface Runnable 
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 1000);
		MinhaThreadRunnable thread2= new MinhaThreadRunnable("#2", 3232);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 100);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		
		t2.start();
		t3.start();
		
		try { //O join espera a execução da Thread t1, para depois continuar o codigo
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/* Primeira forma de checar se o programa terminou
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {//Verifico se as Threads criadas aidna estão processando, enquanto estiverem processando:
			try {
				Thread.sleep(1000);//Se estiverem processando, a Thread do programa principal irá ter um sleep.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		System.out.println("Chegar aqui, significa que as 3 threads pararam de executar");
	
		
		
	}

}
