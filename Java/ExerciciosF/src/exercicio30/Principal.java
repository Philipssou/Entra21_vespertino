package exercicio30;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int gh = Integer.parseInt(JOptionPane.showInputDialog("Quanto ganhastes por hora?")); 
		int ht = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas trabalhastes?"));
		int he = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas extras fizestes?"));
		
		JOptionPane.showMessageDialog(null, "Seu salario bruto é "+gh*ht+" com as horas extras é "+((gh*ht)+(gh*he*2)));
		
		
		
	}

}
