package exercicio27;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual teu ano xuxu?"));
 
		if (ano%4 == 0) {
			JOptionPane.showMessageDialog(null, "O ano é bissexto meu docinho de coco");
		}else {
			JOptionPane.showMessageDialog(null, "Não é ano bissexto");
		}
		
	}

}
