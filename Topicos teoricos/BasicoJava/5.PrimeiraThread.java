package multiprocessing;

import javax.swing.JOptionPane;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new Thread() {//Criando a nova thread
			
			public void run() {//Executa o que queremos
				/*Código da rotina*/
				
				for (int pos = 0; pos < 10 ; pos++) {
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Executando alguma rotina");
				}
				/*Fim do código paralelo*/
			}
			
		}.start();//Start liga a Thread que fica processando paralelamente
		
new Thread() {//Criando a nova thread
			
			public void run() {//Executa o que queremos
				/*Código da rotina*/
				
			System.out.println("Outra Thread rodando");
			}
			
		}.start();//Start liga a Thread que fica processando paralelamente
		
	
		
		System.out.println("Cód teste da Thread chegou ao fim");
		
		JOptionPane.showMessageDialog(null, "Outra Thread em execução");
	}

}
