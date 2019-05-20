package exercicio16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		
		int pedido = Integer.parseInt(JOptionPane.showInputDialog("O que deseja do nosso cardapio?"+"\n1 - Hamburguer + suco de laranja"
		+"\n2 - Sanduiche natural+suco de uva"+"\n3 - Prato do dia"+"\n4 - Pizza"+"\n5 - Lasanha"+"\n6 - Pão de queijo"+"\n7 - Bolo")); 
		double pagamento = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para o pagamento"));
	
		if (pedido == 1) {
			JOptionPane.showMessageDialog(null, "Seu pedido é "+pedido+" com o valor de R$5.00"+" com o troco de "+(pagamento-5));
		}else {
			if (pedido == 2) {
				JOptionPane.showMessageDialog(null, "Seu pedido é "+pedido+" com o valor de R$4.50"+" com o troco de "+(pagamento-4.50));
			}else {
				if (pedido == 3) {
					JOptionPane.showMessageDialog(null, "Seu pedido é "+pedido+" com o valor de R$8.00"+" com o troco de "+(pagamento-8));
				}else {
					if (pedido == 4) {
						JOptionPane.showMessageDialog(null, "Seu pedido é "+pedido+" com o valor de R$12.00"+" com o troco de "+(pagamento-12));
					}else {
						if (pedido == 5) {
							JOptionPane.showMessageDialog(null, "Seu pedido é "+pedido+" com o valor de R$16.50"+" com o troco de "+(pagamento-16.50));
						}else {
							if (pedido == 6) {
								JOptionPane.showMessageDialog(null, "Seu pedido é "+pedido+" com o valor de R$1.00"+" com o troco de "+(pagamento-1));
							}else {
								if (pedido == 7) {
									JOptionPane.showMessageDialog(null, "Seu pedido é "+pedido+" com o valor de R$2.50"+" com o troco de "+(pagamento-2.50));
								}
							}
						}
					}
				}
			}
		}
	
	
	}

}
