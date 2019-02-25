
import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.Date;

import java.util.List;

import java.util.Locale;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Product> list = new ArrayList<>();
        
        System.out.print("Entre com o número dos produtos: ");
        
        int n = sc.nextInt();
        
        for( int i = 1; i< n+1; i++){
            sc.nextLine();
            System.out.println("Produto #"+i+": \n "
                    + "O produto é comum, usado ou importado (C/U/I)? ");
            char estadProd = sc.next().charAt(0);
            System.out.println("Digite o nome do produto: ");
            String nome = sc.next();
            System.out.println("Digite o preço do produto: ");
            Double preco = sc.nextDouble();
            if (estadProd == 'C'){
                list.add(new Product(nome, preco));
            }
            else if(estadProd == 'U'){
                System.out.print("Digite a data de manufatura:(DD/MM/YYYY): ");
                Date date  = sdf.parse(sc.next());
                list.add(new UsedProduct(nome,  preco,  date));
            }
            else{
                System.out.print("Digite a Taxa de envio: ");
                Double taxa = sc.nextDouble();
                list.add(new ImportedProduct(nome, preco, taxa));
            }
            
            
        }
        for (Product prod: list){
                System.out.println(prod.toString());
            }
        
    }
    
}
-----------------------------------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class Product {
    private String name;
    private Double price;
    
    public Product(){
        
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PRICE TAGS \n"+ name +" R$"+price;
    }
   
    
    
    
    
}
-----------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class ImportedProduct extends Product {
    private Double customsFee;
    

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

   

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
     @Override
    public String toString() {
        return "PRICE TAGS \n"+ super.getName() +" R$"+super.getPrice() +"(Custom Fee): "+customsFee;
    }
    
}
-----------------------------------

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
public class UsedProduct extends Product {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	

	private Date manufactureDate;

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct( String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }
    
    

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "PRICE TAGS \n"+ super.getName() +" R$"+super.getPrice() +"(Used Product Date): "+manufactureDate;
    }
    
    

   
    
    
}
