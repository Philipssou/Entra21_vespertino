package exercicio24;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Insira seu 1� numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Insira seu 2� numero"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Insira seu 3� numero"));

		//2 1 3
		if (n1 > n2 && n2 > n3) {
			JOptionPane.showMessageDialog(null, "\nA ordem crescente ser� "+"\n"+n1+" \n"+n2+" \n"+n3);
		}else {
			if (n1 > n3 && n3 > n2) {
				JOptionPane.showMessageDialog(null, "\nA ordem crescente ser� "+"\n"+n1+" \n"+n3+" \n"+n2);
			}else { 
				if (n2 > n3 && n3 > n1) {
					JOptionPane.showMessageDialog(null, "\nA ordem crescente ser� "+"\n"+n2+" \n"+n3+" \n"+n1);
				}else {
					if (n2 > n1 && n1 > n3) {
						JOptionPane.showMessageDialog(null, "\nA ordem crescente ser� "+"\n"+n2+" \n"+n1+" \n"+n3);
					}else {
						if (n3 > n1 && n1 > n2) {
							JOptionPane.showMessageDialog(null, "\nA ordem crescente ser� "+"\n"+n3+" \n"+n1+" \n"+n2);
						}else {
							if (n3 > n1 && n1 > n2) {
								JOptionPane.showMessageDialog(null, "\nA ordem crescente ser� "+"\n"+n3+" \n"+n2+" \n"+n1);
							}
								
							}
					}
				
							
						
					
				
			}
		}
			
		
	}

	}
}
