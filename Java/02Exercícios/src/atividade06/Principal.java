package atividade06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para o numero 1"));
		double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para o numero 2"));
		
		if(numero1 == numero2) {
			JOptionPane.showMessageDialog(null, numero1+numero2);
		}else {
			JOptionPane.showMessageDialog(null, numero1*numero2);
		}

	}

}
