package exercicio13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero"));
		
		String mensagem = "Seu numero: "+numero;
			   mensagem+= "\nAntecessor: "+(+numero-1);
			   mensagem+= "\nSucessor: "+(+numero+1);
			   
			   
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
