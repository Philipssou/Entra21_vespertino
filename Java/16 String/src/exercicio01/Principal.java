package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String palavra;
		String menu = "Palavrinha"+"\n";
		
		
		palavra = JOptionPane.showInputDialog("Insira palavra");
		
		for(int i = 0; i<palavra.length(); i+=2) {
			menu += palavra.toUpperCase().charAt(i);
			menu += palavra.toLowerCase().charAt(i+1);
			
		}
	
		JOptionPane.showMessageDialog(null, menu);
		
	}

}
