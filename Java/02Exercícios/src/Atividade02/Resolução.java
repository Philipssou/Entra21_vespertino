package Atividade02;

import javax.swing.JOptionPane;

public class Resolu��o {

	public static void main(String[] args) {
		
		/*Desenvolver um algoritmo onde o cliente ir� informar um valor pago 
		 por determinado produto, em seguida exibir esse valor com 
		 desconto de 10%.*/
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Infrome o valor do produto"));

		JOptionPane.showMessageDialog(null, valor*0.9);
		
				
	}

}
