package Atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		String cidade = JOptionPane.showInputDialog("Informe a cidade onde voc� mora");
		
		System.out.println("Ol� "+nome + ", voc� tem "+idade + " anos de idade e mora em "+cidade);

	}

}
