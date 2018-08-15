import java.util.Scanner;
public class NewClass1 {
public static void main (String[] args) {
int diasem; //armazena o dia da semana
while (true){
// o trecho será repetido um número indefinido de vezes
System.out.println("Informe o dia da semana: ");
System.out.println("1=Domingo / 2=segunda / etc. ");
System.out.println("Digite 0 para encerrar");
Scanner ent = new Scanner (System.in);
diasem = ent.nextInt();
if (diasem == 0)
break; // saída do looping
switch (diasem) {
case 1:
System.out.println("Hoje tem Fantastico");
break;
case 2:
System.out.println("Que preguiça...");
break;
case 3:
System.out.println("Esta chegando a metade...");
break;
case 4:
System.out.println("Posso ver a luz no fim do tunel");
break;
case 5:
System.out.println("Agora sim!");
break;
case 6:
System.out.println("M-A-R-A-V-I-L-H-A");
break;
case 7:
System.out.println("Ufa! Chegou o sábado!");
break;
default:
System.out.println("Dia inválido!!");
break;
} // fim do switch
System.out.println();
} // fim do while
System.out.println("Tchau!");
} //fim da main()
} // fim da classe Teste1