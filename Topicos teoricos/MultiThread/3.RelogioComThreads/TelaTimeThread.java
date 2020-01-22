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

public class TelaTimeThread extends JDialog {
	
	private JPanel jpanel = new JPanel(new GridBagLayout());//Painel de componentes

	private JLabel descricaoHora  = new JLabel("Time Thread 1:");
	
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2  = new JLabel("Time Thread 2:");
	
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton jButton = new JButton("Start");
	
	private JButton jButton2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss")
						.format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;
	
	private Thread thread2Time;
	
	public TelaTimeThread() {
		/*Configuraçoes iniciais JavaSwing*/
		setTitle("Minha tela com Thread");
		
		setSize(new Dimension(240,240));
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		/*--------------------------------*/
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//Controlador de pos. de componentes
		
		gridBagConstraints.gridx = 0;
		
		gridBagConstraints.gridy = 0;
		
		gridBagConstraints.gridwidth = 2;
		
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		descricaoHora.setPreferredSize(new Dimension(200,25));
		jpanel.add(descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;//Adicionando uma nova linha para o Text Field
		jpanel.add(mostraTempo, gridBagConstraints);
		
		descricaoHora2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jpanel.add(descricaoHora2,gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy++;
		jpanel.add(mostraTempo2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButton.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jpanel.add(jButton, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx++;
		jpanel.add(jButton2, gridBagConstraints);
		
		mostraTempo.setEditable(false);
		
		mostraTempo2.setEditable(false);
		
		jButton.addActionListener(new ActionListener() {//Será executado quando o botão for clicado.
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread(thread1);
				
				thread2Time = new Thread(thread2);
				
				thread1Time.start();
				
				thread2Time.start();
				
				jButton.setEnabled(false);
				
				jButton2.setEnabled(true);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				
				thread2Time.stop();
				
				jButton.setEnabled(true);
				
				jButton2.setEnabled(false);
			}
		});
		
		jButton2.setEnabled(false);
		
		add(jpanel, BorderLayout.WEST);//Posicionar a esquerda dentro do Dialog
		/*Sempre será o ultimo comando*/
		setVisible(true);/*Torna a tela visivel para o usuário*/
	}

}