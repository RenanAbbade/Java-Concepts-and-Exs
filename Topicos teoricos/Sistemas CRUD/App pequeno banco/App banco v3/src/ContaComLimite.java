

public class ContaComLimite extends ContaAbstrata {
    protected double limite;
    
    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo+limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    @Override
    public void depositar(double valor) { saldo += valor; }
    
    public ContaComLimite() {}
    public ContaComLimite(int numero, String nome, double saldo, double limite) {
        super(numero, nome, saldo);
        this.limite = limite;
    }
    
    @Override
    public String toString() {
        return "ContaComLimite: [" + super.toString() +", limite="+limite+"]";
    }
    public void aumentarLimite(double valor) {
        limite += valor;
    }
}