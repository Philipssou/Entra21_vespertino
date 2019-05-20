package atividade04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do produto");
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto"));
		String forma = JOptionPane.showInputDialog("Informe a forma de pagamento");
		
		if(valor > 500) {
			if(forma.equals("à vista")) {
				JOptionPane.showMessageDialog(null, "O produto "+nome+ "custará R$"+valor*0.9);
			}else {
				JOptionPane.showMessageDialog(null, "O produto "+nome+ " custará R$"+valor);
			}
		}else {
			JOptionPane.showMessageDialog(null, "O produto "+nome+ " custará R$"+valor);
		}

	}

}
