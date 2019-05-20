package atividade09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1 "));
		double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2 "));
		double numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 3 "));
		
		if(numero1 < numero2 && numero1 < numero3) {
			double menor = numero1;
			System.out.println("O menor é "+menor);
		}else if(numero2 < numero1 && numero2 < numero3) {
			double menor = numero2;
			System.out.println("O menor é "+menor);
		}else {
			double menor = numero3;
			System.out.println("O menor é "+menor);
		}

	}

}
