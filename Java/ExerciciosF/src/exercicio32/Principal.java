
package exercicio32;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int orc = Integer.parseInt(JOptionPane.showInputDialog("Informe o or�amento"));
		
		JOptionPane.showMessageDialog(null, "Or�amento 30 dias: "+orc*1.05+"\nOr�amento 60 dias: "+orc*1.10+"\nOr�amento 90 dias: "+orc*1.20+"\nOr�amento 120 dias: "+orc*1.30+"\nOr�amento 180 dias: "+orc*1.40+"\nOr�amento 270 dias: "+orc*1.50);
		

	}

}
