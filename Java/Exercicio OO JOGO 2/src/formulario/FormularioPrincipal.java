package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.Jogo;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;
	private JTextField txtClassi;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar ação
		acao a = new acao();
		
		txtNome = new JTextField();
		txtNome.setBounds(142, 8, 304, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(142, 108, 304, 20);
		contentPane.add(txtValor);
		
		txtClassi = new JTextField();
		txtClassi.setColumns(10);
		txtClassi.setBounds(142, 83, 304, 20);
		contentPane.add(txtClassi);
		
		
		
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(0, 0, 48, 14);
		contentPane.add(lblIndice);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 202, 436, 308);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Atualizar tabela
				try {
					
					 //Criar um objeto da classe Jogo
					 Jogo j = new Jogo();
					 j.setNome(txtNome.getText());
					 
					
					 j.setClassificacao(Integer.parseInt(txtClassi.getText()));
					 j.setValor(Double.parseDouble(txtValor.getText()));
					 
					//Realizar o cadastro
					a.cadastrar(j);
					
					//Atualizar a tabela
					table.setModel(a.selecionar());
					
						//Mensagem
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
					}catch(Exception erro) {
						JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente");
					}
					
					//Limpar os campos
					txtNome.setText("");
					
					
					txtClassi.setText("");
					txtValor.setText("");
					
					//Cursos no campo nome jogo
					txtNome.requestFocus();
					
			}
		});
		btnCadastrar.setBounds(49, 168, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton bntAlterar = new JButton("Alterar");
		bntAlterar.setBounds(177, 168, 89, 23);
		contentPane.add(bntAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(319, 168, 89, 23);
		contentPane.add(btnExcluir);
		
		JComboBox CbxGenero = new JComboBox();
		CbxGenero.setBounds(142, 32, 304, 22);
		contentPane.add(CbxGenero);
		 CbxGenero.addItem("Suspense");
		 CbxGenero.addItem("Açao");
		 CbxGenero.addItem("Mae do gustavo");
		
		JComboBox CbxPlat = new JComboBox();
		CbxPlat.setBounds(142, 57, 304, 22);
		contentPane.add(CbxPlat);
		 CbxPlat.addItem("PC");
		 CbxPlat.addItem("XBOX");
		 CbxPlat.addItem("PS4");
		 
		 JTextArea lblNome = new JTextArea();
		 lblNome.setText("Nome do Jogo");
		 lblNome.setBounds(10, 6, 104, 22);
		 contentPane.add(lblNome);
		 
		 JTextArea lblGen = new JTextArea();
		 lblGen.setText("Genero");
		 lblGen.setBounds(10, 31, 104, 22);
		 contentPane.add(lblGen);
		 
		 JTextArea lblPlat = new JTextArea();
		 lblPlat.setText("Plataforma");
		 lblPlat.setBounds(10, 56, 104, 22);
		 contentPane.add(lblPlat);
		 
		 JTextArea lblClassificacao = new JTextArea();
		 lblClassificacao.setText("Classifica\u00E7\u00E3o");
		 lblClassificacao.setBounds(10, 81, 104, 22);
		 contentPane.add(lblClassificacao);
		 
		 JTextArea lblValor = new JTextArea();
		 lblValor.setText("Valor");
		 lblValor.setBounds(10, 106, 104, 22);
		 contentPane.add(lblValor);
		
	}
}
