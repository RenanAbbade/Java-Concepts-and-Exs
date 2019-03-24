public class MyClass {
    
    public static void main(String args[]) {
     		
      		char gender = 'F';
      		int age = 32;
      		double balance = 10.35784;
      		String name = "Maria";
      
      		
      		System.out.print("Good Morning!"); /*Printa na mesma linha */
      		System.out.println("Good Afternoon!"); /*Printa na linha de baixo */
      		System.out.println("--------------"); 
      		System.out.printf("%.2f%n", balance); /*Printa formatado por casas decimais, o número indica o número de casas decimais*/
    		System.out.printf("%.0f%n", balance); /* %n para imprimir na linha de baixo */
    		System.out.println("--------------");
      		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n ",name,age,gender,balance); /*"%s" Substitui uma variavel String no print, e %d substitui a variavel int no print */
      
    }   
}
