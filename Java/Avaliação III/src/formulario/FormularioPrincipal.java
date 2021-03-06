package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.acao;
import beans.colaborador;
import beans.produto;
import dados.dados;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantidade;
	private JTable table;
	
	//Formulario

	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar ação
		acao a = new acao();
		
		JButton btnNewButton = new JButton("Arroz");
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(10, 27, 125, 47);
		contentPane.add(btnNewButton);
		
		JButton btnFeijao = new JButton("Feijao");
		btnFeijao.setEnabled(false);
		btnFeijao.setBounds(10, 141, 125, 47);
		contentPane.add(btnFeijao);
		
		JButton btnBatata = new JButton("Batata");
		btnBatata.setEnabled(false);
		btnBatata.setBounds(10, 248, 125, 47);
		contentPane.add(btnBatata);
		
		JButton btnRepolho = new JButton("Repolho");
		btnRepolho.setEnabled(false);
		btnRepolho.setBounds(192, 248, 125, 47);
		contentPane.add(btnRepolho);
		
		JButton btnGtxTi = new JButton("Gtx 2080 TI");
		btnGtxTi.setEnabled(false);
		btnGtxTi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGtxTi.setBounds(192, 141, 125, 47);
		contentPane.add(btnGtxTi);
		
		JButton btnMa = new JButton("Ma\u00E7\u00E3");
		btnMa.setEnabled(false);
		btnMa.setBounds(192, 27, 125, 47);
		contentPane.add(btnMa);
		
		JButton btnAlface = new JButton("Alface");
		btnAlface.setEnabled(false);
		btnAlface.setBounds(377, 141, 125, 47);
		contentPane.add(btnAlface);
		
		JButton btnLaranja = new JButton("Laranja");
		btnLaranja.setEnabled(false);
		btnLaranja.setBounds(377, 248, 125, 47);
		contentPane.add(btnLaranja);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(377, 27, 70, 20);
		contentPane.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setEditable(false);
		txtQuantidade.setBounds(377, 51, 96, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JButton btnExibirListaCompleta = new JButton("Exibir lista completa");
		btnExibirListaCompleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				table.setVisible(true);
				try {
					
					//Criar Objeto
					produto p = new produto();
					p.setArroz(Integer.parseInt(txtQuantidade.getText()));
					p.setFeijao(Integer.parseInt(txtQuantidade.getText()));
					p.setAlface(Integer.parseInt(txtQuantidade.getText()));
					p.setBatata(Integer.parseInt(txtQuantidade.getText()));
					p.setAlface(Integer.parseInt(txtQuantidade.getText()));
					p.setGtx(Integer.parseInt(txtQuantidade.getText()));
					p.setLaranja(Integer.parseInt(txtQuantidade.getText()));
					p.setMaça(Integer.parseInt(txtQuantidade.getText()));
					p.setRepolho(Integer.parseInt(txtQuantidade.getText()));
					
					
					//Realizar o cadastro
					a.quantidade(p);
					
					//Atualizar a tabela
					table.setModel(a.selecionar());
					
					//Mensagem
						JOptionPane.showMessageDialog(null, "Informar tabela de produtos");
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao informar, tente novamente");
				}
				
				
				
				
			}
		});
		btnExibirListaCompleta.setBounds(377, 82, 141, 23);
		contentPane.add(btnExibirListaCompleta);
		
		JButton btnSomarArroz = new JButton("+");
		btnSomarArroz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.contar(btnSomarArroz)));
				
			}
		});
		btnSomarArroz.setBounds(10, 85, 41, 20);
		contentPane.add(btnSomarArroz);
		
		JButton btnSomarFeijao = new JButton("+");
		btnSomarFeijao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			txtQuantidade.getText(String.valueOf(a.contar(btnSomarFeijao)));
				
			}
		});
		btnSomarFeijao.setBounds(10, 199, 41, 20);
		contentPane.add(btnSomarFeijao);
		
		JButton btnSomarBatata = new JButton("+");
		btnSomarBatata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			txtQuantidade.getText(String.valueOf(a.contar(btnSomarBatata)));	
				
			}
		});
		btnSomarBatata.setBounds(10, 306, 41, 20);
		contentPane.add(btnSomarBatata);
		
		JButton btnSomarRepolho = new JButton("+");
		btnSomarRepolho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.contar(btnSomarRepolho)));
				
			}
		});
		btnSomarRepolho.setBounds(192, 306, 41, 20);
		contentPane.add(btnSomarRepolho);
		
		JButton btnSomarGtx = new JButton("+");
		btnSomarGtx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.contar(btnSomarGtx)));
				
			}
		});
		btnSomarGtx.setBounds(192, 199, 41, 20);
		contentPane.add(btnSomarGtx);
		
		JButton btnSomarMaça = new JButton("+");
		btnSomarMaça.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.contar(btnSomarMaça)));
				
			}
		});
		btnSomarMaça.setBounds(192, 85, 41, 20);
		contentPane.add(btnSomarMaça);
		
		JButton btnSomarAlface = new JButton("+");
		btnSomarAlface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.contar(btnSomarAlface)));
				
			}
		});
		btnSomarAlface.setBounds(377, 198, 41, 20);
		contentPane.add(btnSomarAlface);
		
		JButton btnSomarLaranja = new JButton("+");
		btnSomarLaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.contar(btnSomarLaranja)));
				
			}
		});
		btnSomarLaranja.setBounds(377, 305, 41, 20);
		contentPane.add(btnSomarLaranja);
		
		JButton bntTirarBatata = new JButton("-");
		bntTirarBatata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.descontar(bntTirarBatata)));
				
			}
		});
		bntTirarBatata.setBounds(94, 306, 41, 20);
		contentPane.add(bntTirarBatata);
		
		JButton bntTirarFeijao = new JButton("-");
		bntTirarFeijao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.descontar(bntTirarFeijao)));
				
			}
		});
		bntTirarFeijao.setBounds(94, 199, 41, 20);
		contentPane.add(bntTirarFeijao);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 337, 508, 180);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setVisible(false);
		
		JButton bntTirarArroz = new JButton("-");
		bntTirarArroz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtQuantidade.getText(String.valueOf(a.descontar(bntTirarArroz)));
				
			}
		});
		bntTirarArroz.setBounds(94, 85, 41, 20);
		contentPane.add(bntTirarArroz);
		
		JButton bntTirarMaça = new JButton("-");
		bntTirarMaça.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.descontar(bntTirarMaça)));
				
			}
		});
		bntTirarMaça.setBounds(276, 85, 41, 20);
		contentPane.add(bntTirarMaça);
		
		JButton bntTirarGtx = new JButton("-");
		bntTirarGtx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.descontar(bntTirarGtx)));
				
			}
		});
		bntTirarGtx.setBounds(276, 198, 41, 20);
		contentPane.add(bntTirarGtx);
		
		JButton bntTirarRepolho = new JButton("-");
		bntTirarRepolho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtQuantidade.getText(String.valueOf(a.descontar(bntTirarRepolho)));
				
			}
		});
		bntTirarRepolho.setBounds(276, 305, 41, 20);
		contentPane.add(bntTirarRepolho);
		
		JButton bntTirarLaranja = new JButton("-");
		bntTirarLaranja.setBounds(461, 305, 41, 20);
		contentPane.add(bntTirarLaranja);
		
		JButton bntTirarAlface = new JButton("-");
		bntTirarAlface.setBounds(461, 199, 41, 20);
		contentPane.add(bntTirarAlface);
		
	}
}
