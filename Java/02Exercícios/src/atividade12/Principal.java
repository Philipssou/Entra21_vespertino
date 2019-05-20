package atividade12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		double vel_permitida = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade permitida"));
		double vel_veiculo = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do veíuclo"));
		double resultado = vel_veiculo - vel_permitida;
		
		if(resultado <= 10 && resultado > 0){
			System.out.println("Multa de R$50");
		}else if(resultado >= 11 && resultado <= 30) {
			System.out.println("Multa de R$100");
		}else if(resultado > 30){
			System.out.println("Multa de R$200");
		}else if(vel_veiculo <= vel_permitida){
			System.out.println("Bom motorista");
		}
	}

}
