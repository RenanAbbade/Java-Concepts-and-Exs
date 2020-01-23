package multiprocessing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Paralelismo.ImplementacaoFilaThread;
import Paralelismo.ObjetoFilaThread;

public class TelaTimeThread extends JDialog {

	private JPanel jpanel = new JPanel(new GridBagLayout());// Painel de componentes

	private JLabel descricaoHora = new JLabel("Nome:");

	private JTextField mostraTempo = new JTextField();

	private JLabel descricaoHora2 = new JLabel("E-mail:");

	private JTextField mostraTempo2 = new JTextField();

	private JButton jButton = new JButton("Adicionar");

	private JButton jButton2 = new JButton("Stop");

	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	public TelaTimeThread() {
		/* Configuraçoes iniciais JavaSwing */
		setTitle("Minha tela com Thread");

		setSize(new Dimension(240, 240));

		setLocationRelativeTo(null);

		setResizable(false);
		/*--------------------------------*/
		GridBagConstraints gridBagConstraints = new GridBagConstraints();// Controlador de pos. de componentes

		gridBagConstraints.gridx = 0;

		gridBagConstraints.gridy = 0;

		gridBagConstraints.gridwidth = 2;

		gridBagConstraints.insets = new Insets(5, 10, 5, 5);

		gridBagConstraints.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jpanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;// Adicionando uma nova linha para o Text Field
		jpanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jpanel.add(mostraTempo2, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jpanel.add(jButton, gridBagConstraints);

		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jpanel.add(jButton2, gridBagConstraints);

		jButton.addActionListener(new ActionListener() {// Será executado quando o botão for clicado.

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if( fila == null) {
					
					fila = new ImplementacaoFilaThread();
					
					fila.start();
				}
				
				
				for (int quantidade = 0; quantidade < 100; quantidade++) {
					//Simulando 100 envios em massa
					
					ObjetoFilaThread filaThread = new ObjetoFilaThread();

					filaThread.setNome(mostraTempo.getText());

					filaThread.setEmail(mostraTempo2.getText());

					fila.add(filaThread);
				
				}
				

			}
		});

		jButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				fila.stop();
				
				fila = null;//Matando o objeto para encerrar no sistema operacional

			}
		});

		fila.start();

		add(jpanel, BorderLayout.WEST);// Posicionar a esquerda dentro do Dialog
		/* Sempre será o ultimo comando */
		setVisible(true);/* Torna a tela visivel para o usuário */
	}

}