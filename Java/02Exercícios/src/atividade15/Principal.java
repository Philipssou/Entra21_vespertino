package atividade15;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1) Apto simples \n2) Apto duplo \n3)Su�te luxo"));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias de estadia no hotel"));
		
		switch(opcao) {
		case 1:
			System.out.println("O pre�o da estadia � R$"+(dias*45));
		break;
		
		case 2:
			System.out.println("O pre�o da estadia � R$"+(dias*65));
		break;
		
		case 3:
			System.out.println("O pre�o da estadia � R$"+(dias*110));
		break;
		
		default:
			System.out.println("Voc� finalizou");
		}
	}

}
