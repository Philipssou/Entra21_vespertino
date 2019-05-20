package exercicio14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	 double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do veículo"));
	
	 if (valor <= 12000) {
		 JOptionPane.showMessageDialog(null, "O valor final é "+valor+" percentual do distribuidor"+((+valor*0.95)-valor));
	 }else {
		 if (valor >= 12001 && valor <= 25000) {
			 JOptionPane.showMessageDialog(null, "O valor final é "+valor+" percentual do distruibuidor "+((valor*0.90)-valor)+" com impostos de "+((+valor*0.85)-valor));
		 }else {
			 if (valor > 25000) {
				 JOptionPane.showMessageDialog(null, "O valor final é "+valor+" percentual do distruibuidor "+((valor*0.85)-valor)+" com impostos de "+((+valor*0.80)-valor)); 
			 }
		 }
	 }
		
	}

}
