/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Renan
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> list = new ArrayList<>();
        
        list.add("Renan");
        list.add("Junior");
        list.add("Thiaguinho");
        list.add(1, "Otaviano"); // Adc por index
        
        System.out.println(list.size()); //Tamanho da lista
        
        
       
        for ( String x: list ){
            System.out.println(x);
        }
         System.out.println("-------");
         list.removeIf(x -> x.charAt(0) == 'J'); //Quero remover todo String x tal que x.chatAt(0) seja igual a M
         list.remove("Renan"); //Removendo por comparação valor
         list.remove(0); //Removendo por Index
         List<String> result = list.stream().filter(x.charAt(0) == 'A').collect(Collectors.toList()); //Filtrando pelos nomes começados com A
        for ( String x: list ){
            System.out.println(x);
        }
        System.out.println("Index of Thiaguinho:"+list.indexOf("Thiaguinho"));
        
        
    }
    
}
