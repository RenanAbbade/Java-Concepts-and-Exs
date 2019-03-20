

public class ContaSalario extends ContaAbstrata {
    private String cnpjContratante;
    private int numSaques = 0;
    public static final int NUM_MAX_SAQUES = 3;
    public ContaSalario() {}
    public ContaSalario (int n, String correntista, double saldo, String cnpj) {
        super(n, correntista, saldo);
        cnpjContratante = cnpj;
    }
    @Override
    public boolean sacar(double valor) {
        if (numSaques >= NUM_MAX_SAQUES) {
            return false;
        }
        if (valor > saldo) {
            return false;
        }
        saldo -= valor;
        numSaques++;
        return true;
    }
    @Override
    public void depositar(double valor) {
        numSaques = 0;
        saldo += valor;
    }
    @Override
    public String toString() {
        return "ContaSalario: [" + super.toString() + ", cnpj=" + cnpjContratante
                   + ", numSaques=" + numSaques + "]";
    }
    public void setCnpjContratante(String cnpj) {
        cnpjContratante = cnpj;
    }
}