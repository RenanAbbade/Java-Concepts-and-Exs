import static java.lang.System.out;
import java.util.Scanner;

public class Dialogo {
    private static Scanner sc = new Scanner(System.in);
    
    public static int lerInteiro(String msg) {
        int n = -1;
        boolean inteiro = false;
        while (!inteiro) {
            try {
                out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                inteiro = true;
            } catch(NumberFormatException ex) {
                out.println("O valor deve ser um número inteiro!");
            }
        }
        return n;
    }

    public static double lerDouble(String msg) {
        double n = 0;
        boolean valido = false;
        while (!valido) {
            try {
                out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                valido = true;
            } catch(NumberFormatException ex) {
                out.print("O valor deve ser um número: ");
            }
        }
        return n;
    }
    
    public static int menu(String ... opcoes) {
        int n = -1;
        boolean valido = false;
        while (!valido) {
            int cont = 1;
            String msg = "OPÇÕES DISPONÍVEIS:\n";
            for (String opcao: opcoes) {
                msg += "(" + cont + ") " + opcao + "\n";
                cont++;
            }
            msg += "\nSelecione uma opção: ";
            n = lerInteiro(msg);
            if (n >= 1 && n < cont) {
                valido = true;
            }
            else {
                out.println("Opção inválida!");
            }
        }
        return n;
    }
    
    public static String lerString(String msg) {
        out.print(msg);
        String nome = sc.nextLine();
        return nome;
    }
    
}
