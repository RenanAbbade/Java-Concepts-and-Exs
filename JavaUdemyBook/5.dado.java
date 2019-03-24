/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaps2;

/**
 *
 * @author 31782299
 */

import java.util.Random;

public class Dado {
    
    protected int face;
    protected Random sorteador;
    public Dado() {
            sorteador = new Random();
    }
    public void sortearFace(){
        face = sorteador.nextInt(6)+1; 
    }
    public int getFace(){
        return face;
    }
    
    
}
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaps2;

/**
 *
 * @author 31782299
 */
public class Programa {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        
        int soma = (dado1.getFace() + dado2.getFace());
        
        if(soma==11){
            System.out.println("Ganhou! soma é "+soma);
        }
        else {
            System.out.println("Perdeu, soma é "+ soma);
        }
      
        
    }
    
}
