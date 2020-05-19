public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinhaThread thread = new MinhaThread("#1", 600);
		
		//thread.start();//Chamamos o método start, que executa o método run da classe da Thread

		MinhaThread thread2 = new MinhaThread("#2",3000);
	}

}

//another class in the same package

package courseJava;

public class MinhaThread extends Thread {
	//Para ser uma Thread, deve herdar do pacote java.lang.Thread
	//Para uma Thread conseguir ser executada, é necessário implementar o método run
	private String nome;
	
	private int tempo;
	
	public MinhaThread(String nome) {
		this.nome = nome;
		//Para não ter o trabalho de intanciar o método start que executa o método Run na classe program, faremos no constructor
		
		start();
	}
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		//Para não ter o trabalho de intanciar o método start que executa o método Run na classe program, faremos no constructor
		
		start();
	}

	@Override
	public void run() {
		
			try {
				for(int i = 0; i<6;i++) {
					System.out.println("Executando a Thread."+nome+"+ count: "+i);
				Thread.sleep(tempo);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
}

