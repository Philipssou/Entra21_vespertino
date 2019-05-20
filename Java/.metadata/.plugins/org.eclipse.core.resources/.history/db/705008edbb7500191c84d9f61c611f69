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
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeDeUsuario;
	private JTextField txtSenha;
	private JTextField txtEmail;
	
	
	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 150, 490, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Instanciar acao
		acao a = new acao();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 128, 114));
		panel_1.setBounds(0, 0, 474, 274);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCadastramentoHabboHotel = new JLabel("CADASTRAMENTO HABBO HOTEL VIRUS 2019");
		lblCadastramentoHabboHotel.setBounds(65, 11, 325, 18);
		panel_1.add(lblCadastramentoHabboHotel);
		lblCadastramentoHabboHotel.setForeground(new Color(0, 0, 0));
		lblCadastramentoHabboHotel.setFont(new Font("Swis721 Hv BT", Font.PLAIN, 14));
		
		JLabel lblNomeDeUsurio = new JLabel("Nome de Usu\u00E1rio");
		lblNomeDeUsurio.setBounds(0, 63, 108, 24);
		panel_1.add(lblNomeDeUsurio);
		lblNomeDeUsurio.setForeground(Color.WHITE);
		lblNomeDeUsurio.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 98, 88, 24);
		panel_1.add(lblSenha);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de Usu\u00E1rio");
		lblTipoDeUsurio.setBounds(10, 133, 108, 24);
		panel_1.add(lblTipoDeUsurio);
		lblTipoDeUsurio.setForeground(Color.WHITE);
		lblTipoDeUsurio.setFont(new Font("Verdana", Font.BOLD, 11));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 168, 88, 24);
		panel_1.add(lblEmail);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 11));

		JComboBox cbxTipoDeUsuario = new JComboBox();
		cbxTipoDeUsuario.setBounds(128, 135, 336, 22);
		panel_1.add(cbxTipoDeUsuario);
		cbxTipoDeUsuario.addItem("Administrador");
		cbxTipoDeUsuario.addItem("Membro mortal");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(161, 225, 142, 38);
		panel_1.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
				//Criar um objeto da classe logins
				login l = new login();
				l.setNome(txtNomeDeUsuario.getText());
				l.setSenha(txtSenha.getText());
				l.setEmail(txtEmail.getText());
				l.setUsario(cbxTipoDeUsuario.getSelectedItem().toString());
				
				//Cadastrar
				a.cadastrar(l);
				
				//Atualizar tabela
				FormularioAlterar.table.setModel(a.selecionar());
				
				
				JOptionPane.showMessageDialog(null, "Novo usuário cadastrado com sucesso");
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "DEU ERO PIÁ TENTA DENOVO GURI!");
			}
				
				// LIMPAR CURSOR
				txtNomeDeUsuario.setText("");
				txtSenha.setText("");
				txtEmail.setText("");
				cbxTipoDeUsuario.setSelectedItem(0);
				
			}	
		});
		
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setFont(new Font("Segoe UI Historic", Font.BOLD, 11));
		
		
		
		txtNomeDeUsuario = new JTextField();
		txtNomeDeUsuario.setBounds(130, 66, 334, 20);
		panel_1.add(txtNomeDeUsuario);
		txtNomeDeUsuario.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(130, 101, 334, 20);
		panel_1.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(130, 171, 334, 20);
		panel_1.add(txtEmail);
		txtEmail.setBackground(new Color(255, 255, 255));
		txtEmail.setColumns(10);
	}
}
