package exercicio15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int quarto = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao 3 Peixinhos motel"+"\n Escolha seu quarto"+"\nQuarto simples-1"+"\nQuarto duplo-2"+"\nSuite de luxo com hidromassagem-3"));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias irão desejar ficar?"));
		
		if (quarto == 1) {
			JOptionPane.showMessageDialog(null, "Total a pagar R$ "+dias*45);
		}else {
			if (quarto == 2) {
				JOptionPane.showMessageDialog(null, "Total a pagar R$ "+dias*65);
			}else {
				if (quarto == 3) {
					JOptionPane.showMessageDialog(null, "Total a pagar R$ "+dias*110);
				}
			}
		}
		
	}

}
