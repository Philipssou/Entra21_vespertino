package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String frase;
		int letra = 0;
		
		
		frase = JOptionPane.showInputDialog("Informe uma frase");

		for(int i=0 ;i < frase.length(); i++) {
			
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
				letra++;
			}
						
		}
		
		JOptionPane.showMessageDialog(null, "Total de vogais: "+letra);
		
	}

}
