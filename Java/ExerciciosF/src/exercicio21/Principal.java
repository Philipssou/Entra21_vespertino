package exercicio21;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
	Object[] roupa = {"Cal�a", "Camisa", "Casaco", "Meias", "Palit�"};	
	Object[] forma = {"� vista", "A prazo 1x", "A prazo 2x"};	
			
	int roupas = JOptionPane.showOptionDialog(null, "Informe a roupa", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, roupa, 0);	
	int formas;
	
	switch (roupas) {
	case 0:
		formas = JOptionPane.showOptionDialog(null, "Informe a forma", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
		
			switch (formas) {
				case 0:
					JOptionPane.showMessageDialog(null, "O pre�o ser� de R$150");
				break;

				case 1:
					JOptionPane.showMessageDialog(null, "O pre�o ser� de R$165");
					break;
	
				case 2:
					JOptionPane.showMessageDialog(null, "O pre�o ser� de R$180");
					break;
				}
	break;
	
	case 1:
		formas = JOptionPane.showOptionDialog(null, "Informe a forma", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
		
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$300");
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$330");
				break;

			case 2:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$360");
				break;
			}
		
		break;	
			
	
		case 2:
			formas = JOptionPane.showOptionDialog(null, "Informe a forma", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
			
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "O Pre�o ser� de R$250");
				break;
	
			case 1:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$275");
				break;
	
			case 2:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$300");
				break;
			}
		break;
		
		case 3:
			formas = JOptionPane.showOptionDialog(null, "Informe a forma", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);	
			
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$30");
				break;
				
			case 1:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$33");
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$36");
				break;
			}
		break;
			
		case 4:
			formas = JOptionPane.showOptionDialog(null, "Informe a forma", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, forma, 0);
	
			switch (formas) {
			case 0:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$450");
				break;
			
			case 1:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$495");
				break;
				
			case 2:
				JOptionPane.showMessageDialog(null, "O pre�o ser� de R$540");
				break;
				}
			break;
	
	
	
	
	}
	
	
	
	}
}
