package Atividade01;

import javax.swing.JOptionPane;

public class Resolu��o {

	public static void main(String[] args) {
		
		/*1. Desenvolver um algoritmo onde o usu�rio dever� informar: 
		 * Nome, idade e cidade onde mora. Vamos supor que os dados foram:
		 * Amanda, 25, Curitiba.*/
		
		/*P.S.Ap�s informados os tr�s dados dever� ser exibida uma frase 
		  concatenada como por exemplo: Ol� Amanda, voc� tem 25 anos de idade 
		  e mora em Curitiba.*/
		
	 String nome = JOptionPane.showInputDialog("Qual o seu nome?");
	 int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
	 String cidade = JOptionPane.showInputDialog("Onde voc� mora?");
	
	 JOptionPane.showMessageDialog(null, "Ol� "+nome + ", voc� tem "+idade + " anos de idade e mora em "+cidade + "." );
	
	}
	}