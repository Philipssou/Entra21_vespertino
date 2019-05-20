package atividade17;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1"));
		double num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2"));
		
		if(num2 != 0) {
			double result = num1/num2;
		}else {
			System.out.println("Não é possível dividir por 0");
		}
	}

}
