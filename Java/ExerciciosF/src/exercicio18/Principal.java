package exercicio18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double ld = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do lado direito"));
		double le = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do lado esquerdo"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da base"));
		
		if (ld > (le+b) || le > (ld+b) || b > (le+ld)) {
			JOptionPane.showMessageDialog(null, "N�o � um triangulo");
		}else {
			if ((ld == le && ld == b) || (le == ld && le == b) || (b == le && b == ld)) {
				JOptionPane.showMessageDialog(null, "� um triangulo equil�tero");
			}else {
				if ((le == b && le != ld) || (ld == le && ld != b) || (b == ld && b != le)){
					JOptionPane.showMessageDialog(null, "� um triangulo is�sceles");
				}else {
					if ((le != b && le != ld) || (ld != le && ld != b) || (b != le && b != ld)) {
						JOptionPane.showMessageDialog(null,"� um triangulo escaleno");
					}
				}
			}
		}
		

	}

}
