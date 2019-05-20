package Atividade03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua nota 1 "));
		double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua nota 2 "));
		double nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua nota 3 "));
		double nota4 = Integer.parseInt(JOptionPane.showInputDialog("Informe sua nota 4 "));
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(media >= 7 && media <= 10) {
			System.out.println("Aprovado com média "+media);
		} else if(media >= 5 && media <= 6.9) {
			System.out.println("Em exame com média "+media);
		}else {
			System.out.println("Reprovado com média "+media);
		}
		
	}

}
