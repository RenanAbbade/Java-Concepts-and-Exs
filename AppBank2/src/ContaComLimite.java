

public class ContaComLimite extends ContaAbstrata {
    private double limite;
    
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
    public ContaComLimite(int numero, String c, double s, double l) {
        super(numero, c, s);
        this.limite = l;
    }
    
    @Override
    public String toString() {
        return "ContaComLimite: [" + super.toString() +", limite="+limite+"]";
    }
    public void aumentarLimite(double valor) {
        limite += valor;
    }
}