package exemplo09;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formul�rio
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu primeiro formul�rio");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		//DefaultTableModel (Englobar os dados)
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("nome");
		dados.addColumn("idade");
		dados.addRow(new Object[] {"Yara", "26"});
		dados.addRow(new Object[] {"Tayler", "18"});
		dados.addRow(new Object[] {"Vanessa", "22"});
		dados.addRow(new Object[] {"Roan", "14"});
		
		//Exibir os dados
		JTable tabela = new JTable(dados);
		
		//JScrollPane (Barra de rolagem)
		JScrollPane barrarolagem = new JScrollPane(tabela);
		barrarolagem.setBounds(10, 10, 465, 230);
		
		//Adicionar ao formulario
		formulario.add(barrarolagem);
		
		//Exibir componentes
		formulario.setVisible(true);

	}

}
