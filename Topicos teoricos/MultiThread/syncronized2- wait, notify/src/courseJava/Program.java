package courseJava;

public class Program {

	public static void main(String[] args) {

		TiqueTaque tt = new TiqueTaque();
		
		ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tt);
		
		ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tt);
		
		try {
			tique.t.join();
			taque.t.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Chegar aqui, significa que as 3 threads pararam de executar");
	
		
		
	}

}
