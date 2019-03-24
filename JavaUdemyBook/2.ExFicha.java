public class Ficha1 {
    
    public static void main (String [] args) {
    
       /* declara��o das vari�vies */
    double montante;
    double taxa;
    double renda;
        
       /* processamento */
    montante = 17000;
    taxa = 0.07;
    renda = montante * taxa;
    montante = montante + renda;

       /* sa�da dos resultados */
    System.out.print("A renda obtida = ");
    System.out.printf("%.2f",renda);
    System.out.println();
    System.out.print("Valor do investimento ap�s 1 ano = ");
    System.out.printf("%.2f",montante);
    } // fim da main()

} // fim da classe Ficha1





