package Atividade01;

import javax.swing.JOptionPane;

public class Resolução {

	public static void main(String[] args) {
		
		/*1. Desenvolver um algoritmo onde o usuário deverá informar: 
		 * Nome, idade e cidade onde mora. Vamos supor que os dados foram:
		 * Amanda, 25, Curitiba.*/
		
		/*P.S.Após informados os três dados deverá ser exibida uma frase 
		  concatenada como por exemplo: Olá Amanda, você tem 25 anos de idade 
		  e mora em Curitiba.*/
		
	 String nome = JOptionPane.showInputDialog("Qual o seu nome?");
	 int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
	 String cidade = JOptionPane.showInputDialog("Onde você mora?");
	
	 JOptionPane.showMessageDialog(null, "Olá "+nome + ", você tem "+idade + " anos de idade e mora em "+cidade + "." );
	
	}
	}