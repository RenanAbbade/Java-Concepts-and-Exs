/*
 Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária,
mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque 
for superior ao limite de saque da conta. Implemente a conta bancária conforme projeto abaixo:
 */
package javaapplication20;
import model.DomainException;
/**
 *
 * @author Renan
 */
public class Account {
    
    private int number;
    private String holder;
    private double balance;
    private double withDrawLimit; // limite de saque
    
    public Account(int number, String holder, double balance, double withDrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
    
    public double Deposit(double value){
        return balance += value;
    }
    
    public double WithDraw(double value){
        if (value > withDrawLimit){
            throw new DomainException("value for withDraw needs to be lower then WithDraw Limit");
        }
         if (value > balance){
            throw new DomainException("value needs be lower than initial balance");
        }
        return withDrawLimit -= value;
    }
    
    @Override
    public String toString(){
        return " Account: "+
                number+
                "\n Holder: "+
                holder+
                "\n balance: "+
                balance+
                "\n with draw: "+
                withDrawLimit;
    }
    
}
