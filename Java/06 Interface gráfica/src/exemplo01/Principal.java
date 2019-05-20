package exemplo01;

import java.awt.Color;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		//Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu primeiro formulário");
		formulario.setSize(800, 800);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.getContentPane().setBackground(new Color(156, 193, 252));
		
		

		//Exibir componentes
		formulario.setVisible(true);
		
	}

}
