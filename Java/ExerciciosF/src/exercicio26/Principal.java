package exercicio26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome gracinha");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos aninhos voc� tem gracinha?"));
		
		if (idade >= 0 && idade <= 4) {
			JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Beb�");
		}else {
			if (idade >= 5 && idade <= 11) {
				JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Crian�a");
			}else {
				if (idade >= 12 && idade <= 14) {
					JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Adolescente");
				}else {
					if (idade >= 15 && idade <= 30) {
						JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Jovem");
					}else {
						if (idade >= 31 && idade <= 45) {
							JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Maduro");
						}else {
							if (idade >= 46 && idade <= 60) {
								JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Adulto");
							}else {
								if (idade >= 61 && idade <= 75) {
									JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Idoso I");
								}else {
									if (idade >= 76 && idade <= 90) {
										JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Idoso II");
									}else {
										if (idade > 90) {
											JOptionPane.showMessageDialog(null, "Bom dia "+nome+" voc� � classificado como Idoso III");
										}else {
									}
								}
							}
						}
					}
				}
			}
		}
		
		
	}
	}
}
