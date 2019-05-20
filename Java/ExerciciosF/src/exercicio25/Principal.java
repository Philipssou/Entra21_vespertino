package exercicio25;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Que horas são?"));
		
		if (hora >= 0 && hora <= 6) {
			JOptionPane.showMessageDialog(null, "Boa madrugada");
		}else {
			if (hora >= 7 && hora <= 11) {
				JOptionPane.showMessageDialog(null, "Bom dia");
			}else {
				if (hora >= 12 && hora <= 18) {
					JOptionPane.showMessageDialog(null, "Boa tarde");
				}else {
					if (hora >= 19 && hora <= 23) {
						JOptionPane.showInputDialog("Boa noite");
					}
				}
			}
		}
	}

}
