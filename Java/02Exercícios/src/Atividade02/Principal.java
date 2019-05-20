package Atividade02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double produto = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do produto"));
		
		System.out.println("O valor do produto com 10% de desconto é de R$"+produto*0.9);

	}

}
