package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeDeUsuarioLogin;
	private JTextField txtSenhaLogin;

	
	/**
	 * Create the frame.
	 */
	public LoginFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 450, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar a a��o
		acao a = new acao();
		
		
		JLabel lblLoginSiteDo = new JLabel("Login Site do Ben10000 vers\u00E3o turma da monica tunada");
		lblLoginSiteDo.setForeground(Color.WHITE);
		lblLoginSiteDo.setBackground(Color.WHITE);
		lblLoginSiteDo.setFont(new Font("MS PGothic", Font.PLAIN, 13));
		lblLoginSiteDo.setBounds(56, 11, 337, 44);
		contentPane.add(lblLoginSiteDo);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				//Formulario login
				LoginFormulario frame = new LoginFormulario();
				frame.setVisible(true);
				
				//Formulario cadastro
				Cadastro frame2 = new Cadastro();
				frame2.setVisible(true);
				
				
				
				
			}
		});
		btnEntrar.setFont(new Font("Nirmala UI", Font.PLAIN, 14));
		btnEntrar.setBounds(163, 166, 108, 28);
		contentPane.add(btnEntrar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(-2, -2, 437, 71);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(1, 69, 433, 136);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtNomeDeUsuarioLogin = new JTextField();
		txtNomeDeUsuarioLogin.setBounds(165, 11, 245, 20);
		panel_1.add(txtNomeDeUsuarioLogin);
		txtNomeDeUsuarioLogin.setColumns(10);
		
		txtSenhaLogin = new JTextField();
		txtSenhaLogin.setColumns(10);
		txtSenhaLogin.setBounds(164, 56, 245, 20);
		panel_1.add(txtSenhaLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(107, 51, 92, 30);
		panel_1.add(lblSenha);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de Usu\u00E1rio");
		lblNomeDeUsurio.setBounds(59, 8, 104, 30);
		panel_1.add(lblNomeDeUsurio);
		lblNomeDeUsurio.setForeground(Color.WHITE);
		lblNomeDeUsurio.setFont(new Font("Sitka Text", Font.PLAIN, 12));
	}
}
