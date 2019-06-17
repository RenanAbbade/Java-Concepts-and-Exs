/*

Autor: Renan Henrique da Silva Abbade
 */
package javaapplication6;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        
        
        Scanner sc = new Scanner(System.in);
        
       
        
        Banco banco = new Banco();
        
         System.out.println("Bem vindo ao Itaú: Cadastre uma conta!"
                + "\n 1. Entre com o nome do titular da conta \n");
        
        String nomeTitular = sc.nextLine();
        
        banco.setNomeTitular(nomeTitular);
        
        System.out.println(banco.getNomeTitular()+", seu número de conta é: "+ banco.getnumConta() 
                +"\n 2.Deseja realizar um depósito inicial?"
                + "\n Digite 'SIM' ou 'NAO' ");
        
        String res = sc.nextLine();
        
        String resp = res.toUpperCase();
        
        if(resp=="SIM"){
            
            System.out.println(" \n Digite o valor do deposito inicial: \n");
            
            double valor = sc.nextDouble();
            
            banco.deposito(valor);
            
            System.out.println(banco);
            
        } else if(resp=="NAO"){
            
            banco.deposito(0);
            
            System.out.println(banco);
            
        }
        boolean bank = true;
        
        while(bank != false){
            
             System.out.println("\n Escolha a opção que deseja fazer:"
                     
                + " \n 1.Depósito "
                + "\n 2.Saque "
                + "\n 3.Mudar nome(casamento)"
                + "\n 0.Sair");
             
            int opc = sc.nextInt();
            
            switch(opc){
                
                case 1:
                    
                    System.out.println(" \n Digite o valor do deposito : \n");
                    
                    double valor = sc.nextDouble();
                    
                    banco.deposito(valor);
                    
                    System.out.println(banco);
                    
                break;
                
                case 2:
                    
                    System.out.println(" \n Digite o valor do SAQUE: \n");
                    
                    double valorSaque = sc.nextDouble();
                    
                    banco.saque(valorSaque);
                    
                    System.out.println(banco);
                    
                break;
                
                case 3:
                    System.out.println("\n Digite seu nome pós casamento: \n");
                    String novo_nomeTitular = sc.next();
                    banco.setNomeTitular(novo_nomeTitular);
                    
                    System.out.println(banco);
                   
                break;
                
                case 0:
                    
                   bank = false;
                   
                break;
   
        }
    }
        
    }
    
}

_______________________________________________________________________________________________________________________________________

/*




 */
package javaapplication6;

import java.util.Random;

/**
 *
 * @author Renan
 */ 
public class Banco {
    private String numConta;
    private String nomeTitular;
    private double Saldo;
    
    public Banco(){
        //CONSTRUTOR PADRÃO:Este construtor permite que se mantenha todos os construtores diferentes, sendo possível a 
        //utilização das diferentes versões do construtor.
    }
   
    
    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
    
    public String getNomeTitular(){
        return nomeTitular;
    }
    
    
    public String getnumConta(){
        gerarnumConta();
        return numConta;
    }
    public void deposito(double valor){
        this.Saldo = this.Saldo + valor;
    }
    
    public void saque(double valor){
        this.Saldo = this.Saldo - (valor + 5.00);
    }
    
     public void gerarnumConta(){
       //*Lógica para gerar a conta com 8 números aleatórios*
        String conta = null;
        Random sort = new Random();//Importando a classe nativa do Java Random
        for ( int i = 0; i<9; i++){
            conta = ""+ sort.nextInt(); //Concatenando inteiro com um valor String na variavel tipada em String
                                         //Ao fazer isso, concatenar String + int em uma String não obtenho erros
        }   
        String numConta = conta.substring(1,9);//Tirando o espaço vazio utilizado na criação da String de randoms "conta".
        this.numConta = numConta;
    }
    

    public String toString(){
        return " Número da conta: "
                +numConta
                +"\n Nome do titular: "
                +nomeTitular +"\n Saldo atual: "
                +Saldo;
        
    }
    
    
    
    
}

