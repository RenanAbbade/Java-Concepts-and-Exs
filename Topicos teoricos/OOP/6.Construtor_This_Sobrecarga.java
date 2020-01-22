package javaapplication5;
import java.util.Locale; import java.util.Scanner;
import entities.Product;
public class Program { public static void main(String[] args) { 
    
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter product data: "); 
        System.out.print("Name: "); 
        // Crio as variaveis que irão ser empregadas no método construtor, devem ser as mesmas dos atributos da classe 
        //do metodo construtor product
        String name = sc.nextLine(); 
        
        System.out.print("Price: "); 
        double price = sc.nextDouble(); 
        
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        
        Product product = new Product(name, price, quantity); //Método construtor com parametros
     
        System.out.println("Product data: " + product);
  
        System.out.print("Enter the number of products to be added in stock: "); 
        quantity = sc.nextInt(); 
        
        product.addProducts(quantity);
        System.out.println(); 
        
        System.out.println("Updated data: " + product);
        System.out.println(); 
        
        System.out.print("Enter the number of products to be removed from stock: "); 
        quantity = sc.nextInt(); 
        
        product.removeProducts(quantity);
        
        System.out.println(); 
        System.out.println("Updated data: " + product);
        sc.close();
}
}

___________________________________________________________________________________________________________________________________
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Renan
 */
public class Product {
    public String name; 
    public double price; 
    public int quantity;
    
    
    //Palavra THIS: o THIS referencia o atributo da classe, enquanto o atributo 
    //sem THIS faz referencia ao atributo que vem de fora
    // na chamada do método
    
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        
    }
    
    public double totalValueInStock() { 
        return price * quantity; 
    }
    public void addProducts(int quantity) { 
        this.quantity += quantity; 
    }
    public void removeProducts(int quantity) { 
        this.quantity -= quantity; 
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock()); 
    }
    
}


