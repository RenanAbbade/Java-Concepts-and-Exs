
public class AppPequenoBanco {

    private static PequenoBanco banco;

    public static void main(String[] args) {
        banco = new PequenoBanco("Banco dos Programadores Java");
        menuPrincipal();
        System.out.println("\n>> Obrigado por usar este banco!");
    }

    private static void menuPrincipal() {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n>> MENU PRINCIPAL");
            int opcao = Dialogo.menu("Criar conta normal",
 "Criar conta com limite","Criar Conta Salario","Depositar valor em todas as contas","Aumentar limite de todas as contas","Mostrar informações do banco",
                    "Sair");

            if (opcao == 1) {
                criarContaNormal();

            } else if (opcao == 2) {
                criarContaLimite();

            } else if (opcao == 3) {
                System.out.println("\n>> INFORMAÇÕES DO BANCO:");
                criarContaSalario();

            } else if (opcao == 4) {
                 System.out.println("\n>> CRIAÇÃO DE CONTA SALARIO");
                int valor = Dialogo.lerInteiro("Digite o valor a ser depositado em todas as contas");
                banco.depositarEmTodos(valor);

            } else if (opcao == 5) {
                System.out.println("\n>> Depositar valor em todas as contas! \n ");
                System.out.println("Qual valor deseja depositar?");
                int valor = Dialogo.lerInteiro("Qual valor deseja depositar?");
                banco.aumentarTodasComLimite(valor);

            } else if (opcao == 6) {
                System.out.println("\n>> INFORMAÇÕES DO BANCO:");
                System.out.println(banco);

            } else if (opcao == 7) {
                sair = true;

            }
        }
    }

    private static void criarContaSalario() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = Dialogo.lerInteiro("Número da conta: ");
        String nome = Dialogo.lerString("Nome do correntista: ");
        double saldo = Dialogo.lerDouble("Saldo da conta: ");
        String cnpj = Dialogo.lerString(("CNPJ: "));
        ContaSalario c = new ContaSalario(num, nome, saldo, cnpj);
        banco.adicionar(c);
    }

    private static void criarContaLimite() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = Dialogo.lerInteiro("Número da conta: ");
        String nome = Dialogo.lerString("Nome do correntista: ");
        double saldo = Dialogo.lerDouble("Saldo da conta: ");
        double limite = Dialogo.lerDouble(("Limite da conta: "));
        ContaComLimite c = new ContaComLimite(num, nome, saldo, limite);
        banco.adicionar(c);
    }

    private static void criarContaNormal() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = Dialogo.lerInteiro("Número da conta: ");
        String nome = Dialogo.lerString("Nome do correntista: ");
        double saldo = Dialogo.lerDouble("Saldo da conta: ");
        ContaNormal c = new ContaNormal(num, nome, saldo);
        banco.adicionar(c);
    }
}
