//ENCAPSULAMENTO
/*Regras
1. Um Objeto não pode expor nenhum modificador de atributo, logo todos os atributos devem ser PRIVATE
2. Os atributos devem ser acessador por GETTERS & SETTERS
*/

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
        
      
        
        Product product = new Product(name, price); //Método construtor com parametros
        
        product.setName(name); //setName(PARAMETRO) para associar ao atributo  privado
        
        System.out.println("Produto :"+product.getName()); //getName retorna o  nome do atributo privado da classe Product
        
        product.setPrice(price);
        
        System.out.println("Produto :"+product.getPrice());
     
        System.out.println("Product data: " + product);
  ---------------------------------------------------------------------------------------
  
  public class Product {
    private String name; 
    private double price; 
    private int quantity;
    
    
    //Palavra THIS: o THIS referencia o atributo da classe, enquanto o atributo 
    //sem THIS faz referencia ao atributo que vem de fora
    // na chamada do método
    public Product(){
        //CONSTRUTOR PADRÃO:Este construtor permite que se mantenha todos os construtores diferentes, sendo possível a 
        //utilização das diferentes versões do construtor.
    }
   
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        
    }
    //SOBRECARGA: Se resume em disponibilizar mais de uma versão da mesma operação, a diferença entre elas é a lista de parametros
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public void setName(String name){ //Recebe o parametro do metodo para o associar a um atributo da classe
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
