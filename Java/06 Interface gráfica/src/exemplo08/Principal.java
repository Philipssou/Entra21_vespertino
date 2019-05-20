package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu primeiro formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		//Campo
		JTextArea campo = new JTextArea();
		
		//Barra de rolagem
		JScrollPane barrarolagem = new JScrollPane(campo);
		barrarolagem.setBounds(10, 10, 470, 250);
		
		//Adicionar ao formulario
		formulario.add(barrarolagem);
		
		//Exibir componentes
		formulario.setVisible(true);
		
	}

}
