package atividade11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua nota 1 "));
		double nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua nota 2 "));
		double nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua nota 3 "));
		double nota4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua nota 4 "));
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o seu nuemro de faltas "));
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if(faltas>15) {
			System.out.println("Aluno reprovado independente da m�dia");
		}else {
			if (media==10) {
				System.out.println("Parab�ns!\nA sua m�dia � "+media);
			}else if(media>=9 && media<=9.9) {
				System.out.println("�timo!\nA sua m�dia � "+media);
			}else if(media >= 7 && media <= 8.9){
				System.out.println("Bom!\nA sua m�dia � "+media);
			}else if(media>=5.1 && media<=6.9) {
				System.out.println("Em Exame!\nA sua m�dia � "+media);
			}else {
				System.out.println("Reprovado!\nA sua m�dia � "+media);
			}
		}
	}

}
