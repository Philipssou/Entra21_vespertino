package Exercicio12;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		
		int vm = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade maxima da via"));
		int vv = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do veiculo"));

		if (vv <= vm) {
			JOptionPane.showMessageDialog(null, "Bom motorista");
		}else {
			if ((vv >= vm+1) && (vv <= vm+10)) {
				JOptionPane.showMessageDialog(null, "Multa de R$50");
			}else {
				if ((vv >= vm+11) && (vv <= vm+30)) {
					JOptionPane.showMessageDialog(null, "Multa de R$100");
				}else {
					if (vv > vm+30) {
						JOptionPane.showMessageDialog(null, "Multa de R$200");
					}
				}
			}
		}
		
	}

}
