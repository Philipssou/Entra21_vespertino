package atividade20;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int opcaoEstado = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)RJ\n2)SC\n3)RS"));
		
		if (opcaoEstado == 1) {
			int opcaoCidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)Niterói\n2)Saquarema\n3)Rio de Janeiro"));
			if(opcaoCidade == 1) {
				System.out.println("Você escolheu Niterói!");
				System.out.println("\nPopulação: 487.562 \nIDH: 0,837 \nClima: Tropical");
			}else if(opcaoCidade == 2) {
				System.out.println("Você escolheu Saquarema!");
				System.out.println("\nPopulaçao: 87.704 \nIDH: 0,709 \nFesta mais famosa: Nossa Senhora de Nazareth ");
			} else if(opcaoCidade == 3) {
				System.out.println("Você escolheu Rio de Janeiro");
				System.out.println("\nPopulação: 6.688.927 \nIDH: 0,799 \nIdade:454 anos");
			}else {
				System.out.println("Cidade invalida");
			}
		}else if(opcaoEstado == 2) {
			int opcaoCidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)Blumenau \n2)Joinville \n3)Florianópolis"));
			
			if(opcaoCidade == 1) {
				System.out.println("Você escolheu Blumenau!");
				System.out.println("\nPopulação: 334.002 \nIDH: 0,806 \nTem a festa mais alemã do Brasil> Oktoberfest");
			}else if(opcaoCidade == 2){
				System.out.println("Você escolheu Joinville!");
				System.out.println("\nPopulação: 583.144 \nIDH: 0,809 \nGentílico: Joinvillense");
			}else if(opcaoCidade==3) {
				System.out.println("Você escolheu Florianópolis!");
				System.out.println("\nPopulação: 492.977 \nIDH: 0,847 \nClima: subtropical úmido");
			}else {
				System.out.println("Cdiade inválida");
			}
		}else if(opcaoEstado == 3) {
			int opcaoCidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)Santa Rosa \n2)Pelotas \n3)Caxias do Sul"));
			if(opcaoCidade == 1) {
				System.out.println("Você escolheu Santa Rosa!");
				System.out.println("\nPopulação:72.919 \nIDH:0,831  \nPrincipal Evento:Feira Nacional da Soja");
			}else if(opcaoCidade == 2) {
				System.out.println("Você escolheu Pelotas!");
				System.out.println("\nPopulaçao: 341.648 \nIDH: 0,739 \nClima: Subtropical");
			}else if(opcaoCidade == 3) {
				System.out.println("Você escolheu Caxias do Sul!");
				System.out.println("\nPopulação: 504.069 \nIDH:0,782 \nPonto turístico: Museu Ambiência Casa de Pedra");
			}else {
				System.out.println("Cidade inválida");
			}
		}else {
			System.out.println("Estado inválido");
		}
	}	
}
