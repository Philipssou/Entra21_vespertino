package atividade10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int qtde_01 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 1 centavo"));
		int qtde_05 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 5 centavos"));
		int qtde_10 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 10 centavos"));
		int qtde_25 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 25 centavos"));
		int qtde_50 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 50 centavos"));
		int qtde_1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de moedas de 1 real"));
		
		double resultado = (qtde_01*0.01) + (qtde_05*0.05) + (qtde_10*0.10) + (qtde_25*0.25) + (qtde_50*0.5) + (qtde_1*1);
		System.out.println("R$"+resultado);
		
	}

}
