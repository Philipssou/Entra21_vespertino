
package exercicio32;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int orc = Integer.parseInt(JOptionPane.showInputDialog("Informe o orçamento"));
		
		JOptionPane.showMessageDialog(null, "Orçamento 30 dias: "+orc*1.05+"\nOrçamento 60 dias: "+orc*1.10+"\nOrçamento 90 dias: "+orc*1.20+"\nOrçamento 120 dias: "+orc*1.30+"\nOrçamento 180 dias: "+orc*1.40+"\nOrçamento 270 dias: "+orc*1.50);
		

	}

}
