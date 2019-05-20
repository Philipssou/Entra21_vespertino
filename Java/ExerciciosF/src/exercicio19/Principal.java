package exercicio19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double espaco = Double.parseDouble(JOptionPane.showInputDialog("Informe o espaço percorrido")); 
		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo o tempo para percorrer o espaço"));

		JOptionPane.showMessageDialog(null, "A velocidade média será: "+espaco/tempo);
		
		
	}

}
