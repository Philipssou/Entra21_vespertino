package atividade05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe um dia do mês de fevereiro de 2018"));
		
		if(dia >= 1 && dia <= 28) {
			
			if (dia == 3 || dia == 4 || dia == 10 || dia == 11 || dia == 17 || dia == 18 || dia == 24 || dia == 25) {
				JOptionPane.showMessageDialog(null, "Fim de semana");
			} else {
				JOptionPane.showMessageDialog(null, "Dia de semana");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Data inválida");
		}
	}

}
