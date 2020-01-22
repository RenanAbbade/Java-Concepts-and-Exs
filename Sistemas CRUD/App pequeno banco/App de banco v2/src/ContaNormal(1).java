

public class ContaNormal extends ContaAbstrata {
    public ContaNormal() {}
    public ContaNormal(int numero, String correntista, double saldo) { 
        super(numero, correntista, saldo);
    }
    @Override
    public void depositar(double valor) { saldo += valor; }
    @Override
    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }
    @Override
    public String toString() {
        return "ContaNormal: [" + super.toString() +"]";
    }
    
}
    