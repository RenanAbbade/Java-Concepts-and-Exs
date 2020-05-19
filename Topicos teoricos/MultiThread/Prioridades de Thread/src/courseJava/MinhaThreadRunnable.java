package courseJava;

public class MinhaThreadRunnable implements Runnable {
	//Para ser uma Thread, deve herdar do pacote java.lang.Thread
	//Para uma Thread conseguir ser executada, é necessário implementar o método run
	private String nome;
	
	private int tempo;
	
	public MinhaThreadRunnable(String nome) {
		this.nome = nome;
		//Para não ter o trabalho de intanciar o método start que executa o método Run na classe program, faremos no constructor
		
		
	}
	
	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		//Para não ter o trabalho de intanciar o método start que executa o método Run na classe program, faremos no constructor
	
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

