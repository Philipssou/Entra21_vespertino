package exercicio22;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int l1 = Integer.parseInt(JOptionPane.showInputDialog("Informa o comprimento do 1º lado"));
		int l2 = Integer.parseInt(JOptionPane.showInputDialog("Informa o comprimento do 2º lado"));
		int l3 = Integer.parseInt(JOptionPane.showInputDialog("Informa o comprimento do 3º lado"));
		int l4 = Integer.parseInt(JOptionPane.showInputDialog("Informa o comprimento do 4º lado"));
		
		if ((l1 == l2 && l1 == l3 && l1 == l4) || (l2 == l1 && l2 == l3 && l2 == l4) || (l3 == l1 && l3 == l2 && l3 == l4) || (l4 == l1 && l4 == l2 && l4 == l3)) {
		
			JOptionPane.showMessageDialog(null, "É um quadrado");
		}else {
			JOptionPane.showMessageDialog(null, "Não é um quadrado");
		}
	}

}
