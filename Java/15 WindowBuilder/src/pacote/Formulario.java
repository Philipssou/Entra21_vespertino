package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(119, 136, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOButao = new JButton("CLIQUE NO BOT\u00C3O AO LADO");
		btnOButao.setForeground(new Color(0, 0, 205));
		btnOButao.setBackground(new Color(128, 0, 128));
		btnOButao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnOButao.setBounds(10, 91, 191, 63);
		contentPane.add(btnOButao);
		
		btnNewButton = new JButton("BUT\u00C3O");
		btnNewButton.setFont(new Font("Serif", Font.PLAIN, 11));
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.setForeground(new Color(139, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ADO ADO ADO QUEM TA LENDO É VIADO");
			}
		});
		btnNewButton.setBounds(211, 68, 199, 109);
		contentPane.add(btnNewButton);
	}
}
