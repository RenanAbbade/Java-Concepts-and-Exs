package courseJava;

public class Program {//Deadlock
	
	

	public static void main(String[] args) {

		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";
		
		//classe anonima
		Thread t1 = new Thread() {
			public void run() {
				synchronized (RECURSO1) {//Bloqueamos o recurso 1 só para esta Thread usar este recurso
					System.out.println("A Thread#1 bloqueou o recurso 1");
				
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread#1: tentando o acesso ao recurso #2");
					
					synchronized (RECURSO2) {
						
						System.out.println("Thread#1 bloqueou recurso 2");
						
					}
				
				
				
				}
			}
		};
		
		//classe anonima
				Thread t2 = new Thread() {
					public void run() {
						synchronized (RECURSO2) {//Bloqueamos o recurso 1 só para esta Thread usar este recurso
							System.out.println("A Thread#2 bloqueou o recurso 2");
						
							try {
								Thread.sleep(100);
							}catch(InterruptedException e) {
								e.printStackTrace();
							}
							
							System.out.println("Thread#1: tentando o acesso ao recurso #2");
							
							synchronized (RECURSO1) {
								
								System.out.println("Thread#2 tentando o acesso ao recurso #1");
								
							}
						
						
						
						}
					}
				};
				
				t1.start();
				t2.start();
		
		
		
		
	}

}
