/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Locale;
import static java.util.Locale.setDefault;
import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de estudantes, no máximo 10 para 10 quartos: \n");
        int n = sc.nextInt();
        int num;
        
    
   
     
         Estudante[] vect = new Estudante[10]; // Tipo do vetor é estudante, com n elementos
         
         
        
        for (int i=0; i< 2; i++){
            sc.nextLine();
      
            System.out.println("Digite o nome do estudante: \n");
            String nome = sc.nextLine();
            
            System.out.println("Digite o email do estudante: \n");
            String email = sc.nextLine();
            
            System.out.println("Digite o número do quarto estudante, de 1 a 10: \n");
            num = sc.nextInt();
            
            while( vect[num-1] != null){
                System.out.println("Digite o número do quarto estudante, de 1 a 10 e que não esteja ocupado \n");
                
                num = sc.nextInt();
            }

            vect[num-1] = new Estudante(nome, email, num); 
            
                
        }
        for(int i=0; i<vect.length; i++){
            if (vect[i] != null){
                 System.out.println(vect[i].getQuarto()+":"+vect[i].getName()+" -  email: "+vect[i].getEmail()+"\n");  
            }
           
        
    }
    
    
    }
    
    
}
----------------------------------------------------------------------------------------------------------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Renan
 */
public class Estudante {
    private String nome;
    private String email;
    private int num;
    
    public Estudante(String nome, String email, int num){
        this.nome = nome;
        this.email = email;
        this.num = num;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public int getQuarto(){
        return num;
    }
   

   
    
}
    
    

