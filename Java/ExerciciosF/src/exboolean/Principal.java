package exboolean;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		boolean continuar = true;
		
		
		do {
			
			
			int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
			if (valor == 0) {
				continuar = false;
			}
			
		}while (continuar == true);

	}

}
