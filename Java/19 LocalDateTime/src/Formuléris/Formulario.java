package Formuléris;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.produto;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;
	private JTextField txtQuantidade;
	private JTable table;
	private JButton btnMostrar;

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
		setBounds(100, 100, 450, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar objeto acao
		acao a = new acao();
		
		JLabel lblNomeDoProduto = new JLabel("Nome do produto");
		lblNomeDoProduto.setBounds(10, 11, 117, 20);
		contentPane.add(lblNomeDoProduto);
		
		JLabel lblValorDoProduto = new JLabel("Valor do produto");
		lblValorDoProduto.setBounds(10, 42, 117, 20);
		contentPane.add(lblValorDoProduto);
		
		JLabel lblQuantidadeDoProduto = new JLabel("Quantidade do produto");
		lblQuantidadeDoProduto.setBounds(10, 73, 142, 20);
		contentPane.add(lblQuantidadeDoProduto);
		
		txtNome = new JTextField();
		txtNome.setBounds(145, 11, 260, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(145, 42, 260, 20);
		contentPane.add(txtValor);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setColumns(10);
		txtQuantidade.setBounds(155, 73, 250, 20);
		contentPane.add(txtQuantidade);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 169, 395, 179);
		contentPane.add(scrollPane);
		scrollPane.setVisible(false);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {

				//Criar um objeto da classe produto
				produto p = new produto();
				p.setNome(txtNome.getText());
				p.setValor(Double.parseDouble(txtQuantidade.getText()));
				p.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
			
					
				//Pegar data
				LocalDateTime tempo = LocalDateTime.now();
				int ano = tempo.getYear();
				int mes = tempo.getMonthValue();
				int dia = tempo.getDayOfMonth();
				int hora = tempo.getHour();
				int minuto = tempo.getMinute();
				
				p.setData(dia+"/"+mes+"/"+ano);
				p.setHora(hora+":"+minuto);
				
				//Realizar o cadastro
				a.cadastrar(p);
				
				//Atualizar a tabela
				table.setModel(a.selecionar());
				
				//Mensagem
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				}catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente");
				}
				
				
				
				//Limpar os campos
				txtNome.setText("");
				txtQuantidade.setText("");
				txtValor.setText("");
				
				//Cursos no campo nome produto
				txtNome.requestFocus();
			}
		});
		btnCadastrar.setBounds(87, 104, 108, 23);
		contentPane.add(btnCadastrar);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setVisible(false);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setVisible(true);
				scrollPane.setVisible(true);
				
			}
		});
		btnMostrar.setBounds(220, 104, 89, 23);
		contentPane.add(btnMostrar);
		
		
		
		
		
	}
}
