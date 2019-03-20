

import java.util.ArrayList;
import java.util.List;

public class PequenoBanco {
    private List<ContaAbstrata> contas;
    private String nome;

    public PequenoBanco(String n) {
        nome = n;
        contas = new ArrayList<>();
    }
    
    public void adicionar(ContaAbstrata conta) {
        contas.add(conta);
    }
    
    public void adicionar(List<ContaAbstrata> lista) {
        for (ContaAbstrata conta: lista) {
            contas.add(conta);
        }
    }
    
    public void removerTodasContas() {
        contas.clear();
    }
    
    public List<ContaAbstrata> obterTodasContas() {
        return contas;
    }
    
    @Override
    public String toString() {
        String msg = ">> Contas do " + nome + "\n";
        if (contas.isEmpty()) {
            msg += "Este banco ainda não tem nenhuma conta!\n";
        }
        for (ContaAbstrata c: contas) {
            msg += c + "\n";
        }
        return msg;
    }
}
