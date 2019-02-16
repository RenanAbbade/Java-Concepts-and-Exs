import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    System.out.println("Digite uma palavra");
    Scanner sc = new Scanner(System.in);
    /* Receber o que o usuário digitar até a quebra de linha */
    String sentence = sc.nextLine();
    String x,y,z;/*Em uma linha pegar as variaveis*/
    x = sc.next();
    y = sc.next();
    z = sc.next();

    System.out.println(sentence);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

    x = sc.next();
    y = sc.next();
    z = sc.next();
    System.out.println(x);
    System.out.println(y);
    System.out.println(z); /*Lendo palavras com variaveis diferentes na mesma linha */
    


    sc.close(); /*Para fechar a variavel */
  }
}
