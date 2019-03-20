/*
 Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária,
mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque 
for superior ao limite de saque da conta. Implemente a conta bancária conforme projeto abaixo:
 */
package javaapplication20;
import model.DomainException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter account data \n"
                    + "Number: ");
            int number = sc.nextInt();
            
            System.out.println("Now, enter the account Holder: ");
            String holder = sc.next();
            
            System.out.println("Enter the initial balance: ");
            double balance = sc.nextDouble();
            
            System.out.println("Finnaly, enter with the with draw limit: ");
            double withDrawLimit = sc.nextDouble();
            
            Account account = new Account(number, holder, balance, withDrawLimit);
            
            System.out.println("Enter the value for withdraw: ");
            double value = sc.nextDouble();
            
            account.WithDraw(value);
            
            System.out.println(account.toString());
            
        }catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid type");
        }
        
        sc.close();
            
        
    
}
    
}
