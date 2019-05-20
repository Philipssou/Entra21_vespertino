package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int lmax = 100;
		int lmin = 0;
		int chute;
		int contador = 0;
		
		
		double gerarAleatorio = Math.random();
		
		int numero = (int) Math.round(lmin+gerarAleatorio*lmax);
		
		JOptionPane.showMessageDialog(null, numero);
		
		do{
		chute = Integer.parseInt(JOptionPane.showInputDialog("Chuta um número ai irmão"));
		int diferenca = chute -numero;
		
		if (diferenca == 0) {
			JOptionPane.showMessageDialog(null, "ACERTOU!!!");
		}
		else if  (diferenca <= 10 && diferenca >= -10) {
			JOptionPane.showMessageDialog(null, "Está perto");
		}else if (diferenca <= 20 && diferenca >= -20) {
			JOptionPane.showMessageDialog(null, "Está longe");	
		}else if (diferenca < 20 && diferenca > -20) {
			JOptionPane.showMessageDialog(null, "IHHHH MUITO LONGE!");
		}
		contador++;
		
		}while (chute != numero);
		
		if (chute == numero && contador == 1) {
		JOptionPane.showMessageDialog(null, "Acertou na mosca");
		}
		
		else if (chute == numero && (contador > 1 && contador <= 5)) {
			JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");
			}
		
		else if (chute == numero && (contador > 5 && contador <=10)) {
			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");
			}
		
		else if (chute == numero && (contador > 10 && contador <= 20)) {
			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");
			}
		else if (chute == numero && contador > 20) {
			JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?");
		}
	
}
	
}	
