package exercicio19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double espaco = Double.parseDouble(JOptionPane.showInputDialog("Informe o espa�o percorrido")); 
		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo o tempo para percorrer o espa�o"));

		JOptionPane.showMessageDialog(null, "A velocidade m�dia ser�: "+espaco/tempo);
		
		
	}

}
