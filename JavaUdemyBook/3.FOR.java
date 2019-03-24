public class NewClass {
    
    public static void main (String [] args) {
        
       int i;
       int par;
       par = 0;
       
       for (i=10; i>0;i--){
       
       if (i % 2 == 0){
           par++;
           continue;
           
       }
      
       System.out.println("Número de pares"+par);
       
       
        
        
       }}}
    
public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva quantos números deseja ter na soma ");
		int num = sc.nextInt();
		
		int  soma = 0;
		
		for(int i = 1; i <= num;i++) {
			System.out.print("valor #"+i+":");
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		sc.close();
		
		
	}
	}

