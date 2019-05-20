package exercicio17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu dividendo"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira seu divisor"));
		
		JOptionPane.showMessageDialog(null, "Seu quociente é "+n1/n2);
		
	}

}
