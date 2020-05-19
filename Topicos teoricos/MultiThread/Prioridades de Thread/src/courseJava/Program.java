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
	
		//Prioridades das Threads
		
		t1.setPriority(1);
		t2.setPriority(6);
		t3.setPriority(10);
		
		System.out.println("Chegar aqui, significa que as 3 threads pararam de executar");
	
		
		
	}

}
