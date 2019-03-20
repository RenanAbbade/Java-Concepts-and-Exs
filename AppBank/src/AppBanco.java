
public class AppBanco {
    private static PequenoBanco banco;
    
    public static void main(String[] args) {
        banco = new PequenoBanco("Banco dos Programadores Java");
        menuPrincipal();
        DialogoGui.mostrarMsg("\n>> Obrigado por usar este banco!");
    }

    private static void menuPrincipal() {
        boolean sair = false;
        while (!sair) {
            int opcao = DialogoGui.menu("Criar conta normal", 
                                     "Criar conta com limite",
                                     "Criar conta-salário",
                                     "Mostrar informações do banco",
                                     "Sair");
            if (opcao == 1) {
                criarContaNormal();
            }
            else if (opcao == 2) {
                criarContaComLimite();
            }
            else if (opcao == 3) {
                criarContaSalario();
            }
            else if (opcao == 4) {
                String s = "\n>> INFORMAÇÕES DO BANCO:\n" + banco;
                DialogoGui.mostrarMsg(s);
            }
            else if (opcao == 5) {
                sair = true;
            }
        }        
    }
    
    private static void criarContaNormal() {
        System.out.println("\n>> CRIAÇÃO DE CONTA NORMAL");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        ContaNormal c = new ContaNormal(num, nome, saldo);
        banco.adicionar(c);
    }
    private static void criarContaComLimite() {
        System.out.println("\n>> CRIAÇÃO DE CONTA COM LIMITE");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        double limite = DialogoGui.lerDouble("Limite da conta: ");
        ContaComLimite c = new ContaComLimite(num, nome, saldo, limite);
        banco.adicionar(c);
    } 
    private static void criarContaSalario() {
        System.out.println("\n>> CRIAÇÃO DE CONTA-SALÁRIO");
        int num = DialogoGui.lerInteiro("Número da conta: ");
        String nome = DialogoGui.lerString("Nome do correntista: ");
        double saldo = DialogoGui.lerDouble("Saldo da conta: ");
        String cnpj = DialogoGui.lerString("CNPJ da empresa contratante: ");
        ContaSalario c = new ContaSalario(num, nome, saldo, cnpj);
        banco.adicionar(c);
    }      
}
