package formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;

public class formulario {

		//ArrayList
	public static ArrayList<Pessoa> VetorPessoas = new ArrayList<Pessoa>();
	
		//DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();
	
		
	
	
		//Construtor
		public formulario() {
			
			JFrame f = new JFrame("Projeto base");
			f.setSize(400, 500);
			f.setLayout(null);
			f.setLocationRelativeTo(null);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.add(painelCadastro());
			f.add(painelListarDados());
			f.setVisible(true);
		}
	
		//Metodo de painel para cadastro
		private JPanel painelCadastro() {
			
			JPanel p = new JPanel();
			p.setBounds(10, 10, 362, 180);
			p.setLayout(null);
			p.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
			
			JLabel lblNome = new JLabel("Nome");
			lblNome.setBounds(10, 10, 100, 20);
			JLabel lblIdade = new JLabel("Idade");
			lblIdade.setBounds(10, 50, 100, 20);
			JLabel lblCidade = new JLabel("Cidade");
			lblCidade.setBounds(10, 90, 100, 20);
			
			JTextField txtNome = new JTextField();
			txtNome.setBounds(70, 10, 280, 20);
			JTextField txtIdade = new JTextField();
			txtIdade.setBounds(70, 50, 280, 20);
			JTextField txtCidade = new JTextField();
			txtCidade.setBounds(70, 90, 280, 20);
			
			JButton btn = new JButton("Cadastrar");
			btn.setBounds(130, 130, 100, 20);
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//Obter os dados
					String nome = txtNome.getText();
					int idade = Integer.parseInt(txtIdade.getText());
					String cidade = txtCidade.getText();
					
					//Objeto
					Pessoa p = new Pessoa();
					p.setNome(nome);
					p.setIdade(idade);
					p.setCidade(cidade);
					
					//Adicionar ArrayList
					VetorPessoas.add(p);
					
					//Limpar DefaultTableModel
					dados.setRowCount(0);

					//Adicionar ao defaultTableModel
					for(int i=0; i<VetorPessoas.size(); i++) {
						dados.addRow(new Object[] {
							VetorPessoas.get(i).getNome(),
							VetorPessoas.get(i).getIdade(),
							VetorPessoas.get(i).getCidade(),
					
						});	
					}
				
					//Limpar os campos
					txtNome.setText("");
					txtIdade.setText("");
					txtCidade.setText("");
					
				}
			});
			
			p.add(lblNome);
			p.add(lblIdade);
			p.add(lblCidade);
			p.add(txtNome);
			p.add(txtIdade);
			p.add(txtCidade);
			p.add(btn);
			
			return p;
			
		}
		
		
		
		
		//Metodo de painel para listar os dados
		private JPanel painelListarDados() {
			
			JPanel p = new JPanel();
			p.setBounds(10, 200, 362, 250);
			p.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
			p.setLayout(null);
			
			JScrollPane barra = new JScrollPane(tabela());
			barra.setSize(362, 250);
			
			p.add(barra);
			
			return p;
		}
		
		//Metodo tabela
		private JTable tabela() {
			
			//Dados
			
			dados.addColumn("Nome");
			dados.addColumn("Idade");
			dados.addColumn("Cidades");
			dados.addRow(new Object[] {"Ana", 16, "Blumenau"});
			dados.addRow(new Object[] {"Douglas", 32, "Blumenau"});
			dados.addRow(new Object[] {"Rebeca", 19, "Gaspar"});
			
			//tabela
			JTable tabela = new JTable(dados);
			return tabela;
			
		}
		
		
}
