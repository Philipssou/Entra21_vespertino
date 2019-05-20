package exercicio28;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		 
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insere teu numero ai xuxu"));
			
		if (n%2 == 0) {
			JOptionPane.showMessageDialog(null, "É par");
		}else {
			JOptionPane.showMessageDialog(null, "É impar");
		}
		
	}

}
