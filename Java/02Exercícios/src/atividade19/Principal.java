package atividade19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		double s = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do espaço percorrido"));
		double t = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo utilizado"));
		
		double vm = s/t;
		
		System.out.println("A velocidade média é de "+vm+" m/s");

	}

}
