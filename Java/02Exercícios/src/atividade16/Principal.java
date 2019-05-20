package atividade16;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int nPedido = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero do pedido"));
		double pago = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor pago pelo cliente"));
		
		switch(nPedido) {
		case 1:
			double troco = pago-5;
			if (troco < 0){
				System.out.println("Valor pago pelo cliente insuficiente");
			}else {
				System.out.println("O troco é R$"+troco);
		break;
			}
		case 2:
			double troco1 = pago-4.5;
			if (troco1 < 0){
				System.out.println("Valor pago pelo cliente insuficiente");
			}else {
				System.out.println("O troco é R$"+troco1);
			}
		break;
		case 3:
			double troco2 = pago-8;
			if (troco2 < 0){
				System.out.println("Valor pago pelo cliente insuficiente");
			}else {
				System.out.println("O troco é R$"+troco2);
			}
		break;
		case 4:
			double troco3 = pago-12;
			if (troco3 < 0){
				System.out.println("Valor pago pelo cliente insuficiente");
			}else {
				System.out.println("O troco é R$"+troco3);
			}
		break;
		case 5:
			double troco4 = pago-16.50;
			if (troco4 < 0){
				System.out.println("Valor pago pelo cliente insuficiente");
			}else {
				System.out.println("O troco é R$"+troco4);
			}
		break;
		case 6:
			double troco5 = pago-1;
			if (troco5 < 0){
				System.out.println("Valor pago pelo cliente insuficiente");
			}else {
				System.out.println("O troco é R$"+troco5);
			}
		break;
		case 7:
			double troco6 = pago-2.5;
			if (troco6 < 0){
				System.out.println("Valor pago pelo cliente insuficiente");
			}else {
				System.out.println("O troco é R$"+troco6);
			}
		break;
		default:
			System.out.println("Você finalizou");
	}
	}
}
