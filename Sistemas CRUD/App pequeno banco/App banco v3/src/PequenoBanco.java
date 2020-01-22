
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

    public void depositarEmTodos(double valor) {

        for (ContaAbstrata conta : contas) {
            conta.saldo = conta.saldo + valor;

        }
    }

    public void aumentarTodasComLimite(double valor)  {
        for (ContaAbstrata conta : contas) {
            ContaComLimite new_Limite = (ContaComLimite) conta;
             new_Limite.aumentarLimite(valor);

        }

    }

    @Override
    public String toString() {
        String msg = ">> Contas do " + nome + "\n";
        if (contas.isEmpty()) {
            msg += "Este banco ainda não tem nenhuma conta!\n";
        }
        for (ContaAbstrata c : contas) {
            msg += c + "\n";
        }
        return msg;
    }
}
