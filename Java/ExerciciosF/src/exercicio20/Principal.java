package exercicio20;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//int est = Integer.parseInt(JOptionPane.showInputDialog("Informe o estado que deseja conhecer"+"\n1 -  Santa Catarina"+"\n2 - Rio grande do sul"+"\n3 - Párana"));
		Object[] estados = {"Santa Catarina", "Paraná", "São Paulo"};
		Object[] cidades1 = {"Blumenau", "Gaspar", "Ilhota"};
		Object[] cidades2 = {"Curitiba", "Londrina", "Maringá"};
		Object[] cidades3 = {"São Paulo", "Ribeirão Preto", "Campinas"};
		
		//Obter o estado
		int estado = JOptionPane.showOptionDialog(null, "Informe o estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, estados, 0);
		int cidade;
		
		//Ações por estado
		switch (estado) {
		case 0:
			cidade = JOptionPane.showOptionDialog(null, "Informe o estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidades1, 0);
		
			switch(cidade) {
				case 0:
					JOptionPane.showMessageDialog(null, "População de Blumenau: 334 002 habitantes com IDH de 0,806 e sua principal festa é a Oktoberfest.");
				break;
			}
			
			switch (cidade) {
				case 1:
					JOptionPane.showMessageDialog(null, "População de Gaspar: 66 213 habitantes com IDH de 0,765 e sua principal festa é Gaspar não tem festa.");
				break;
			}
			switch (cidade) {
			case 2:
				JOptionPane.showMessageDialog(null, "População de Gaspar: 13 857 habitantes com IDH de 0,738 e sua principal festa é a da igreja.");
				break;

			}
			
		break;

		
		
		
		
		
		
		
		
		
		
		case 1:
			cidade = JOptionPane.showOptionDialog(null, "Informe o estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidades2, 0);
			
			switch (cidade) {
			case 0:
				JOptionPane.showMessageDialog(null, "População de Curitiba: 1 917 185 habitantes com IDH de 0.823 e sua principal festa é a Feira de São Francisco da Ordem.");
				break;
			}
			switch (cidade) {
			case 1:
				JOptionPane.showMessageDialog(null, "População de Londrina: 563 943 habitantes com IDH de 0.778 e sua principal festa é a Exposição Agropecuária e Industrial .");
				break;
			}
			switch (cidade) {
			case 2:
				JOptionPane.showMessageDialog(null, "População de Maringá: 417 010 habitantes com IDH de 0.808 e sua principal festa é a Expo Imin.");
				break;
			}
			
		break;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		case 2:
			cidade = JOptionPane.showOptionDialog(null, "Informe o estado", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cidades3, 0);
			
			switch (cidade) {
			case 0:
				JOptionPane.showMessageDialog(null, "População de São Paulo: 12 176 866 habitantes com IDH de 0.805 e sua principal festa é a Festa de Nossa Senhora de Achiropita.");
				break;
			}
			switch (cidade) {
			case 1:
				JOptionPane.showMessageDialog(null, "População de Ribeirão Preto: 666,323 habitantes com IDH de 0.763 e sua principal festa é Rodeio.");
				break;
			}
			switch (cidade) {
			case 2:
				JOptionPane.showMessageDialog(null, "População de Campinas: 1 194 094 habitantes com IDH de 0.805 e sua principal festa é a Festa do Boi Falo.");
				break;
			}
			
		break;

		}
		
		
		
		
		
		
		
		

	}

}
