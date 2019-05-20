package exercicio29;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		int hora = Integer.parseInt(JOptionPane.showInputDialog("Que horas são?"));
		int pais = Integer.parseInt(JOptionPane.showInputDialog("Escolha um pais"+"\n1 - Estados unidos"+"\n2 - Alemanha"+"\n3 - Inglaterra"));
	
		if (pais == 1) {
			JOptionPane.showMessageDialog(null, "O horario nos Estados Unidos agora é "+(hora-2));
		}else {
			if (pais == 2 ) {
				JOptionPane.showMessageDialog(null, "O horario na Alemanha agora é "+(hora+5));
			}else {
				if (pais == 3) {
					JOptionPane.showMessageDialog(null, "O horario agora na Inglaterra agora é "+(hora+4));
				}
			}
		}
	
	
	}

}
