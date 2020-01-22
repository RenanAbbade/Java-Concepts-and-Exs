package multiprocessing;

import javax.swing.JOptionPane;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread threadEmail = new Thread(thread1);//Passei a Thread Runnable como argumento, para trabalhar em forma de objeto
		
		threadEmail.start();//Startando a Thread
		
		Thread threadNF = new Thread(thread2);
		
		threadNF.start();
		
		System.out.println("Cód teste da Thread chegou ao fim");
		
		JOptionPane.showMessageDialog(null, "Outra Thread em execução");
	}
	
	//Criando a thread como   objeto manipulável e do tipo Runnable, trazendo toda a responsabilidade da Thread este método.
	private static Runnable thread1 = new Runnable() {
		//Com a Runnable podemos fazer as Threads de modo mais enxuto, e escrever as Threads em forma de objeto.
		@Override
		public void run() {//
			// TODO Auto-generated method stub
			for (int pos = 0; pos < 10 ; pos++) {
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Executando alguma rotina de email");
			}
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			for (int pos = 0; pos < 10 ; pos++) {
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("Executando alguma rotina de Nota fiscal eletronica");
			}

		}
	};

}
