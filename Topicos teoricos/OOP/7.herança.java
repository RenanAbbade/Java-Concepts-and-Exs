/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
package javaapplication15;
public class conta {
    
    private Integer numero;
    private String nome;
    protected Double saldo; //para ser acessado pelas subclasses
    
    public conta(){
        
    }
    
    public conta( Integer numero, String nome, Double saldo){
        
    }
    
    public Integer getNumero(){
        return numero;
    }
    public String getNome(){
        return nome;
    }
    public Double getSaldo(){
        return saldo;
    }
    public void setNumero(){
        this.numero = numero;
    }
    public void setNome(){
        this.nome = nome;
    }
    
    public void deposit(double deposito){
        saldo = saldo + deposito;
    }
    public void saque(double saque){
        saldo = saldo - saque;
    }
    
  
    }


-------------------------------------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renan
 */
package javaapplication15;
public class ContaNegocios extends conta {
    
    private Double limiteEmprestimo;
    
    public ContaNegocios(){
        super(); //Para o caso de colocar alguma lógica no construtor padrão da classe conta, e essa lógica ser exexutada nas classes filhas.
    }
    public ContaNegocios(Integer numero, String nome, Double saldo, Double limiteEmprestimo){
        super(numero,  nome,  saldo); //Implementação do Construtor da super classe, neste caso não é necessário usar o this para os primeiros argumentos
        //Logo o super é necessário para executar a lógica herdada da classe mãe
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public Double getLimiteEmprestimo(){
        return limiteEmprestimo;
    }
    
    public void setLimiteEmprestimo(){
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public void Emprestimo(double deposito){
        if (deposito <= limiteEmprestimo){
            saldo = saldo + deposito - 10;//taxa
        }
    }

    @Override
    public String toString() {
        return "ContaNegocios{" + "limiteEmprestimo=" + limiteEmprestimo + '}';
    }
    
    
    
}

