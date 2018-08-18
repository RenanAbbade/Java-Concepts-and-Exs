import java.util.Scanner;

/*
(utilize Scanner, for, if) Escreva um programa em Java que entre com a idade e o peso de 5
pessoas. Calcule e mostre:
• a média de idade destas 5 pessoas;
• a quantidade de pessoas com peso superior a 90 kg
 */
public class ex1 {
    public static void main (String [] args){
        int idade;
        int num;
        int i;
        double total_idade,peso;
        int ac;
        double media;
        num = 0;
        total_idade = 0;
        peso = 0;
        ac = 0;
        
        for (i=num;i<5;i++){
        System.out.println("Digite sua idade");
        Scanner entrada = new Scanner(System.in);
        idade = entrada.nextInt();
        total_idade = idade+total_idade;
        System.out.println("Digite seu peso");
        Scanner p = new Scanner(System.in);
        peso = p.nextFloat();
        if (peso>90){
            ac = ac+1;
        }         
    }
        media = total_idade/5;
        System.out.println("Idade média = "+media+" quantidade de pessoas pesando mais que 90kg = "+ac);
    }}
