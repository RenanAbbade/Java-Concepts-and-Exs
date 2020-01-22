import static javax.swing.JOptionPane.*;

public class DialogoGui {
    
    public static int lerInteiro(String msg) {
        int n = -1;
        boolean inteiro = false;
        while (!inteiro) {
            try {
                n = Integer.parseInt(showInputDialog(msg));
                inteiro = true;
            } catch(NumberFormatException ex) {
                showMessageDialog(null, "O valor deve ser um número inteiro!");
            }
        }
        return n;
    }

    public static double lerDouble(String msg) {
        double n = 0;
        boolean valido = false;
        while (!valido) {
            try {
                n = Double.parseDouble(showInputDialog(msg));
                valido = true;
            } catch(NumberFormatException ex) {
                showMessageDialog(null, "O valor deve ser um número: ");
            }
        }
        return n;
    }
    
    public static int menu(String ... opcoes) {
        int n = -1;
        boolean valido = false;
        while (!valido) {
            int cont = 1;
            String msg = ">>> MENU PRINCIPAL" + "\nOPÇÕES DISPONÍVEIS:\n";
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
                showMessageDialog(null, "Opção inválida!");
            }
        }
        return n;
    }
    
    public static String lerString(String msg) {
        String nome = showInputDialog(msg);
        return nome;
    }
    
    public static void mostrarMsg(String msg) {
        showMessageDialog(null, msg);
    }
}
