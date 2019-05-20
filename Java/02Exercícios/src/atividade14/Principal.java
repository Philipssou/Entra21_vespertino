package atividade14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do veiculo"));
		
		if(valor <= 12000) {
			double sem_distribuidor = valor*0.95;
			System.out.println("Valor do veículo sem impostos e percentual de distribuidor R$"+sem_distribuidor);
			System.out.println("Valor arrecadado do distribuidor R$"+(valor-sem_distribuidor));
	
		}else if(valor > 12000 && valor <= 25000){
			double sem_impostos = valor*0.85;
			double sem_distribuidor = valor*0.9;
			double sem_taxas = sem_impostos*0.9;
			System.out.println("Valor do veículo sem impostos e percentual de distribuidor R$"+sem_taxas);
			System.out.println("Valor arrecadado para impostos R$"+(valor-sem_impostos));
			System.out.println("Valor arrecadado para o distribuidor R$"+(valor-sem_distribuidor));
			
		}else if(valor > 25000) {
			double sem_impostos = valor*0.8;
			double sem_distribuidor = valor*0.85;
			double sem_taxas = sem_impostos*0.85;
			System.out.println("Valor do veículo sem impostos e percentual de distribuidor R$"+sem_taxas);
			System.out.println("Valor arrecadado para impostos R$"+(valor-sem_impostos));
			System.out.println("Valor arrecadado para o distribuidor R$"+(valor-sem_distribuidor));
		}
	}

}
