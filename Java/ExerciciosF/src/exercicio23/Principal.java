package exercicio23;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	 double peso = Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso"));
	 double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura"));	

	 if (peso/(altura*altura) < 17) {
		 JOptionPane.showMessageDialog(null, "Seu IMC é "+peso/(altura*altura)+" e você está muito abaixo da média");
	 
	 }else {
		 if (peso/(altura*altura) >= 17 && peso/(altura*altura) <= 18.49) {
			 JOptionPane.showMessageDialog(null, "Seu IMC é "+peso/(altura*altura)+" e você está abaixo do peso");
		 
		 }else {
			 if (peso/(altura*altura) >= 18.5 && peso/(altura*altura) <= 24.99) {
				 JOptionPane.showMessageDialog(null, "Seu IMC é "+peso/(altura*altura)+" e você está com seu peso normal");
			 }else {
				 if (peso/(altura*altura) >= 25 && peso/(altura*altura) <= 29.99) {
					 JOptionPane.showMessageDialog(null, "Seu IMC é "+peso/(altura*altura)+" e você está acima do peso");
				 }else {
					 if (peso/(altura*altura) >= 30 && peso/(altura*altura) <= 34.99) {
						JOptionPane.showMessageDialog(null, "Seu IMC é "+peso/(altura*altura)+" e você está com obesidade I"); 
					 }else {
						 if (peso/(altura*altura) >= 35 && peso/(altura*altura) <= 39.99) {
							 JOptionPane.showMessageDialog(null, "Seu IMC é "+peso/(altura*altura)+" e você está com obesidade II (severa)"); 
						 }else {
							 if (peso/(altura*altura) > 40) {
								 JOptionPane.showMessageDialog(null, "Seu IMC é "+peso/(altura*altura)+" e você está com obesidade III (morbida)"); 
							 }
						 }
					 }
				 }
			 }
		 }
	 }
	 
	 
	}
}
