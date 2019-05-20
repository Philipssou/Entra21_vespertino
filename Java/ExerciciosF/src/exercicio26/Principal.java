package exercicio26;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome gracinha");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos aninhos você tem gracinha?"));
		
		if (idade >= 0 && idade <= 4) {
			JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Bebê");
		}else {
			if (idade >= 5 && idade <= 11) {
				JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Criança");
			}else {
				if (idade >= 12 && idade <= 14) {
					JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Adolescente");
				}else {
					if (idade >= 15 && idade <= 30) {
						JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Jovem");
					}else {
						if (idade >= 31 && idade <= 45) {
							JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Maduro");
						}else {
							if (idade >= 46 && idade <= 60) {
								JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Adulto");
							}else {
								if (idade >= 61 && idade <= 75) {
									JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Idoso I");
								}else {
									if (idade >= 76 && idade <= 90) {
										JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Idoso II");
									}else {
										if (idade > 90) {
											JOptionPane.showMessageDialog(null, "Bom dia "+nome+" você é classificado como Idoso III");
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
