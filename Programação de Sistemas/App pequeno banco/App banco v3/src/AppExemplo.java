public class AppExemplo {
    public static void main(String[] args) {
        PequenoBanco lista = new PequenoBanco("Banco dos Programadores Java");
        lista.adicionar(new ContaNormal(1,"Ana", 2000));
        lista.adicionar(new ContaSalario(2, "Bob", 500, "12345-0"));
        lista.adicionar(new ContaComLimite(3, "Carlos", 3000, 10000));
        lista.adicionar(new ContaNormal(4, "Daniela", 4000));
        String s = lista.toString();
        System.out.println(s);
    }
}
