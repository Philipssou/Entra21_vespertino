package atividade20;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		int opcaoEstado = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)RJ\n2)SC\n3)RS"));
		
		if (opcaoEstado == 1) {
			int opcaoCidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)Niter�i\n2)Saquarema\n3)Rio de Janeiro"));
			if(opcaoCidade == 1) {
				System.out.println("Voc� escolheu Niter�i!");
				System.out.println("\nPopula��o: 487.562 \nIDH: 0,837 \nClima: Tropical");
			}else if(opcaoCidade == 2) {
				System.out.println("Voc� escolheu Saquarema!");
				System.out.println("\nPopula�ao: 87.704 \nIDH: 0,709 \nFesta mais famosa: Nossa Senhora de Nazareth ");
			} else if(opcaoCidade == 3) {
				System.out.println("Voc� escolheu Rio de Janeiro");
				System.out.println("\nPopula��o: 6.688.927 \nIDH: 0,799 \nIdade:454 anos");
			}else {
				System.out.println("Cidade invalida");
			}
		}else if(opcaoEstado == 2) {
			int opcaoCidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)Blumenau \n2)Joinville \n3)Florian�polis"));
			
			if(opcaoCidade == 1) {
				System.out.println("Voc� escolheu Blumenau!");
				System.out.println("\nPopula��o: 334.002 \nIDH: 0,806 \nTem a festa mais alem� do Brasil> Oktoberfest");
			}else if(opcaoCidade == 2){
				System.out.println("Voc� escolheu Joinville!");
				System.out.println("\nPopula��o: 583.144 \nIDH: 0,809 \nGent�lico: Joinvillense");
			}else if(opcaoCidade==3) {
				System.out.println("Voc� escolheu Florian�polis!");
				System.out.println("\nPopula��o: 492.977 \nIDH: 0,847 \nClima: subtropical �mido");
			}else {
				System.out.println("Cdiade inv�lida");
			}
		}else if(opcaoEstado == 3) {
			int opcaoCidade = Integer.parseInt(JOptionPane.showInputDialog("Escolha \n1)Santa Rosa \n2)Pelotas \n3)Caxias do Sul"));
			if(opcaoCidade == 1) {
				System.out.println("Voc� escolheu Santa Rosa!");
				System.out.println("\nPopula��o:72.919 \nIDH:0,831  \nPrincipal Evento:Feira Nacional da Soja");
			}else if(opcaoCidade == 2) {
				System.out.println("Voc� escolheu Pelotas!");
				System.out.println("\nPopula�ao: 341.648 \nIDH: 0,739 \nClima: Subtropical");
			}else if(opcaoCidade == 3) {
				System.out.println("Voc� escolheu Caxias do Sul!");
				System.out.println("\nPopula��o: 504.069 \nIDH:0,782 \nPonto tur�stico: Museu Ambi�ncia Casa de Pedra");
			}else {
				System.out.println("Cidade inv�lida");
			}
		}else {
			System.out.println("Estado inv�lido");
		}
	}	
}
