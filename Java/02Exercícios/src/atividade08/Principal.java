package atividade08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 1"));
		double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero 2"));
		String opcao = JOptionPane.showInputDialog("Informe a opcao: ");
		double resultado = 0;
		
		if(opcao.equals("soma")) {
			resultado = numero1 + numero2;
			System.out.println(numero1+" + "+numero2+" = "+resultado);
		}else if(opcao.equals("subtração")){
			resultado = numero1 - numero2;
			System.out.println(numero1+" - "+numero2+" = "+resultado);
		}else if(opcao.equals("divisão")){
			resultado = numero1/numero2;
			System.out.println(numero1+" / "+numero2+" = "+resultado);
		}else if(opcao.equals("multiplicação")) {
			resultado = numero1*numero2;
			System.out.println(numero1+" x "+numero2+" = "+resultado);
		}else {
			System.out.println("Operação informada inválida. Tente novamente.");
		}
	}

}
