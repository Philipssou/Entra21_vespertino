package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formul�rio
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu primeiro formul�rio");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		//Criar um r�tulo
		JLabel rotulo = new JLabel();
		rotulo.setBounds(30, 30, 150, 20);
		rotulo.setText("Informe seu nome");
	
		//Criar um campo de texto
		JTextField campo = new JTextField();
		campo.setBounds(180, 30, 290, 20);
		
		//Criar um bot�o
		JButton botao = new JButton();
		botao.setText("Bot�o");
		botao.setBounds(180, 70, 100, 30);
		
		//A��o no bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter o nome informado
				String nome = campo.getText();
				
				//Exibir uma mensagem
				JOptionPane.showMessageDialog(null, "Ol� "+nome);
				
				//Limpar o campo de texto
				campo.setText("");
				
				//Deixar o cursor selecionado no campo
				campo.requestFocus();
				
			}
		});
		
		//Adicionar elementos ao formul�rio
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);
	
		//Exibir formul�rio e seus componentes internos
		formulario.setVisible(true);
		
		
	}

}
